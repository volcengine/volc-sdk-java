package com.volcengine.model.tls.stats;

public final class ConsumerLatencyHistograms {
    private final HistogramSnapshot fetchCallDuration;
    private final HistogramSnapshot dispatchDelay;
    private final HistogramSnapshot handlerDuration;
    private final HistogramSnapshot checkpointCallDuration;

    public ConsumerLatencyHistograms(HistogramSnapshot fetchCallDuration, HistogramSnapshot dispatchDelay,
                                     HistogramSnapshot handlerDuration, HistogramSnapshot checkpointCallDuration) {
        if (fetchCallDuration == null || dispatchDelay == null || handlerDuration == null
                || checkpointCallDuration == null) {
            throw new IllegalArgumentException("all consumer histograms are required");
        }
        this.fetchCallDuration = fetchCallDuration;
        this.dispatchDelay = dispatchDelay;
        this.handlerDuration = handlerDuration;
        this.checkpointCallDuration = checkpointCallDuration;
    }

    public HistogramSnapshot getFetchCallDuration() { return fetchCallDuration; }
    public HistogramSnapshot getDispatchDelay() { return dispatchDelay; }
    public HistogramSnapshot getHandlerDuration() { return handlerDuration; }
    public HistogramSnapshot getCheckpointCallDuration() { return checkpointCallDuration; }

    String toJson() {
        return new JsonWriter()
                .raw("fetch_call_duration", new LatencyHistogram("consume_logs_call_start",
                        "consume_logs_call_end", "ms", "call", true, fetchCallDuration).toJson())
                .raw("dispatch_delay", new LatencyHistogram("batch_ready", "callback_start",
                        "ms", "batch", false, dispatchDelay).toJson())
                .raw("process_duration", new LatencyHistogram("callback_start", "callback_end",
                        "ms", "batch", false, handlerDuration).toJson())
                .raw("checkpoint_call_duration", new LatencyHistogram("checkpoint_call_start",
                        "checkpoint_call_end", "ms", "call", true, checkpointCallDuration).toJson()).end();
    }
}
