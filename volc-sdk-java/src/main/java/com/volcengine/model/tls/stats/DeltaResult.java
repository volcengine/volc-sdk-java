package com.volcengine.model.tls.stats;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/** Immutable result for one cumulative-counter interval. */
public final class DeltaResult {
    private final boolean valid;
    private final DeltaResetReason resetReason;
    private final long intervalMs;
    private final Map<String, Long> deltas;
    private final Map<String, Double> ratesPerSecond;

    /**
     * Creates a result using the Go contract's zero/absence shape.
     *
     * <p>Invalid results have no interval or maps. Valid results have a
     * positive interval, no reset reason, and non-null maps (including for an
     * available empty counter set).</p>
     */
    public DeltaResult(boolean valid, DeltaResetReason resetReason, long intervalMs,
                       Map<String, Long> deltas, Map<String, Double> ratesPerSecond) {
        if (intervalMs < 0L) {
            throw new IllegalArgumentException("intervalMs must be non-negative");
        }
        if (valid) {
            if (resetReason != null) {
                throw new IllegalArgumentException("valid result must not have a reset reason");
            }
            if (intervalMs <= 0L || deltas == null || ratesPerSecond == null) {
                throw new IllegalArgumentException("valid result requires interval and maps");
            }
        } else if (intervalMs != 0L || deltas != null || ratesPerSecond != null) {
            throw new IllegalArgumentException("invalid result must omit interval and maps");
        }
        this.valid = valid;
        this.resetReason = resetReason;
        this.intervalMs = intervalMs;
        this.deltas = copyDeltas(deltas);
        this.ratesPerSecond = copyRates(ratesPerSecond);
    }

    static DeltaResult invalid(DeltaResetReason reason) {
        return new DeltaResult(false, reason, 0L, null, null);
    }

    static DeltaResult valid(long intervalMs, Map<String, Long> deltas,
                            Map<String, Double> ratesPerSecond) {
        return new DeltaResult(true, null, intervalMs, deltas, ratesPerSecond);
    }

    public boolean isValid() {
        return valid;
    }

    /** May be {@code null} for a valid result or a zero-value invalid result. */
    public DeltaResetReason getResetReason() {
        return resetReason;
    }

    /** Returns zero for invalid results, matching Go's omitted interval field. */
    public long getIntervalMs() {
        return intervalMs;
    }

    /** Returns {@code null} for invalid results. */
    public Map<String, Long> getDeltas() {
        return deltas;
    }

    /** Returns {@code null} for invalid results. */
    public Map<String, Double> getRatesPerSecond() {
        return ratesPerSecond;
    }

    /** Renders the exact Go field names and omission semantics. */
    public String toJson() {
        JsonWriter writer = new JsonWriter().bool("valid", valid);
        if (resetReason != null) {
            writer.str("reset_reason", resetReason.getWireName());
        }
        if (intervalMs != 0L) {
            writer.num("interval_ms", intervalMs);
        }
        // encoding/json's omitempty omits empty maps as well as nil maps.
        if (deltas != null && !deltas.isEmpty()) {
            writer.raw("deltas", longMapJson(deltas));
        }
        if (ratesPerSecond != null && !ratesPerSecond.isEmpty()) {
            writer.raw("rates_per_second", doubleMapJson(ratesPerSecond));
        }
        return writer.end();
    }

    @Override
    public String toString() {
        return toJson();
    }

    private static Map<String, Long> copyDeltas(Map<String, Long> values) {
        if (values == null) {
            return null;
        }
        Map<String, Long> copy = new LinkedHashMap<>(values.size());
        for (Map.Entry<String, Long> entry : values.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("delta names and values must not be null");
            }
            if (entry.getValue() < 0L) {
                throw new IllegalArgumentException("delta values must be non-negative");
            }
            copy.put(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap(copy);
    }

    private static Map<String, Double> copyRates(Map<String, Double> values) {
        if (values == null) {
            return null;
        }
        Map<String, Double> copy = new LinkedHashMap<>(values.size());
        for (Map.Entry<String, Double> entry : values.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("rate names and values must not be null");
            }
            double value = entry.getValue();
            if (Double.isNaN(value) || Double.isInfinite(value) || value < 0D) {
                throw new IllegalArgumentException("rate values must be finite and non-negative");
            }
            copy.put(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap(copy);
    }

    private static String longMapJson(Map<String, Long> values) {
        StringBuilder out = new StringBuilder(values.size() * 20 + 2);
        out.append('{');
        boolean first = true;
        for (Map.Entry<String, Long> entry : new TreeMap<>(values).entrySet()) {
            if (!first) {
                out.append(',');
            }
            first = false;
            appendString(out, entry.getKey());
            out.append(':').append(entry.getValue());
        }
        return out.append('}').toString();
    }

    private static String doubleMapJson(Map<String, Double> values) {
        StringBuilder out = new StringBuilder(values.size() * 24 + 2);
        out.append('{');
        boolean first = true;
        for (Map.Entry<String, Double> entry : new TreeMap<>(values).entrySet()) {
            if (!first) {
                out.append(',');
            }
            first = false;
            appendString(out, entry.getKey());
            // The constructor validates and copies every value into an immutable map.
            out.append(':').append(entry.getValue());
        }
        return out.append('}').toString();
    }

    private static void appendString(StringBuilder out, String value) {
        out.append('"');
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '"':
                    out.append("\\\"");
                    break;
                case '\\':
                    out.append("\\\\");
                    break;
                case '\n':
                    out.append("\\n");
                    break;
                case '\r':
                    out.append("\\r");
                    break;
                case '\t':
                    out.append("\\t");
                    break;
                default:
                    if (c < 0x20) {
                        out.append(String.format("\\u%04x", (int) c));
                    } else {
                        out.append(c);
                    }
            }
        }
        out.append('"');
    }
}
