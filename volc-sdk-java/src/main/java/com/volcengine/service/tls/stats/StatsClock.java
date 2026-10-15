package com.volcengine.service.tls.stats;

/**
 * Monotonic clock abstraction for the stats subsystem. All duration measurements use
 * {@link System#nanoTime()} (never {@code currentTimeMillis()}), so histogram durations and uptime
 * are immune to wall-clock adjustments. The wall clock is used only for the display-only
 * {@code captured_at_unix_ms} field.
 *
 * <p>The default implementation delegates to the JVM clocks; tests inject a controllable clock to
 * make histogram and age assertions deterministic.
 */
public interface StatsClock {
    /** Monotonic timestamp in nanoseconds (see {@link System#nanoTime()}). */
    long nanoTime();

    /** Wall-clock time in milliseconds since the epoch (display only). */
    long currentTimeMillis();

    /** Default clock backed by the JVM system clocks. */
    StatsClock SYSTEM = new StatsClock() {
        @Override
        public long nanoTime() {
            return System.nanoTime();
        }

        @Override
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    };
}
