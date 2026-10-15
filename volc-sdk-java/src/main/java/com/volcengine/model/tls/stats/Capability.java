package com.volcengine.model.tls.stats;

/** Stable capability bits for stats sections. */
public final class Capability {
    private Capability() {
    }

    public static final long HEALTH = 1L << 0;
    public static final long OPERATIONAL = 1L << 1;
    public static final long WORKER_DETAILS = 1L << 2;
    public static final long RETRY_DETAILS = 1L << 3;
    public static final long LATENCY = 1L << 4;
    public static final long MEMORY_BREAKDOWN = 1L << 5;
    public static final long MANAGED = 1L << 6;
    public static final long RUNTIME_LEVEL_CHANGE = 1L << 7;
    public static final long BATCH_INFLIGHT_MEMORY_GATE = 1L << 8;

    /** Java Producer currently has no independently maintained batch-gate section. */
    private static final long PRODUCER_SUPPORTED = HEALTH | OPERATIONAL | WORKER_DETAILS
            | RETRY_DETAILS | LATENCY | MEMORY_BREAKDOWN | MANAGED | RUNTIME_LEVEL_CHANGE;
    private static final long CONSUMER_SUPPORTED = HEALTH | OPERATIONAL | WORKER_DETAILS
            | RETRY_DETAILS | LATENCY | RUNTIME_LEVEL_CHANGE;

    /** Returns true if {@code bit} is set in {@code capabilities}. */
    public static boolean has(long capabilities, long bit) {
        return (capabilities & bit) != 0L;
    }

    /** Rejects unknown bits and component-incompatible claims. Collection level is not a capability. */
    public static void validate(ComponentType component, MetricsLevel level, long capabilities) {
        if (component == null || level == null || capabilities < 0L) {
            throw new IllegalArgumentException("component, level and non-negative capabilities are required");
        }
        long allowed = component == ComponentType.PRODUCER ? PRODUCER_SUPPORTED : CONSUMER_SUPPORTED;
        if ((capabilities & ~allowed) != 0L) {
            throw new IllegalArgumentException("capabilities are not valid for component and collection level");
        }
    }
}
