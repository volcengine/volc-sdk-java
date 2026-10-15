package com.volcengine.model.tls.stats;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class DeltaAdapterTest {
    private static CounterSample sample(String instance, long generation, long sequence,
                                        long capturedAt, long uptime, long value) {
        return sample(instance, generation, sequence, capturedAt, uptime,
                Collections.singletonMap("requests_total", value), false);
    }

    private static CounterSample sample(String instance, long generation, long sequence,
                                        long capturedAt, long uptime,
                                        Map<String, Long> counters, boolean disabled) {
        MetricsLevel level = disabled ? MetricsLevel.OFF : MetricsLevel.CORE;
        long capabilities = disabled ? 0L : Capability.OPERATIONAL;
        SnapshotHeader header = new SnapshotHeader(
                instance, ComponentType.PRODUCER, capturedAt, uptime, sequence,
                LifecycleState.RUNNING, Consistency.WEAK, level, StatsView.OPERATIONAL,
                false, capabilities, Collections.<MissingSection>emptyList(),
                generation, 1_000L);
        return new CounterSample(header, counters);
    }

    @Test
    public void computesRateAndCopiesInputAndResultMaps() {
        DeltaAdapter adapter = new DeltaAdapter();
        Map<String, Long> firstCounters = new HashMap<>();
        firstCounters.put("requests_total", 10L);
        CounterSample first = sample("one", 1L, 1L, 1_000L, 1_000L, firstCounters, false);
        assertEquals(DeltaResetReason.INITIAL_BASELINE, adapter.observe(first).getResetReason());
        firstCounters.put("requests_total", 999L);

        DeltaResult result = adapter.observe(sample("one", 1L, 2L, 3_000L, 3_000L, 16L));
        assertTrue(result.isValid());
        assertEquals(2_000L, result.getIntervalMs());
        assertEquals(Long.valueOf(6L), result.getDeltas().get("requests_total"));
        assertEquals(Double.valueOf(3D), result.getRatesPerSecond().get("requests_total"));
        try {
            result.getDeltas().put("requests_total", 1L);
            fail("delta map must be immutable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
        assertNotNull(first.getCounters());
        assertEquals(Long.valueOf(10L), first.getCounters().get("requests_total"));
    }

    @Test
    public void invalidIntervalsUseGoReasonOrderAndRebaseline() {
        Object[][] cases = {
                {"instance", sample("two", 1L, 2L, 2_000L, 2_000L, 11L),
                        DeltaResetReason.INSTANCE_CHANGED},
                {"generation", sample("one", 2L, 2L, 2_000L, 2_000L, 11L),
                        DeltaResetReason.COLLECTION_CHANGED},
                {"sequence", sample("one", 1L, 1L, 2_000L, 2_000L, 11L),
                        DeltaResetReason.SEQUENCE_NOT_INCREASING},
                {"uptime", sample("one", 1L, 2L, 2_000L, 500L, 11L),
                        DeltaResetReason.UPTIME_REGRESSED},
                {"capture time", sample("one", 1L, 2L, 1_000L, 2_000L, 11L),
                        DeltaResetReason.CAPTURE_TIME_NOT_INCREASING},
                {"counter", sample("one", 1L, 2L, 2_000L, 2_000L, 9L),
                        DeltaResetReason.COUNTER_REGRESSED}
        };
        for (Object[] testCase : cases) {
            DeltaAdapter adapter = new DeltaAdapter();
            adapter.observe(sample("one", 1L, 1L, 1_000L, 1_000L, 10L));
            DeltaResult invalid = adapter.observe((CounterSample) testCase[1]);
            assertFalse((String) testCase[0], invalid.isValid());
            assertEquals(testCase[2], invalid.getResetReason());
            assertNull(invalid.getDeltas());
            assertNull(invalid.getRatesPerSecond());

            CounterSample next = sample("one", 1L, 3L, 3_000L, 3_000L, 12L);
            if (testCase[2] == DeltaResetReason.INSTANCE_CHANGED) {
                next = sample("two", 1L, 3L, 3_000L, 3_000L, 12L);
            } else if (testCase[2] == DeltaResetReason.COLLECTION_CHANGED) {
                next = sample("one", 2L, 3L, 3_000L, 3_000L, 12L);
            }
            assertTrue((String) testCase[0], adapter.observe(next).isValid());
        }
    }

    @Test
    public void equalUptimeIsAllowedAndCounterSetChangesReset() {
        DeltaAdapter adapter = new DeltaAdapter();
        adapter.observe(sample("one", 1L, 1L, 1_000L, 1_000L, 10L));
        DeltaResult equalUptime = adapter.observe(sample("one", 1L, 2L, 2_000L, 1_000L, 11L));
        assertTrue(equalUptime.isValid());
        assertEquals(1_000L, equalUptime.getIntervalMs());

        Map<String, Long> changedCounters = new HashMap<>();
        changedCounters.put("requests_total", 12L);
        changedCounters.put("new_total", 1L);
        DeltaResult changed = adapter.observe(sample("one", 1L, 3L, 3_000L, 1_000L,
                changedCounters, false));
        assertFalse(changed.isValid());
        assertEquals(DeltaResetReason.COUNTER_SET_CHANGED, changed.getResetReason());

        Map<String, Long> stableCounters = new HashMap<>();
        stableCounters.put("requests_total", 13L);
        stableCounters.put("new_total", 2L);
        assertTrue(adapter.observe(sample("one", 1L, 4L, 4_000L, 1_000L,
                stableCounters, false)).isValid());
    }

    @Test
    public void unavailableMetricsAndResetDoNotInventRates() {
        DeltaAdapter adapter = new DeltaAdapter();
        assertEquals(DeltaResetReason.METRICS_UNAVAILABLE,
                adapter.observe(sample("one", 1L, 1L, 1_000L, 1_000L, null, true)).getResetReason());
        assertEquals(DeltaResetReason.METRICS_UNAVAILABLE,
                adapter.observe(sample("one", 1L, 2L, 2_000L, 2_000L, 10L)).getResetReason());
        assertTrue(adapter.observe(sample("one", 1L, 3L, 3_000L, 3_000L, 11L)).isValid());

        adapter.reset();
        DeltaResult baseline = adapter.observe(sample("one", 1L, 4L, 4_000L, 4_000L, 12L));
        assertFalse(baseline.isValid());
        assertEquals(DeltaResetReason.INITIAL_BASELINE, baseline.getResetReason());
        assertNull(baseline.getDeltas());
        assertNull(baseline.getRatesPerSecond());
    }

    @Test
    public void statelessComputeAndJsonFollowGoShape() {
        DeltaResult result = DeltaAdapter.computeDelta(
                sample("one", 1L, 1L, 1_000L, 1_000L, 10L),
                sample("one", 1L, 2L, 2_000L, 1_000L, 12L));
        assertTrue(result.isValid());
        assertEquals("{\"valid\":true,\"interval_ms\":1000,"
                        + "\"deltas\":{\"requests_total\":2},"
                        + "\"rates_per_second\":{\"requests_total\":2.0}}",
                result.toJson());

        DeltaResult invalid = DeltaAdapter.computeDelta(
                sample("one", 1L, 2L, 2_000L, 1_000L, 12L),
                sample("one", 1L, 2L, 3_000L, 1_000L, 13L));
        assertEquals("{\"valid\":false,\"reset_reason\":\"sequence_not_increasing\"}",
                invalid.toJson());
    }

    @Test
    public void counterSampleRejectsBrokenValuesAndCopiesMap() {
        Map<String, Long> input = new HashMap<>();
        input.put("requests_total", 1L);
        CounterSample sample = sample("one", 1L, 1L, 1_000L, 1_000L, input, false);
        input.put("requests_total", 2L);
        assertEquals(Long.valueOf(1L), sample.getCounters().get("requests_total"));
        try {
            sample.getCounters().put("requests_total", 2L);
            fail("counter map must be immutable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
        invalidCounter(Collections.<String, Long>singletonMap("broken", -1L));
        Map<String, Long> nullValue = new HashMap<>();
        nullValue.put("broken", null);
        invalidCounter(nullValue);
        Map<String, Long> nullKey = new HashMap<>();
        nullKey.put(null, 1L);
        invalidCounter(nullKey);
    }

    private static void invalidCounter(Map<String, Long> counters) {
        try {
            new CounterSample(sample("one", 1L, 1L, 1_000L, 1_000L, 0L).getHeader(), counters);
            fail("invalid counter map must be rejected");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
}
