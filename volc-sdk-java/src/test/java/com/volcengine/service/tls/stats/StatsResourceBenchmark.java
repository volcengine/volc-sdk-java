package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.StatsView;

import java.util.Arrays;
import java.util.Locale;

/**
 * Reproducible offline snapshot smoke harness for the observability contract. It emits raw CSV rows.
 * Scale inputs are synthetic aggregate counters, not real transport/queue workloads;
 * these measurements are not a full SDK resource or release-performance qualification.
 */
public final class StatsResourceBenchmark {
    private static final int WARMUP = integerProperty("bench.warmup", 100_000);
    private static final int SAMPLES = integerProperty("bench.samples", 1_000_000);
    private static final int ROUNDS = integerProperty("bench.rounds", 7);
    private static volatile Object blackhole;

    private StatsResourceBenchmark() {
    }

    public static void main(String[] args) throws InterruptedException {
        String mode = args.length == 0 ? "all" : args[0];
        System.out.println("MANIFEST,jvm=" + System.getProperty("java.version")
                + ",cores=" + Runtime.getRuntime().availableProcessors()
                + ",warmup=" + WARMUP + ",samples=" + SAMPLES + ",rounds=" + ROUNDS);
        if ("all".equals(mode) || "getstats".equals(mode)) benchmarkViews();
        if ("all".equals(mode) || "retained".equals(mode)) benchmarkRetained();
        if ("all".equals(mode) || "scale".equals(mode)) benchmarkScale();
    }

    private static void benchmarkViews() {
        for (MetricsLevel level : MetricsLevel.values()) {
            for (StatsView view : StatsView.values()) {
                benchmark("producer", level, view, "steady", 0, producer(level), null);
                benchmark("consumer", level, view, "steady", 0, null, consumer(level));
            }
        }
    }

    private static void benchmarkScale() throws InterruptedException {
        int[] producerBacklog = {0, 1_000, 100_000};
        for (int backlog : producerBacklog) {
            MemoryLimiter limiter = new MemoryLimiter(1024 * 1024, 512 * 1024, true);
            ProducerStatsState state = new ProducerStatsState(MetricsLevel.DETAILED, 2, limiter,
                    StatsInstanceId.forProducer(), StatsClock.SYSTEM);
            state.markStarted();
            for (int i = 0; i < backlog; i++) {
                if (!state.acquirePayloadAndAccept(limiter, 1, 0, 1)) {
                    throw new IllegalStateException("benchmark backlog exceeds its fixed memory budget");
                }
            }
            for (StatsView view : StatsView.values()) {
                benchmark("producer", MetricsLevel.DETAILED, view, "backlog", backlog, state, null);
            }
        }
        int[] consumerShards = {1, 16, 256};
        for (int shards : consumerShards) {
            ConsumerStatsState state = consumer(MetricsLevel.DETAILED);
            state.onAssignment(shards, false);
            for (StatsView view : StatsView.values()) {
                benchmark("consumer", MetricsLevel.DETAILED, view, "shards", shards, null, state);
            }
        }
    }

    private static void benchmark(String component, MetricsLevel level, StatsView view,
                                  String scaleName, int scaleValue,
                                  ProducerStatsState producer, ConsumerStatsState consumer) {
        StatsOptions options = new StatsOptions(view);
        for (int i = 0; i < WARMUP; i++) blackhole = producer == null
                ? consumer.snapshot(options) : producer.snapshot(options);
        long[] samples = new long[SAMPLES];
        for (int round = 1; round <= ROUNDS; round++) {
            for (int i = 0; i < SAMPLES; i++) {
                long start = System.nanoTime();
                blackhole = producer == null ? consumer.snapshot(options) : producer.snapshot(options);
                samples[i] = System.nanoTime() - start;
            }
            Arrays.sort(samples);
            System.out.printf(Locale.ROOT,
                    "GETSTATS,%s,%s,%s,%s,%d,%d,%d,%d,%d,%d%n",
                    component, level.name(), view.name(), scaleName, scaleValue, round,
                    percentile(samples, 0.50), percentile(samples, 0.95),
                    percentile(samples, 0.99), samples[samples.length - 1]);
        }
    }

    private static void benchmarkRetained() {
        int[] sizes = {1, 10, 50, 100};
        for (int round = 1; round <= 5; round++) {
            for (int size : sizes) {
                retained("producer", "BASELINE", size, round);
                for (MetricsLevel level : MetricsLevel.values()) {
                    retained("producer", level.name(), size, round);
                }
                retained("consumer", "BASELINE", size, round);
                for (MetricsLevel level : MetricsLevel.values()) {
                    retained("consumer", level.name(), size, round);
                }
            }
        }
    }

    private static void retained(String component, String mode, int size, int round) {
        forceGc();
        long before = usedHeap();
        Object[] instances = new Object[size];
        for (int i = 0; i < size; i++) {
            instances[i] = retainedInstance(component, mode);
        }
        blackhole = instances;
        forceGc();
        long retained = Math.max(0L, usedHeap() - before);
        System.out.printf(Locale.ROOT, "RETAINED,%s,%s,%d,%d,%d%n",
                component, mode, size, round, retained);
        blackhole = null;
        forceGc();
    }

    private static Object retainedInstance(String component, String mode) {
        if ("producer".equals(component)) {
            MemoryLimiter limiter = new MemoryLimiter(1024 * 1024, 512 * 1024,
                    !"BASELINE".equals(mode) && !MetricsLevel.OFF.name().equals(mode));
            if ("BASELINE".equals(mode)) return limiter;
            return new Object[]{limiter, new ProducerStatsState(MetricsLevel.valueOf(mode), 2,
                    limiter, StatsInstanceId.forProducer(), StatsClock.SYSTEM)};
        }
        if ("BASELINE".equals(mode)) return new Object();
        return consumer(MetricsLevel.valueOf(mode));
    }

    private static ProducerStatsState producer(MetricsLevel level) {
        MemoryLimiter limiter = new MemoryLimiter(1024 * 1024, 512 * 1024,
                level != MetricsLevel.OFF);
        ProducerStatsState state = new ProducerStatsState(level, 2, limiter,
                StatsInstanceId.forProducer(), StatsClock.SYSTEM);
        state.markStarted();
        return state;
    }

    private static ConsumerStatsState consumer(MetricsLevel level) {
        ConsumerStatsState state = new ConsumerStatsState(level, 2,
                StatsInstanceId.forConsumer(), StatsClock.SYSTEM);
        state.markStarted();
        return state;
    }

    private static long percentile(long[] sorted, double quantile) {
        int index = (int) Math.ceil(quantile * sorted.length) - 1;
        return sorted[Math.max(0, Math.min(index, sorted.length - 1))];
    }

    private static int integerProperty(String name, int defaultValue) {
        int value = Integer.getInteger(name, defaultValue);
        if (value <= 0) throw new IllegalArgumentException(name + " must be positive");
        return value;
    }

    private static void forceGc() {
        for (int i = 0; i < 2; i++) {
            System.gc();
            System.runFinalization();
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("interrupted while forcing GC", e);
            }
        }
    }

    private static long usedHeap() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}
