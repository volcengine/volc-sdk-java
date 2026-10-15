package com.volcengine.model.tls.stats;

/** Health pressure thresholds. No background sampling or inferred no-progress policy. */
public final class HealthPolicy {
    private final double queuePressureDegraded;
    private final double memoryPressureDegraded;

    public HealthPolicy() { this(0.80D, 0.80D); }
    public HealthPolicy(double queuePressureDegraded, double memoryPressureDegraded) {
        this.queuePressureDegraded = normalize(queuePressureDegraded);
        this.memoryPressureDegraded = normalize(memoryPressureDegraded);
    }
    public static HealthPolicy defaults() { return new HealthPolicy(); }
    public static Builder builder() { return new Builder(); }
    public double getQueuePressureDegraded() { return queuePressureDegraded; }
    public double getMemoryPressureDegraded() { return memoryPressureDegraded; }

    private static double normalize(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("health pressure threshold must be finite");
        }
        return value <= 0D || value > 1D ? 0.80D : value;
    }

    public static final class Builder {
        private double queue = 0.80D, memory = 0.80D;
        public Builder queuePressureDegraded(double value) { queue = value; return this; }
        public Builder memoryPressureDegraded(double value) { memory = value; return this; }
        public HealthPolicy build() { return new HealthPolicy(queue, memory); }
    }
}
