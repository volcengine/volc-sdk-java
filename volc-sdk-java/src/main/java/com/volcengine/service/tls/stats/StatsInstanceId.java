package com.volcengine.service.tls.stats;

import java.util.UUID;

/**
 * Generates opaque random instance identifiers for local snapshots. They never contain business
 * identifiers (topic, consumer group, endpoint, etc.).
 */
public final class StatsInstanceId {
    private StatsInstanceId() {
    }

    public static String forProducer() {
        return UUID.randomUUID().toString();
    }

    public static String forConsumer() {
        return UUID.randomUUID().toString();
    }
}
