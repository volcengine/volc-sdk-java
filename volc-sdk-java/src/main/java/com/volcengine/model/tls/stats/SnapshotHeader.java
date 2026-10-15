package com.volcengine.model.tls.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Immutable identity, lifecycle and projection metadata shared by all snapshots. */
public final class SnapshotHeader {
    public static final int SCHEMA_VERSION = 2;
    public static final String SDK_NAME = "volc-sdk-java";
    public static final String SDK_LANGUAGE = "java";

    /** Initializes SDK identity metadata once, outside the GetStats projection path. */
    public static String initializeSdkIdentity() {
        return SdkVersion.initialize();
    }

    private final int schemaVersion;
    private final String instanceId;
    private final String sdkName;
    private final String sdkLanguage;
    private final String sdkVersion;
    private final ComponentType componentType;
    private final long capturedAtUnixMs;
    private final long uptimeMs;
    private final long snapshotSequence;
    private final LifecycleState lifecycleState;
    private final Consistency consistency;
    private final MetricsLevel collectedLevel;
    private final StatsView requestedView;
    private final boolean metricsDisabled;
    private final boolean partial;
    private final long capabilities;
    private final List<MissingSection> missingSections;
    private final long collectionGeneration;
    private final long collectionStartedAtUnixMs;

    /** Collection identity is supplied by the view-neutral capture anchor. */
    public SnapshotHeader(String instanceId, ComponentType componentType, long capturedAtUnixMs,
                          long uptimeMs, long snapshotSequence, LifecycleState lifecycleState,
                          Consistency consistency, MetricsLevel collectedLevel, StatsView requestedView,
                          boolean partial, long capabilities, List<MissingSection> missingSections,
                          long collectionGeneration, long collectionStartedAtUnixMs) {
        if (instanceId == null || componentType == null || lifecycleState == null || consistency == null
                || collectedLevel == null || requestedView == null || missingSections == null) {
            throw new IllegalArgumentException("snapshot header fields must not be null");
        }
        if (partial != !missingSections.isEmpty()) {
            throw new IllegalArgumentException("partial must exactly match missing_sections");
        }
        if (instanceId.isEmpty()) throw new IllegalArgumentException("instanceId must not be empty");
        StatsValidation.nonNegative(capturedAtUnixMs, "capturedAtUnixMs");
        StatsValidation.nonNegative(uptimeMs, "uptimeMs");
        StatsValidation.nonNegative(snapshotSequence, "snapshotSequence");
        StatsValidation.nonNegative(collectionGeneration, "collectionGeneration");
        StatsValidation.nonNegative(collectionStartedAtUnixMs, "collectionStartedAtUnixMs");
        Capability.validate(componentType, collectedLevel, capabilities);
        StatsValidation.orderedDistinct(missingSections, MissingSection.values(), "missingSections");
        this.schemaVersion = SCHEMA_VERSION;
        this.instanceId = instanceId;
        this.sdkName = SDK_NAME;
        this.sdkLanguage = SDK_LANGUAGE;
        this.sdkVersion = SdkVersion.value();
        this.componentType = componentType;
        this.capturedAtUnixMs = capturedAtUnixMs;
        this.uptimeMs = uptimeMs;
        this.snapshotSequence = snapshotSequence;
        this.lifecycleState = lifecycleState;
        this.consistency = consistency;
        this.collectedLevel = collectedLevel;
        this.requestedView = requestedView;
        this.metricsDisabled = collectedLevel == MetricsLevel.OFF;
        this.partial = partial;
        this.capabilities = capabilities;
        this.missingSections = Collections.unmodifiableList(new ArrayList<>(missingSections));
        this.collectionGeneration = collectionGeneration;
        this.collectionStartedAtUnixMs = collectionStartedAtUnixMs;
    }

    public int getSchemaVersion() { return schemaVersion; }
    public String getInstanceId() { return instanceId; }
    public String getSdkName() { return sdkName; }
    public String getSdkLanguage() { return sdkLanguage; }
    public String getSdkVersion() { return sdkVersion; }
    public ComponentType getComponentType() { return componentType; }
    public long getCapturedAtUnixMs() { return capturedAtUnixMs; }
    public long getUptimeMs() { return uptimeMs; }
    public long getSnapshotSequence() { return snapshotSequence; }
    public LifecycleState getLifecycleState() { return lifecycleState; }
    public Consistency getConsistency() { return consistency; }
    public MetricsLevel getCollectedLevel() { return collectedLevel; }
    public StatsView getRequestedView() { return requestedView; }
    public boolean isMetricsDisabled() { return metricsDisabled; }
    public boolean isPartial() { return partial; }
    public long getCapabilities() { return capabilities; }
    public List<MissingSection> getMissingSections() { return missingSections; }
    public long getCollectionGeneration() { return collectionGeneration; }
    public long getCollectionStartedAtUnixMs() { return collectionStartedAtUnixMs; }

    JsonWriter writeTo(JsonWriter writer) {
        List<String> missing = new ArrayList<>(missingSections.size());
        for (MissingSection section : missingSections) {
            missing.add(section.getWireName());
        }
        writer
                .num("schema_version", schemaVersion)
                .str("instance_id", instanceId)
                .str("sdk_name", sdkName)
                .str("sdk_language", sdkLanguage)
                .str("sdk_version", sdkVersion)
                .str("component_type", componentType.getWireName())
                .num("captured_at_unix_ms", capturedAtUnixMs)
                .num("uptime_ms", uptimeMs)
                .num("snapshot_sequence", snapshotSequence)
                .num("collection_generation", collectionGeneration)
                .num("collection_started_at_unix_ms", collectionStartedAtUnixMs)
                .str("lifecycle_state", lifecycleState.getWireName())
                .str("consistency", consistency.getWireName())
                .num("collected_level", collectedLevel.getCode())
                .num("requested_view", requestedView.getCode())
                .bool("metrics_disabled", metricsDisabled)
                .bool("partial", partial)
                .num("capabilities", capabilities);
        if (!missing.isEmpty()) {
            writer.raw("missing_sections", JsonWriter.stringArray(missing));
        }
        return writer;
    }

    String toJson() {
        return writeTo(new JsonWriter()).end();
    }
}
