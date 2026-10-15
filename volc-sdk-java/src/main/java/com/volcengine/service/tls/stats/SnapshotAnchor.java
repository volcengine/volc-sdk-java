package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ComponentType;
import com.volcengine.model.tls.stats.Capability;
import com.volcengine.model.tls.stats.Consistency;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;

/** View-neutral identity and lifecycle captured once before projection. */
public final class SnapshotAnchor {
    final String instanceId;
    final ComponentType componentType;
    final long capturedAtUnixMs;
    final long uptimeMs;
    final long snapshotSequence;
    final LifecycleState lifecycleState;
    final Consistency consistency;
    final MetricsLevel collectedLevel;
    final long capabilities;
    final long collectionGeneration;
    final long collectionStartedAtUnixMs;

    /** The collection fields are captured once before projection. */
    public SnapshotAnchor(String instanceId, ComponentType componentType, long capturedAtUnixMs,
                          long uptimeMs, long snapshotSequence, LifecycleState lifecycleState,
                          Consistency consistency, MetricsLevel collectedLevel, long capabilities,
                          long collectionGeneration, long collectionStartedAtUnixMs) {
        if (instanceId == null || componentType == null || lifecycleState == null
                || consistency == null || collectedLevel == null) {
            throw new IllegalArgumentException("anchor fields must not be null");
        }
        if (instanceId.isEmpty() || capturedAtUnixMs < 0 || uptimeMs < 0 || snapshotSequence < 0
                || collectionGeneration < 0 || collectionStartedAtUnixMs < 0) {
            throw new IllegalArgumentException("anchor identity and time fields are invalid");
        }
        Capability.validate(componentType, collectedLevel, capabilities);
        this.instanceId = instanceId;
        this.componentType = componentType;
        this.capturedAtUnixMs = capturedAtUnixMs;
        this.uptimeMs = uptimeMs;
        this.snapshotSequence = snapshotSequence;
        this.lifecycleState = lifecycleState;
        this.consistency = consistency;
        this.collectedLevel = collectedLevel;
        this.capabilities = capabilities;
        this.collectionGeneration = collectionGeneration;
        this.collectionStartedAtUnixMs = collectionStartedAtUnixMs;
    }

    public long getCollectionGeneration() { return collectionGeneration; }

    public long getCollectionStartedAtUnixMs() { return collectionStartedAtUnixMs; }
}
