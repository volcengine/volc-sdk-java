package com.volcengine.model.tls.stats;

/**
 * Immutable per-role worker/task health. {@code role} is a low-cardinality string from a fixed
 * vocabulary (dispatcher/mover/sender/callback_dispatcher for the Producer; main_loop/heartbeat/
 * checkpoint/shard_worker for the Consumer). No per-thread-id dimension is ever generated.
 */
public final class WorkerRoleStats {
    private final WorkerRole role;
    private final long expected;
    private final long running;
    private final long inFlight;

    public WorkerRoleStats(WorkerRole role, long expected, long running, long inFlight) {
        if (role == null) {
            throw new IllegalArgumentException("worker role must not be null");
        }
        StatsValidation.nonNegative(expected, "expected");
        StatsValidation.nonNegative(running, "running");
        StatsValidation.nonNegative(inFlight, "inFlight");
        if (running > expected) throw new IllegalArgumentException("running exceeds expected");
        this.role = role;
        this.expected = expected;
        this.running = running;
        this.inFlight = inFlight;
    }

    public WorkerRole getRole() {
        return role;
    }

    public long getExpected() {
        return expected;
    }

    public long getRunning() {
        return running;
    }

    public long getInFlight() {
        return inFlight;
    }

    /** Renders this snapshot as a JSON object fragment. */
    public String toJson() {
        return new JsonWriter()
                .str("role", role.getWireName())
                .num("expected", expected)
                .num("running", running)
                .num("in_flight", inFlight)
                .end();
    }

    @Override
    public String toString() {
        return toJson();
    }
}
