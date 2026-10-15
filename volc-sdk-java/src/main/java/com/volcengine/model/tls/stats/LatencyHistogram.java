package com.volcengine.model.tls.stats;

/** Semantic boundary plus immutable histogram for one latency measurement. */
public final class LatencyHistogram {
    private final String start;
    private final String end;
    private final String unit;
    private final String object;
    private final boolean includesRetry;
    private final HistogramSnapshot histogram;

    public LatencyHistogram(String start, String end, String unit, String object,
                            boolean includesRetry, HistogramSnapshot histogram) {
        if (start == null || end == null || unit == null || object == null || histogram == null) {
            throw new IllegalArgumentException("latency semantic fields and histogram are required");
        }
        this.start = start;
        this.end = end;
        this.unit = unit;
        this.object = object;
        this.includesRetry = includesRetry;
        this.histogram = histogram;
    }

    public String getStart() { return start; }
    public String getEnd() { return end; }
    public String getUnit() { return unit; }
    public String getObject() { return object; }
    public boolean isIncludesRetry() { return includesRetry; }
    public HistogramSnapshot getHistogram() { return histogram; }

    String toJson() {
        return new JsonWriter().str("start", start).str("end", end).str("unit", unit)
                .str("object", object).bool("includes_retry", includesRetry)
                .raw("histogram", histogram.toJson()).end();
    }
}
