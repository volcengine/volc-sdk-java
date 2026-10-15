package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.HistogramSnapshot;
import java.lang.reflect.Field;
import org.junit.Test;

import static org.junit.Assert.*;

/** Fixed-profile histogram checks. */
public class FixedHistogramTest {
    @Test
    public void fastProfileUsesUpperInclusiveBoundsAndDefensiveCopies() {
        FixedHistogram histogram = new FixedHistogram(1000, FixedHistogram.Profile.FAST);
        assertEquals(64, histogram.getStripeCount());
        assertEquals(14, histogram.getBucketCount());
        histogram.record(1);
        histogram.record(1.1);
        histogram.record(10000);
        histogram.record(10001);
        HistogramSnapshot snapshot = histogram.snapshot();
        assertEquals("fast_v1", snapshot.getBucketProfile());
        assertEquals(4, snapshot.getCount());
        assertEquals(1, snapshot.getCumulativeBucketCounts()[0]);
        assertEquals(2, snapshot.getCumulativeBucketCounts()[1]);
        assertEquals(3, snapshot.getCumulativeBucketCounts()[12]);
        assertEquals(4, snapshot.getCumulativeBucketCounts()[13]);
        long[] copy = snapshot.getCumulativeBucketCounts();
        copy[13] = 0;
        assertEquals(4, snapshot.getCumulativeBucketCounts()[13]);
    }

    @Test
    public void slowProfileHasItsOwnBoundsAndBucketShape() {
        FixedHistogram histogram = new FixedHistogram(1, FixedHistogram.Profile.SLOW);
        assertEquals(1, histogram.getStripeCount());
        assertEquals(16, histogram.getBucketCount());
        histogram.record(10);
        histogram.record(300000);
        histogram.record(300001);
        HistogramSnapshot snapshot = histogram.snapshot();
        assertEquals("slow_v1", snapshot.getBucketProfile());
        assertEquals(3, snapshot.getCount());
        assertEquals(1, snapshot.getCumulativeBucketCounts()[0]);
        assertEquals(2, snapshot.getCumulativeBucketCounts()[14]);
        assertEquals(3, snapshot.getCumulativeBucketCounts()[15]);
    }

    @Test
    public void nonPositiveStripeCountsNormalizeToOne() {
        assertEquals(1, new FixedHistogram(0).getStripeCount());
        assertEquals(1, new FixedHistogram(-17).getStripeCount());
    }

    @Test
    public void invalidDurationsClampToFiniteEndpointBuckets() {
        FixedHistogram histogram = new FixedHistogram(3, FixedHistogram.Profile.FAST);
        histogram.record(Double.NaN, 0);
        histogram.record(-1D, 0);
        histogram.record(Double.NEGATIVE_INFINITY, 0);
        histogram.record(Double.POSITIVE_INFINITY, 0);

        HistogramSnapshot snapshot = histogram.snapshot();
        assertEquals(4, snapshot.getCount());
        assertEquals(3, snapshot.getCumulativeBucketCounts()[0]);
        assertEquals(4, snapshot.getCumulativeBucketCounts()[snapshot.getCumulativeBucketCounts().length - 1]);
        assertEquals(10001D, snapshot.getSumMs(), 0D);
        assertCumulativeConservation(snapshot);
    }

    @Test
    public void extremeNegativeStripeHintStillSelectsAValidStripe() {
        FixedHistogram histogram = new FixedHistogram(3, FixedHistogram.Profile.FAST);
        histogram.record(1D, Integer.MIN_VALUE);

        HistogramSnapshot snapshot = histogram.snapshot();
        assertEquals(1, snapshot.getCount());
        assertEquals(1, snapshot.getCumulativeBucketCounts()[0]);
        assertCumulativeConservation(snapshot);
    }

    @Test
    public void recordAndCrossStripeAggregationSaturateLongCount() throws Exception {
        FixedHistogram histogram = new FixedHistogram(2, FixedHistogram.Profile.FAST);
        Object[] stripes = stripes(histogram);
        setStripeCount(stripes[0], Long.MAX_VALUE - 1L);
        setStripeBucket(stripes[0], 0, Long.MAX_VALUE - 1L);

        histogram.record(1D, 0);
        histogram.record(1D, 0); // Already at MAX_VALUE: the record path must not wrap.
        setStripeCount(stripes[1], 1L);
        setStripeBucket(stripes[1], 1, 1L);

        HistogramSnapshot snapshot = histogram.snapshot();
        assertEquals(Long.MAX_VALUE, snapshot.getCount());
        assertEquals(Long.MAX_VALUE, snapshot.getCumulativeBucketCounts()[0]);
        assertEquals(Long.MAX_VALUE,
                snapshot.getCumulativeBucketCounts()[snapshot.getCumulativeBucketCounts().length - 1]);
        assertCumulativeConservation(snapshot);
    }

    @Test
    public void recordAndCrossStripeAggregationSaturateDoubleSum() throws Exception {
        FixedHistogram histogram = new FixedHistogram(2, FixedHistogram.Profile.FAST);
        Object[] stripes = stripes(histogram);
        setStripeSum(stripes[0], Double.MAX_VALUE);
        histogram.record(Double.MAX_VALUE, 0);
        setStripeSum(stripes[1], Double.MAX_VALUE);

        HistogramSnapshot snapshot = histogram.snapshot();
        assertEquals(Double.MAX_VALUE, snapshot.getSumMs(), 0D);
        assertEquals(1, snapshot.getCount());
        assertCumulativeConservation(snapshot);
    }

    @Test
    public void snapshotRejectsBrokenProfileAndCumulativeContracts() {
        assertInvalid(new long[13], 0, 0D);
        long[] nonCumulative = new long[14];
        nonCumulative[0] = 2;
        nonCumulative[1] = 1;
        assertInvalid("fast_v1", nonCumulative, 1, 1D);

        long[] mismatchedTotal = new long[14];
        mismatchedTotal[13] = 1;
        assertInvalid("fast_v1", mismatchedTotal, 0, 1D);
        assertInvalid("fast_v1", new long[14], 0, Double.NaN);
        assertInvalid("fast_v1", new long[14], 0, -1D);
    }

    private static void assertInvalid(long[] counts, long count, double sum) {
        assertInvalid("fast_v1", counts, count, sum);
    }

    private static void assertInvalid(String profile, long[] counts, long count, double sum) {
        try {
            new HistogramSnapshot(profile, counts, count, sum);
            fail("invalid histogram must be rejected");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    private static void assertCumulativeConservation(HistogramSnapshot snapshot) {
        long[] cumulative = snapshot.getCumulativeBucketCounts();
        assertEquals(snapshot.getCount(), cumulative[cumulative.length - 1]);
        for (int i = 0; i < cumulative.length; i++) {
            assertTrue("cumulative bucket must not be negative", cumulative[i] >= 0L);
            if (i > 0) {
                assertTrue("cumulative buckets must be monotonic", cumulative[i] >= cumulative[i - 1]);
            }
        }
    }

    private static Object[] stripes(FixedHistogram histogram) throws Exception {
        Field field = FixedHistogram.class.getDeclaredField("stripes");
        field.setAccessible(true);
        return (Object[]) field.get(histogram);
    }

    private static void setStripeCount(Object stripe, long count) throws Exception {
        Field field = stripe.getClass().getDeclaredField("count");
        field.setAccessible(true);
        field.setLong(stripe, count);
    }

    private static void setStripeBucket(Object stripe, int bucket, long count) throws Exception {
        Field field = stripe.getClass().getDeclaredField("counts");
        field.setAccessible(true);
        ((long[]) field.get(stripe))[bucket] = count;
    }

    private static void setStripeSum(Object stripe, double sum) throws Exception {
        Field field = stripe.getClass().getDeclaredField("sumMs");
        field.setAccessible(true);
        field.setDouble(stripe, sum);
    }
}
