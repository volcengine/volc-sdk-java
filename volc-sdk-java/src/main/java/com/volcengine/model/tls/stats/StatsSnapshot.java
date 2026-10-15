package com.volcengine.model.tls.stats;

import java.util.Optional;

public interface StatsSnapshot {
    SnapshotHeader getHeader();
    Optional<? extends HealthSignals> getHealth();
    String toJson();
}
