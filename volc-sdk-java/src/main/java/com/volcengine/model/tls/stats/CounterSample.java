package com.volcengine.model.tls.stats;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Immutable component-neutral input to counter delta calculation.
 *
 * <p>A {@code null} counter map means that the operational section was not
 * available. An empty, non-null map is an available empty counter set and is
 * kept distinct from the unavailable form.</p>
 */
public final class CounterSample {
    private final SnapshotHeader header;
    private final Map<String, Long> counters;

    public CounterSample(SnapshotHeader header, Map<String, Long> counters) {
        if (header == null) {
            throw new IllegalArgumentException("header must not be null");
        }
        this.header = header;
        if (counters == null) {
            this.counters = null;
            return;
        }

        Map<String, Long> copy = new LinkedHashMap<>(counters.size());
        for (Map.Entry<String, Long> entry : counters.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("counter names and values must not be null");
            }
            if (entry.getValue() < 0L) {
                throw new IllegalArgumentException("counter values must be non-negative");
            }
            copy.put(entry.getKey(), entry.getValue());
        }
        this.counters = Collections.unmodifiableMap(copy);
    }

    public SnapshotHeader getHeader() {
        return header;
    }

    /** Returns an immutable counter copy, or {@code null} when unavailable. */
    public Map<String, Long> getCounters() {
        return counters;
    }
}
