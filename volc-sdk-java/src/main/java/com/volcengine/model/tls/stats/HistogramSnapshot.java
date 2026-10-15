package com.volcengine.model.tls.stats;

/** Immutable latency histogram snapshot. */
public final class HistogramSnapshot {
    private static final long[] FAST_BOUNDS_MS = {
            1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000
    };
    private static final long[] SLOW_BOUNDS_MS = {
            10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 20000, 50000,
            100000, 200000, 300000
    };

    private final String bucketProfile;
    private final long[] upperBoundsMs;
    private final long[] cumulativeBucketCounts;
    private final long count;
    private final double sumMs;

    /** Fixed-profile constructor used by FixedHistogram. */
    public HistogramSnapshot(String bucketProfile, long[] cumulativeBucketCounts,
                             long count, double sumMs) {
        this(bucketProfile, boundsForProfile(bucketProfile), cumulativeBucketCounts, count, sumMs);
    }

    /** Constructor for a caller that already holds the frozen profile bounds. */
    public HistogramSnapshot(String bucketProfile, long[] upperBoundsMs,
                             long[] cumulativeBucketCounts, long count, double sumMs) {
        if (bucketProfile == null || upperBoundsMs == null || cumulativeBucketCounts == null) {
            throw new IllegalArgumentException("histogram profile and arrays are required");
        }
        long[] expectedBounds = boundsForProfile(bucketProfile);
        if (expectedBounds.length != upperBoundsMs.length) {
            throw new IllegalArgumentException("histogram bounds do not match profile");
        }
        for (int i = 0; i < expectedBounds.length; i++) {
            if (expectedBounds[i] != upperBoundsMs[i]) {
                throw new IllegalArgumentException("histogram bounds do not match profile");
            }
        }
        if (cumulativeBucketCounts.length != upperBoundsMs.length + 1) {
            throw new IllegalArgumentException("histogram bucket count does not match profile");
        }
        long previous = 0L;
        for (long value : cumulativeBucketCounts) {
            if (value < previous) {
                throw new IllegalArgumentException("histogram buckets must be cumulative and non-negative");
            }
            previous = value;
        }
        if (count < 0L || count != cumulativeBucketCounts[cumulativeBucketCounts.length - 1]) {
            throw new IllegalArgumentException("histogram count must equal the +Inf bucket");
        }
        if (sumMs < 0D || Double.isNaN(sumMs) || Double.isInfinite(sumMs)) {
            throw new IllegalArgumentException("histogram sum must be finite and non-negative");
        }
        this.bucketProfile = bucketProfile;
        this.upperBoundsMs = upperBoundsMs.clone();
        this.cumulativeBucketCounts = cumulativeBucketCounts.clone();
        this.count = count;
        this.sumMs = sumMs;
    }

    /** Returns a defensive copy of the frozen bounds for a supported profile. */
    public static long[] boundsForProfile(String bucketProfile) {
        if ("fast_v1".equals(bucketProfile)) return FAST_BOUNDS_MS.clone();
        if ("slow_v1".equals(bucketProfile)) return SLOW_BOUNDS_MS.clone();
        throw new IllegalArgumentException("unsupported histogram profile: " + bucketProfile);
    }

    public String getBucketProfile() { return bucketProfile; }
    public String getUnit() { return "ms"; }
    public long[] getUpperBoundsMs() { return upperBoundsMs.clone(); }
    public long[] getFiniteUpperBoundsMs() { return upperBoundsMs.clone(); }
    public long[] getCumulativeBucketCounts() { return cumulativeBucketCounts.clone(); }
    public long getCount() { return count; }
    public double getSumMs() { return sumMs; }

    public String toJson() {
        return new JsonWriter().str("bucket_profile", bucketProfile)
                .raw("upper_bounds_ms", JsonWriter.longArray(upperBoundsMs))
                .raw("cumulative_bucket_counts", JsonWriter.longArray(cumulativeBucketCounts))
                .num("count", count).num("sum_ms", sumMs).end();
    }

    @Override
    public String toString() { return toJson(); }
}
