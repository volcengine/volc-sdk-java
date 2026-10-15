package com.volcengine.model.tls.stats;

public final class ManagedMemoryBreakdown {
    private final long payloadOwnedBytes;
    private final long ingressOwnedBytes;
    private final long aggregateOwnedBytes;
    private final long sendOwnedBytes;
    private final long retryOwnedBytes;
    private final long boundedRuntimeBufferBytes;

    /** Constructs a breakdown from the four payload stages and runtime buffer. */
    public ManagedMemoryBreakdown(long ingressOwnedBytes, long aggregateOwnedBytes,
                                  long sendOwnedBytes, long retryOwnedBytes,
                                  long boundedRuntimeBufferBytes) {
        StatsValidation.nonNegative(ingressOwnedBytes, "ingressOwnedBytes");
        StatsValidation.nonNegative(aggregateOwnedBytes, "aggregateOwnedBytes");
        StatsValidation.nonNegative(sendOwnedBytes, "sendOwnedBytes");
        StatsValidation.nonNegative(retryOwnedBytes, "retryOwnedBytes");
        StatsValidation.nonNegative(boundedRuntimeBufferBytes, "boundedRuntimeBufferBytes");
        long payloadOwnedBytes = ingressOwnedBytes;
        if (aggregateOwnedBytes > Long.MAX_VALUE - payloadOwnedBytes) {
            throw new IllegalArgumentException("payload bytes overflow");
        }
        payloadOwnedBytes += aggregateOwnedBytes;
        if (sendOwnedBytes > Long.MAX_VALUE - payloadOwnedBytes) {
            throw new IllegalArgumentException("payload bytes overflow");
        }
        payloadOwnedBytes += sendOwnedBytes;
        if (retryOwnedBytes > Long.MAX_VALUE - payloadOwnedBytes) {
            throw new IllegalArgumentException("payload bytes overflow");
        }
        payloadOwnedBytes += retryOwnedBytes;
        this.payloadOwnedBytes = payloadOwnedBytes;
        this.ingressOwnedBytes = ingressOwnedBytes;
        this.aggregateOwnedBytes = aggregateOwnedBytes;
        this.sendOwnedBytes = sendOwnedBytes;
        this.retryOwnedBytes = retryOwnedBytes;
        this.boundedRuntimeBufferBytes = boundedRuntimeBufferBytes;
    }

    /** Derived payload-stage total; the wire contract emits the four stages, not this sum. */
    public long getPayloadOwnedBytes() { return payloadOwnedBytes; }
    public long getIngressOwnedBytes() { return ingressOwnedBytes; }
    public long getAggregateOwnedBytes() { return aggregateOwnedBytes; }
    public long getSendOwnedBytes() { return sendOwnedBytes; }
    public long getRetryOwnedBytes() { return retryOwnedBytes; }
    public long getBoundedRuntimeBufferBytes() { return boundedRuntimeBufferBytes; }

    String toJson() {
        return new JsonWriter().num("ingress_owned_bytes", ingressOwnedBytes)
                .num("aggregate_owned_bytes", aggregateOwnedBytes)
                .num("send_owned_bytes", sendOwnedBytes)
                .num("retry_owned_bytes", retryOwnedBytes)
                .num("bounded_runtime_buffer_bytes", boundedRuntimeBufferBytes).end();
    }

}
