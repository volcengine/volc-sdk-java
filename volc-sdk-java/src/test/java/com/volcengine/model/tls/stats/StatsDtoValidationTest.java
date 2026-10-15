package com.volcengine.model.tls.stats;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/** DTO validation checks for the public observability model. */
public class StatsDtoValidationTest {
    @Test
    public void scalarAndPressureFactsRejectInvalidWireValues() {
        WorkerSummary workers = new WorkerSummary(0L, 0L, 0L, 0L);
        invalid(() -> new ProducerHealthSignals(null, null, -1D, null, null, null,
                workers, Collections.<CriticalFlag>emptyList()));
        invalid(() -> new ProducerHealthSignals(null, null, null, Double.NaN, null, null,
                workers, Collections.<CriticalFlag>emptyList()));
        invalid(() -> new ProducerHealthSignals(null, null, null, null,
                Double.POSITIVE_INFINITY, null, workers,
                Collections.<CriticalFlag>emptyList()));
        invalid(() -> new QueueSummary(2L, 1L, 2L, true));
        invalid(() -> new QueueSummary(1L, null, 2L, true));
        invalid(() -> new WorkerSummary(1, 2, 0, 0));
        invalid(() -> new WorkerRoleStats(WorkerRole.SENDER, 1, 2, 0));
    }

    @Test
    public void memoryAndFixedCountersRejectBrokenInvariants() {
        invalid(() -> new ManagedMemorySummary(100, 0, 101, 101, 0, 101, 0, 0, 0));
        invalid(() -> new ManagedMemorySummary(100, 0, 10, 10, 0, 9, 0, 0, 0));
        invalid(() -> new ManagedMemoryBreakdown(-1, 0, 0, 0, 0));
        invalid(() -> new ManagedMemoryBreakdown(Long.MAX_VALUE, 1, 0, 0, 0));
        invalid(() -> new ProducerRetryDetails(new QueueSummary(0L, null, 0L, false), -1L));
        invalid(() -> new ConsumerRetryDetails(-1L));
        invalid(() -> new WorkerDetails(-1L, Collections.<WorkerDetail>emptyList()));
        invalid(() -> new WorkerDetail(WorkerRole.SENDER, -1, 0, 0L));
    }

    @Test
    public void healthFactsRejectNegativeOrBrokenState() {
        WorkerSummary workers = new WorkerSummary(0, 0, 0, 0);
        invalid(() -> new ProducerHealthSignals(-1L, null, 0D, 0D, 0D, null, workers,
                Collections.<CriticalFlag>emptyList()));
        invalid(() -> new ProducerHealthSignals(null, null, Double.NaN, null, null, null, workers,
                Collections.<CriticalFlag>emptyList()));
        invalid(() -> new ProducerHealthSignals(null, null, null, null, null, -1L, workers,
                Collections.<CriticalFlag>emptyList()));
        invalid(() -> new ConsumerHealthSignals(-1L, null, workers,
                Collections.<CriticalFlag>emptyList()));
        invalid(() -> new ConsumerHealthSignals(null, null, null,
                Collections.<CriticalFlag>emptyList()));
        ProducerHealthSignals overload = new ProducerHealthSignals(null, null, 1.125D,
                1.0D, 1.125D, null, workers, Collections.<CriticalFlag>emptyList());
        assertEquals(Double.valueOf(1.125D), overload.getMemoryPressure());
    }

    @Test
    public void headersExposeStableIdentityAndRejectOrderingContradictions() {
        invalid(() -> new SnapshotHeader("i", ComponentType.PRODUCER, -1, 0, 0,
                LifecycleState.NEW, Consistency.WEAK, MetricsLevel.OFF, StatsView.HEALTH,
                true, 0, Arrays.asList(MissingSection.HEALTH,
                MissingSection.OPERATIONAL, MissingSection.MANAGED_MEMORY), 0, 0));
        invalid(() -> new SnapshotHeader("i", ComponentType.PRODUCER, 1, 0, 0,
                LifecycleState.NEW, Consistency.WEAK, MetricsLevel.CORE, StatsView.HEALTH,
                true, 0, Arrays.asList(MissingSection.OPERATIONAL,
                MissingSection.HEALTH), 0, 0));
        invalid(() -> new SnapshotHeader("i", ComponentType.PRODUCER, 1, 0, 0,
                LifecycleState.NEW, Consistency.WEAK, MetricsLevel.CORE, StatsView.HEALTH,
                true, 0, Arrays.asList(MissingSection.HEALTH,
                MissingSection.HEALTH), 0, 0));

        long healthCaps = Capability.HEALTH | Capability.OPERATIONAL | Capability.MANAGED;
        SnapshotHeader complete = new SnapshotHeader("i", ComponentType.PRODUCER, 1, 0, 1,
                LifecycleState.RUNNING, Consistency.WEAK, MetricsLevel.CORE, StatsView.HEALTH,
                false, healthCaps, Collections.<MissingSection>emptyList(), 4, 1);
        assertEquals(SnapshotHeader.SCHEMA_VERSION, complete.getSchemaVersion());
        assertEquals(4, complete.getCollectionGeneration());
        assertEquals(1, complete.getCollectionStartedAtUnixMs());
        // Projections may be unavailable when the corresponding DTO was not collected;
        // they must not synthesize a zero-valued health section.
        ProducerStatsSnapshot empty = new ProducerStatsSnapshot(complete, null, null,
                null, null, null, null, null);
        assertFalse(empty.getHealth().isPresent());
        assertFalse(empty.toJson().contains("\"health\""));

        long producerDetailedOnly = healthCaps | Capability.WORKER_DETAILS
                | Capability.RETRY_DETAILS | Capability.LATENCY | Capability.MEMORY_BREAKDOWN;
        SnapshotHeader inconsistentProjection = new SnapshotHeader("i", ComponentType.PRODUCER,
                1, 0, 1, LifecycleState.RUNNING, Consistency.WEAK, MetricsLevel.CORE,
                StatsView.DEBUG, false, producerDetailedOnly,
                Collections.<MissingSection>emptyList(), 0, 0);
        invalid(() -> new ProducerStatsSnapshot(inconsistentProjection, null, null,
                null, null, null, null, null));

        invalid(() -> new SnapshotHeader("i", ComponentType.CONSUMER, 1, 0, 1,
                LifecycleState.RUNNING, Consistency.WEAK, MetricsLevel.DETAILED, StatsView.DEBUG,
                false, Capability.MANAGED, Collections.<MissingSection>emptyList(), 0, 0));
    }

    @Test
    public void saturatedCountersRemainObservableWithCriticalFlag() {
        WorkerSummary workers = new WorkerSummary(0, 0, 0, 0);
        ProducerHealthSignals producerHealth = new ProducerHealthSignals(null, null,
                null, null, null, null, workers,
                Collections.singletonList(CriticalFlag.COUNTER_SATURATED));
        ProducerOperationalStats producerOperational = ProducerOperationalStats.builder()
                .acceptedLogsTotal(Long.MAX_VALUE).terminalSuccessLogsTotal(Long.MAX_VALUE)
                .terminalFailureLogsTotal(1L).workers(workers).build();
        long producerCore = Capability.HEALTH | Capability.OPERATIONAL | Capability.MANAGED;
        SnapshotHeader producerHeader = new SnapshotHeader("p", ComponentType.PRODUCER, 1, 1, 1,
                LifecycleState.RUNNING, Consistency.WEAK, MetricsLevel.CORE,
                StatsView.OPERATIONAL, false, producerCore, Collections.<MissingSection>emptyList(), 0, 0);
        ProducerStatsSnapshot producer = new ProducerStatsSnapshot(producerHeader, producerHealth,
                producerOperational, null, null, null, null, null);
        assertTrue(producer.toJson().contains("counter_saturated"));

        ConsumerHealthSignals consumerHealth = new ConsumerHealthSignals(null, null, workers,
                Collections.singletonList(CriticalFlag.COUNTER_SATURATED));
        ConsumerOperationalStats consumerOperational = ConsumerOperationalStats.builder()
                .fetchedLogsTotal(Long.MAX_VALUE).workers(workers).build();
        long consumerCore = Capability.HEALTH | Capability.OPERATIONAL;
        SnapshotHeader consumerHeader = new SnapshotHeader("c", ComponentType.CONSUMER, 1, 1, 1,
                LifecycleState.RUNNING, Consistency.WEAK, MetricsLevel.CORE,
                StatsView.OPERATIONAL, false, consumerCore, Collections.<MissingSection>emptyList(), 0, 0);
        ConsumerStatsSnapshot consumer = new ConsumerStatsSnapshot(consumerHeader, consumerHealth,
                consumerOperational, null, null, null);
        assertTrue(consumer.toJson().contains("counter_saturated"));
    }

    @Test
    public void policyRejectsNanAndInfinity() {
        invalid(() -> policy().queuePressureDegraded(Double.NaN).build());
        invalid(() -> policy().memoryPressureDegraded(Double.POSITIVE_INFINITY).build());
    }

    private static HealthPolicy.Builder policy() {
        return HealthPolicy.builder().queuePressureDegraded(0.7D).memoryPressureDegraded(0.8D);
    }

    private static void invalid(Runnable action) {
        try {
            action.run();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
}
