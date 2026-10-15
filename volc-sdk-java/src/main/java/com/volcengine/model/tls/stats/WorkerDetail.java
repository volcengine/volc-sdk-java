package com.volcengine.model.tls.stats;

public final class WorkerDetail {
    private final WorkerRole role;
    private final int expected;
    private final int running;
    private final long inFlight;

    /** Worker detail constructor. */
    public WorkerDetail(WorkerRole role, int expected, int running, long inFlight) {
        if (role == null || expected < 0 || running < 0 || inFlight < 0) {
            throw new IllegalArgumentException("invalid worker detail");
        }
        this.role = role;
        this.expected = expected;
        this.running = running;
        this.inFlight = inFlight;
    }

    public WorkerRole getRole() { return role; }
    public long getInFlight() { return inFlight; }
    public int getExpected() { return expected; }
    public int getRunning() { return running; }

    String toJson() {
        return new JsonWriter().str("role", role.getWireName())
                .num("expected", expected)
                .num("running", running)
                .num("in_flight", inFlight).end();
    }
}
