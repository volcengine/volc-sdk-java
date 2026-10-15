package com.volcengine.model.tls.stats;

public final class ProducerLatencyHistograms {
    private final HistogramSnapshot batchQueueDelay;
    private final HistogramSnapshot sendCallDuration;
    private final HistogramSnapshot batchDeliveryDuration;
    private final HistogramSnapshot callbackDuration;

    public ProducerLatencyHistograms(HistogramSnapshot batchQueueDelay,
                                     HistogramSnapshot sendCallDuration,
                                     HistogramSnapshot batchDeliveryDuration,
                                     HistogramSnapshot callbackDuration) {
        if (batchQueueDelay == null || sendCallDuration == null
                || batchDeliveryDuration == null || callbackDuration == null) {
            throw new IllegalArgumentException("all producer histograms are required");
        }
        this.batchQueueDelay = batchQueueDelay;
        this.sendCallDuration = sendCallDuration;
        this.batchDeliveryDuration = batchDeliveryDuration;
        this.callbackDuration = callbackDuration;
    }

    public HistogramSnapshot getBatchQueueDelay() { return batchQueueDelay; }
    public HistogramSnapshot getSendCallDuration() { return sendCallDuration; }
    public HistogramSnapshot getBatchDeliveryDuration() { return batchDeliveryDuration; }
    public HistogramSnapshot getCallbackDuration() { return callbackDuration; }

    String toJson() {
        return new JsonWriter()
                .raw("batch_queue_delay", new LatencyHistogram("batch_ready", "send_attempt_start",
                        "ms", "batch", false, batchQueueDelay).toJson())
                .raw("send_call_duration", new LatencyHistogram("transport_call_start",
                        "transport_call_end", "ms", "call", false, sendCallDuration).toJson())
                .raw("batch_delivery_duration", new LatencyHistogram("first_send_attempt_start",
                        "terminal_outcome", "ms", "batch", true, batchDeliveryDuration).toJson())
                .raw("callback_duration", new LatencyHistogram("callback_start", "callback_end",
                        "ms", "callback", false, callbackDuration).toJson()).end();
    }
}
