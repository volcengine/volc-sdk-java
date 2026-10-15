package com.volcengine.model.tls.stats;

import java.util.List;

/** Package-local validation shared by immutable public observability DTOs. */
final class StatsValidation {
    private StatsValidation() {
    }

    static void nonNegative(long value, String name) {
        if (value < 0) throw new IllegalArgumentException(name + " must be non-negative");
    }

    static void optionalNonNegative(Long value, String name) {
        if (value != null) nonNegative(value, name);
    }

    static void finiteNonNegative(double value, String name) {
        if (Double.isNaN(value) || Double.isInfinite(value) || value < 0D) {
            throw new IllegalArgumentException(name + " must be finite and non-negative");
        }
    }

    static void optionalFiniteNonNegative(Double value, String name) {
        if (value != null) finiteNonNegative(value.doubleValue(), name);
    }

    static <T> void orderedDistinct(List<T> values, T[] vocabulary, String name) {
        if (values == null) throw new IllegalArgumentException(name + " must not be null");
        int previous = -1;
        for (T value : values) {
            if (value == null) throw new IllegalArgumentException(name + " must not contain nulls");
            int ordinal = ordinalOf(vocabulary, value);
            if (ordinal <= previous) {
                throw new IllegalArgumentException(name + " must be distinct and follow the fixed vocabulary order");
            }
            previous = ordinal;
        }
    }

    static <T> void noNulls(List<T> values, String name) {
        if (values == null || values.contains(null)) {
            throw new IllegalArgumentException(name + " must not contain nulls");
        }
    }

    private static <T> int ordinalOf(T[] vocabulary, T value) {
        for (int i = 0; i < vocabulary.length; i++) {
            if (vocabulary[i] == value) return i;
        }
        throw new IllegalArgumentException("value is outside the fixed vocabulary");
    }
}
