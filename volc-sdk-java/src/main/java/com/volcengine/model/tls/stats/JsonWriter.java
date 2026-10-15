package com.volcengine.model.tls.stats;

/**
 * Minimal, dependency-free JSON object writer used to serialize stats snapshots with exact field
 * names — including Prometheus-style labeled keys such as {@code terminal_logs_total{outcome=success}}
 * — and precise absence semantics (a null value is omitted entirely rather than emitted as 0).
 *
 * <p>This is intentionally tiny and internal: it only supports the value types the stats DTOs use
 * (String, boxed numbers, booleans, nested pre-rendered JSON fragments and arrays). It is not a
 * general-purpose JSON library.
 */
public final class JsonWriter {
    private final StringBuilder sb = new StringBuilder(256);
    private boolean first = true;

    public JsonWriter() {
        sb.append('{');
    }

    private void key(String name) {
        if (!first) {
            sb.append(',');
        }
        first = false;
        appendString(name);
        sb.append(':');
    }

    /** Writes a mandatory string field. */
    public JsonWriter str(String name, String value) {
        key(name);
        if (value == null) {
            sb.append("null");
        } else {
            appendString(value);
        }
        return this;
    }

    /** Writes a string field only when the value is non-null. */
    public JsonWriter strOpt(String name, String value) {
        if (value != null) {
            str(name, value);
        }
        return this;
    }

    /** Writes a mandatory numeric field. */
    public JsonWriter num(String name, long value) {
        key(name);
        sb.append(value);
        return this;
    }

    /** Writes a mandatory numeric field. */
    public JsonWriter num(String name, int value) {
        key(name);
        sb.append(value);
        return this;
    }

    /** Writes a mandatory double field, rendering non-finite values as 0 to keep valid JSON. */
    public JsonWriter num(String name, double value) {
        key(name);
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            sb.append('0');
        } else {
            sb.append(value);
        }
        return this;
    }

    /** Writes a boxed numeric field only when non-null (absence semantics). */
    public JsonWriter numOpt(String name, Long value) {
        if (value != null) {
            num(name, value.longValue());
        }
        return this;
    }

    /** Writes a boxed numeric field only when non-null (absence semantics). */
    public JsonWriter numOpt(String name, Integer value) {
        if (value != null) {
            num(name, value.intValue());
        }
        return this;
    }

    /** Writes a boxed double field only when non-null. */
    public JsonWriter numOpt(String name, Double value) {
        if (value != null) {
            num(name, value.doubleValue());
        }
        return this;
    }

    /** Writes a boolean field. */
    public JsonWriter bool(String name, boolean value) {
        key(name);
        sb.append(value ? "true" : "false");
        return this;
    }

    /** Writes a pre-rendered JSON fragment (object or array) only when non-null. */
    public JsonWriter rawOpt(String name, String jsonFragment) {
        if (jsonFragment != null) {
            key(name);
            sb.append(jsonFragment);
        }
        return this;
    }

    /** Writes a pre-rendered JSON fragment (object or array), null becomes JSON null. */
    public JsonWriter raw(String name, String jsonFragment) {
        key(name);
        sb.append(jsonFragment == null ? "null" : jsonFragment);
        return this;
    }

    /** Renders an array of longs as a JSON fragment. */
    public static String longArray(long[] values) {
        if (values == null) {
            return "null";
        }
        StringBuilder b = new StringBuilder(values.length * 4 + 2);
        b.append('[');
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                b.append(',');
            }
            b.append(values[i]);
        }
        b.append(']');
        return b.toString();
    }

    /** Renders an array of already-JSON string values (each escaped) as a JSON fragment. */
    public static String stringArray(java.util.List<String> values) {
        if (values == null) {
            return "null";
        }
        StringBuilder b = new StringBuilder(values.size() * 8 + 2);
        b.append('[');
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                b.append(',');
            }
            appendString(b, values.get(i));
        }
        b.append(']');
        return b.toString();
    }

    /** Renders already-serialized JSON values as an array. */
    public static String rawArray(java.util.List<String> values) {
        if (values == null) {
            return "null";
        }
        StringBuilder b = new StringBuilder(values.size() * 32 + 2);
        b.append('[');
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                b.append(',');
            }
            b.append(values.get(i));
        }
        return b.append(']').toString();
    }

    private void appendString(String value) {
        appendString(sb, value);
    }

    private static void appendString(StringBuilder out, String value) {
        if (value == null) {
            out.append("null");
            return;
        }
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

    /** Finishes and returns the JSON object string. The writer must not be reused afterward. */
    public String end() {
        sb.append('}');
        return sb.toString();
    }
}
