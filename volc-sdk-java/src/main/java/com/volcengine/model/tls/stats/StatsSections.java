package com.volcengine.model.tls.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Shared missing-section rules for projection and snapshot validation. */
public final class StatsSections {
    private StatsSections() { }

    public static List<MissingSection> missing(ComponentType component, long capabilities,
                                               MetricsLevel level, StatsView view) {
        if (component == null || level == null || view == null) {
            throw new IllegalArgumentException("component, level and view are required");
        }
        List<MissingSection> missing = new ArrayList<>();
        if (level.getCode() < MetricsLevel.CORE.getCode()) {
            addIfSupported(missing, capabilities, Capability.HEALTH, MissingSection.HEALTH);
            if (view != StatsView.HEALTH) {
                addIfSupported(missing, capabilities, Capability.OPERATIONAL, MissingSection.OPERATIONAL);
            }
            if (component == ComponentType.PRODUCER) {
                addIfSupported(missing, capabilities, Capability.MANAGED, MissingSection.MANAGED_MEMORY);
            }
        }
        if (view == StatsView.DEBUG && level.getCode() < MetricsLevel.DETAILED.getCode()) {
            addIfSupported(missing, capabilities, Capability.WORKER_DETAILS, MissingSection.WORKER_DETAILS);
            addIfSupported(missing, capabilities, Capability.RETRY_DETAILS, MissingSection.RETRY_DETAILS);
            addIfSupported(missing, capabilities, Capability.LATENCY, MissingSection.LATENCY_HISTOGRAMS);
            if (component == ComponentType.PRODUCER) {
                addIfSupported(missing, capabilities, Capability.MEMORY_BREAKDOWN, MissingSection.MEMORY_BREAKDOWN);
            }
        }
        return Collections.unmodifiableList(missing);
    }

    private static void addIfSupported(List<MissingSection> missing, long capabilities,
                                        long capability, MissingSection section) {
        if (Capability.has(capabilities, capability)) missing.add(section);
    }
}
