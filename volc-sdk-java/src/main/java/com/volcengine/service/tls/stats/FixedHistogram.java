package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.HistogramSnapshot;

import java.util.concurrent.locks.ReentrantLock;

/**
 * A fixed-bucket latency histogram with a bounded number of stripes for low-contention recording on
 * hot paths. Internal per-stripe storage is NON-cumulative; {@link #snapshot()} aggregates the
 * stripes and converts to cumulative counts.
 *
 * <p>Design constraints:
 * <ul>
 *   <li>Bucket bounds are fixed and upper-inclusive
 *       ({@code duration <= bound}); an implicit trailing +Inf bucket captures the rest.</li>
 *   <li>Durations are measured with a monotonic clock in double milliseconds.</li>
 *   <li>Stripe count is bounded (Producer uses up to 64; Consumer fewer) so memory does not grow
 *       per thread.</li>
 *   <li>{@code snapshot()} briefly locks each stripe and copies fixed-length arrays only — it never
 *       touches network, callbacks or business queues.</li>
 * </ul>
 *
 * <p>Snapshot invariants: {@code count == cumulative[last] == sum(non-cumulative)},
 * {@code cumulative} monotonically non-decreasing, {@code sumMs >= 0}.
 */
public final class FixedHistogram {

    public enum Profile {
        FAST("fast_v1"), SLOW("slow_v1");
        private final String wireName;
        Profile(String wireName) { this.wireName = wireName; }
    }

    /** Hard cap on stripes to bound memory regardless of thread count. */
    public static final int MAX_STRIPES = 64;

    private final long[] bounds;
    private final Profile profile;
    private final int bucketCount;   // bounds.length + 1 (the +Inf bucket)
    private final int stripeCount;
    private final Stripe[] stripes;

    private static final class Stripe {
        final ReentrantLock lock = new ReentrantLock();
        final long[] counts;   // non-cumulative, length bucketCount
        long count;
        double sumMs;

        Stripe(int bucketCount) {
            this.counts = new long[bucketCount];
        }
    }

    /**
     * @param stripeCount desired stripe count; clamped to {@code [1, MAX_STRIPES]}
     */
    public FixedHistogram(int stripeCount) {
        this(stripeCount, Profile.FAST);
    }

    public FixedHistogram(int stripeCount, Profile profile) {
        if (profile == null) throw new IllegalArgumentException("histogram profile must not be null");
        this.profile = profile;
        this.bounds = HistogramSnapshot.boundsForProfile(profile.wireName);
        this.bucketCount = bounds.length + 1;
        int clamped = stripeCount;
        if (clamped < 1) {
            clamped = 1;
        }
        if (clamped > MAX_STRIPES) {
            clamped = MAX_STRIPES;
        }
        this.stripeCount = clamped;
        this.stripes = new Stripe[clamped];
        for (int i = 0; i < clamped; i++) {
            stripes[i] = new Stripe(bucketCount);
        }
    }

    /** Returns the bucket index for a duration using upper-inclusive bounds; +Inf is the last index. */
    int bucketIndexFor(double ms) {
        for (int i = 0; i < bounds.length; i++) {
            if (ms <= bounds[i]) {
                return i;
            }
        }
        return bounds.length; // +Inf bucket
    }

    /**
     * Records an observation on a stripe selected by {@code stripeHint} (e.g. a sender index). The
     * hint is mapped into the stripe range with a sign-safe modulo so callers may pass any int.
     * Negative or NaN durations are clamped to 0 so a bad measurement never corrupts the histogram.
     */
    public void record(double ms, int stripeHint) {
        double v = ms;
        if (Double.isNaN(v) || v < 0) {
            v = 0;
        } else if (Double.isInfinite(v)) {
            v = bounds[bounds.length - 1] + 1D;
        }
        int idx = bucketIndexFor(v);
        int s = stripeHint % stripeCount;
        if (s < 0) {
            s += stripeCount;
        }
        Stripe stripe = stripes[s];
        stripe.lock.lock();
        try {
            stripe.counts[idx] = saturatedAdd(stripe.counts[idx], 1L);
            stripe.count = saturatedAdd(stripe.count, 1L);
            double sum = stripe.sumMs + v;
            stripe.sumMs = Double.isInfinite(sum) ? Double.MAX_VALUE : sum;
        } finally {
            stripe.lock.unlock();
        }
    }

    /** Convenience for single-threaded/low-contention callers. */
    public void record(double ms) {
        record(ms, 0);
    }

    /**
     * Aggregates all stripes and returns an immutable cumulative snapshot. Each stripe is briefly
     * locked to copy fixed-length arrays; no other resource is held.
     */
    public HistogramSnapshot snapshot() {
        long[] aggregate = new long[bucketCount];
        long totalCount = 0;
        double totalSum = 0;
        for (Stripe stripe : stripes) {
            stripe.lock.lock();
            try {
                for (int i = 0; i < bucketCount; i++) {
                    aggregate[i] = saturatedAdd(aggregate[i], stripe.counts[i]);
                }
                totalCount = saturatedAdd(totalCount, stripe.count);
                double sum = totalSum + stripe.sumMs;
                totalSum = Double.isInfinite(sum) ? Double.MAX_VALUE : sum;
            } finally {
                stripe.lock.unlock();
            }
        }
        long[] cumulative = new long[bucketCount];
        long running = 0;
        for (int i = 0; i < bucketCount; i++) {
            running = saturatedAdd(running, aggregate[i]);
            cumulative[i] = running;
        }
        // running now equals totalCount; the last cumulative element is the +Inf bucket == count.
        return new HistogramSnapshot(profile.wireName, cumulative, totalCount, totalSum);
    }

    private static long saturatedAdd(long current, long delta) {
        if (current == Long.MAX_VALUE || delta == Long.MAX_VALUE || delta > Long.MAX_VALUE - current) {
            return Long.MAX_VALUE;
        }
        return current + delta;
    }

    public int getStripeCount() {
        return stripeCount;
    }

    public int getBucketCount() {
        return bucketCount;
    }
}
