package com.volcengine.service.tls.stats;

/**
 * The single authority for Producer-managed memory.
 *
 * <p>The accountant owns both the blocking byte budget and the fixed-cardinality payload-stage
 * ledger used for exact ownership validation and stats snapshots. All mutations and captures use the same
 * monitor, so a capture cannot combine a limiter value from one instant with stage values from
 * another. Observation can be disabled without allocating the stage ledger or observability
 * counters; four primitive stage balances remain part of the authoritative budget ledger so wrong
 * stage operations cannot corrupt the budget while observation is off.
 *
 * <p>This is an internal SDK type. It deliberately exposes only fixed-cardinality state and never
 * keeps references to payloads, queues, callbacks, or worker threads.
 */
public final class ManagedMemoryAccountant {

    /** Result of a managed-memory acquisition attempt. */
    public enum AcquireResult {
        ACQUIRED,
        CAPACITY_EXCEEDED,
        TIMED_OUT,
        CLOSED
    }

    /** The four mutually-exclusive payload ownership stages. */
    public enum PayloadStage {
        INGRESS,
        AGGREGATE,
        SEND,
        RETRY
    }

    private final long capacityBytes;
    private final long payloadCapacityBytes;
    private ObservedState observed;
    private boolean observationEnabled;

    private long usedBytes;
    private long payloadUsedBytes;
    private long ingressPayloadBytes;
    private long aggregatePayloadBytes;
    private long sendPayloadBytes;
    private long retryPayloadBytes;
    private boolean payloadClosed;
    private boolean closed;
    private boolean forceReleased;

    /** Allocated only for CORE/DETAILED observation. */
    private static final class ObservedState {
        private long highWatermarkBytes;
        private long rejectedTotal;
        private long payloadAdmissionRejectedTotal;
        private long runtimeBufferRejectedTotal;
        private long ingressHighWatermarkBytes;
        private long aggregateHighWatermarkBytes;
        private long sendHighWatermarkBytes;
        private long retryHighWatermarkBytes;
    }

    /**
     * A once-releasable payload ownership token.
     *
     * <p>The token carries no payload reference. Its mutable fields are accessed only while holding
     * the owning accountant's monitor. A terminal release that loses a race with another terminal
     * release or a force release returns {@code false} and performs no accounting mutation.
     */
    public static final class PayloadReservation {
        private final ManagedMemoryAccountant owner;
        private final AcquireResult acquireResult;
        private long bytes;
        private PayloadStage stage;
        private boolean active;

        private PayloadReservation(ManagedMemoryAccountant owner, long bytes, PayloadStage stage) {
            this.owner = owner;
            this.acquireResult = AcquireResult.ACQUIRED;
            this.bytes = bytes;
            this.stage = stage;
            this.active = true;
        }

        private PayloadReservation(AcquireResult acquireResult) {
            this.owner = null;
            this.acquireResult = acquireResult;
            this.bytes = 0;
            this.stage = null;
            this.active = false;
        }

        public AcquireResult getAcquireResult() {
            return acquireResult;
        }

        public boolean isAcquired() {
            return acquireResult == AcquireResult.ACQUIRED;
        }

        public long getBytes() {
            if (owner == null) {
                return 0;
            }
            synchronized (owner) {
                return bytes;
            }
        }

        public PayloadStage getStage() {
            if (owner == null) {
                return null;
            }
            synchronized (owner) {
                return stage;
            }
        }

        public boolean isActive() {
            if (owner == null) {
                return false;
            }
            synchronized (owner) {
                return active && !owner.forceReleased;
            }
        }

        /** Moves all bytes from the expected stage to the next stage atomically. */
        public boolean transition(PayloadStage expected, PayloadStage next) {
            if (owner == null) {
                return false;
            }
            return owner.transition(this, expected, next);
        }

        /**
         * Adjusts this reservation to an exact byte size without changing its stage.
         *
         * <p>Growth obeys the same payload and total limits as initial acquisition. Shrinkage releases
         * bytes immediately. A failed growth leaves the reservation unchanged.
         */
        public AcquireResult resize(long newBytes, long timeoutMs) throws InterruptedException {
            if (owner == null) {
                return acquireResult;
            }
            return owner.resize(this, newBytes, timeoutMs);
        }

        /** Releases this reservation exactly once at a terminal boundary. */
        public boolean releaseTerminal() {
            if (owner == null) {
                return false;
            }
            return owner.releaseTerminal(this);
        }
    }

    private static final PayloadReservation CAPACITY_EXCEEDED_RESERVATION =
            new PayloadReservation(AcquireResult.CAPACITY_EXCEEDED);
    private static final PayloadReservation TIMED_OUT_RESERVATION =
            new PayloadReservation(AcquireResult.TIMED_OUT);
    private static final PayloadReservation CLOSED_RESERVATION =
            new PayloadReservation(AcquireResult.CLOSED);

    /** Immutable, same-instant capture of the managed-memory ledger. */
    public static final class Capture {
        private final boolean observationEnabled;
        private final long limitBytes;
        private final long payloadLimitBytes;
        private final long usedBytes;
        private final long payloadOwnedBytes;
        private final long boundedRuntimeBufferBytes;
        private final long highWatermarkBytes;
        private final long rejectedTotal;
        private final long payloadAdmissionRejectedTotal;
        private final long runtimeBufferRejectedTotal;
        private final long ingressOwnedBytes;
        private final long aggregateOwnedBytes;
        private final long sendOwnedBytes;
        private final long retryOwnedBytes;
        private final long ingressHighWatermarkBytes;
        private final long aggregateHighWatermarkBytes;
        private final long sendHighWatermarkBytes;
        private final long retryHighWatermarkBytes;

        private Capture(boolean observationEnabled, long limitBytes, long payloadLimitBytes,
                        long usedBytes, long payloadOwnedBytes, long boundedRuntimeBufferBytes,
                        long highWatermarkBytes, long rejectedTotal, long ingressOwnedBytes,
                        long aggregateOwnedBytes, long sendOwnedBytes, long retryOwnedBytes,
                        long ingressHighWatermarkBytes, long aggregateHighWatermarkBytes,
                        long sendHighWatermarkBytes, long retryHighWatermarkBytes,
                        long payloadAdmissionRejectedTotal, long runtimeBufferRejectedTotal) {
            this.observationEnabled = observationEnabled;
            this.limitBytes = limitBytes;
            this.payloadLimitBytes = payloadLimitBytes;
            this.usedBytes = usedBytes;
            this.payloadOwnedBytes = payloadOwnedBytes;
            this.boundedRuntimeBufferBytes = boundedRuntimeBufferBytes;
            this.highWatermarkBytes = highWatermarkBytes;
            this.rejectedTotal = rejectedTotal;
            this.payloadAdmissionRejectedTotal = payloadAdmissionRejectedTotal;
            this.runtimeBufferRejectedTotal = runtimeBufferRejectedTotal;
            this.ingressOwnedBytes = ingressOwnedBytes;
            this.aggregateOwnedBytes = aggregateOwnedBytes;
            this.sendOwnedBytes = sendOwnedBytes;
            this.retryOwnedBytes = retryOwnedBytes;
            this.ingressHighWatermarkBytes = ingressHighWatermarkBytes;
            this.aggregateHighWatermarkBytes = aggregateHighWatermarkBytes;
            this.sendHighWatermarkBytes = sendHighWatermarkBytes;
            this.retryHighWatermarkBytes = retryHighWatermarkBytes;
        }

        public boolean isObservationEnabled() {
            return observationEnabled;
        }

        public long getLimitBytes() {
            return limitBytes;
        }

        public long getPayloadLimitBytes() {
            return payloadLimitBytes;
        }

        public long getUsedBytes() {
            return usedBytes;
        }

        public long getPayloadOwnedBytes() {
            return payloadOwnedBytes;
        }

        public long getBoundedRuntimeBufferBytes() {
            return boundedRuntimeBufferBytes;
        }

        public long getHighWatermarkBytes() {
            return highWatermarkBytes;
        }

        public long getRejectedTotal() {
            return rejectedTotal;
        }
        public long getPayloadAdmissionRejectedTotal() { return payloadAdmissionRejectedTotal; }
        public long getRuntimeBufferRejectedTotal() { return runtimeBufferRejectedTotal; }

        public long getIngressOwnedBytes() {
            return ingressOwnedBytes;
        }

        public long getAggregateOwnedBytes() {
            return aggregateOwnedBytes;
        }

        public long getSendOwnedBytes() {
            return sendOwnedBytes;
        }

        public long getRetryOwnedBytes() {
            return retryOwnedBytes;
        }

        public long getIngressHighWatermarkBytes() { return ingressHighWatermarkBytes; }
        public long getAggregateHighWatermarkBytes() { return aggregateHighWatermarkBytes; }
        public long getSendHighWatermarkBytes() { return sendHighWatermarkBytes; }
        public long getRetryHighWatermarkBytes() { return retryHighWatermarkBytes; }
    }

    public ManagedMemoryAccountant(long capacityBytes, long payloadCapacityBytes,
                                   boolean observationEnabled) {
        if (capacityBytes <= 0 || payloadCapacityBytes <= 0
                || payloadCapacityBytes > capacityBytes) {
            throw new IllegalArgumentException("invalid managed-memory capacity");
        }
        this.capacityBytes = capacityBytes;
        this.payloadCapacityBytes = payloadCapacityBytes;
        this.observed = observationEnabled ? new ObservedState() : null;
        this.observationEnabled = observationEnabled;
    }

    /** Observation toggles do not alter the authoritative functional ownership ledger. */
    public synchronized void setObservationEnabled(boolean enabled) {
        if (observationEnabled == enabled) return;
        if (enabled) {
            if (observed == null) observed = new ObservedState();
            observed.highWatermarkBytes = usedBytes;
            observed.ingressHighWatermarkBytes = ingressPayloadBytes;
            observed.aggregateHighWatermarkBytes = aggregatePayloadBytes;
            observed.sendHighWatermarkBytes = sendPayloadBytes;
            observed.retryHighWatermarkBytes = retryPayloadBytes;
        }
        observationEnabled = enabled;
    }

    /** Existing limiter-compatible payload acquisition; observed payload starts in INGRESS. */
    public synchronized AcquireResult acquirePayloadBytes(long bytes, long timeoutMs)
            throws InterruptedException {
        return acquire(bytes, timeoutMs, true, PayloadStage.INGRESS);
    }

    /** Existing limiter-compatible temporary acquisition; represented as bounded runtime memory. */
    public synchronized AcquireResult acquireRuntimeBytes(long bytes, long timeoutMs)
            throws InterruptedException {
        return acquire(bytes, timeoutMs, false, null);
    }

    /**
     * Acquires an observed payload and returns its once-releasable ownership token.
     *
     * @return a successful once-releasable reservation, or a shared inactive result carrying the
     *         exact acquisition failure reason
     */
    public synchronized PayloadReservation acquirePayload(long bytes, PayloadStage initialStage,
                                                          long timeoutMs) throws InterruptedException {
        if (initialStage == null) {
            throw new NullPointerException("initialStage");
        }
        AcquireResult result = acquire(bytes, timeoutMs, true, initialStage);
        if (result == AcquireResult.ACQUIRED) {
            return new PayloadReservation(this, Math.max(0L, bytes), initialStage);
        }
        switch (result) {
            case CAPACITY_EXCEEDED:
                return CAPACITY_EXCEEDED_RESERVATION;
            case TIMED_OUT:
                return TIMED_OUT_RESERVATION;
            case CLOSED:
                return CLOSED_RESERVATION;
            default:
                throw new IllegalStateException("unexpected acquire result " + result);
        }
    }

    private AcquireResult acquire(long bytes, long timeoutMs, boolean payload, PayloadStage stage)
            throws InterruptedException {
        if (bytes <= 0) {
            return AcquireResult.ACQUIRED;
        }
        if (isClosedFor(payload)) return AcquireResult.CLOSED;
        if (bytes > capacityBytes || (payload && bytes > payloadCapacityBytes)) {
            rejectObserved(payload);
            return AcquireResult.CAPACITY_EXCEEDED;
        }
        long deadline = timeoutMs > 0 ? saturatedDeadline(timeoutMs) : 0L;
        try {
            while (!isClosedFor(payload) && !hasCapacity(bytes, payload)) {
                if (timeoutMs == 0) {
                    rejectObserved(payload);
                    return AcquireResult.TIMED_OUT;
                }
                if (timeoutMs < 0) {
                    wait();
                    continue;
                }
                long remains = deadline - monotonicMs();
                if (remains <= 0) {
                    rejectObserved(payload);
                    return AcquireResult.TIMED_OUT;
                }
                wait(remains);
            }
        } catch (InterruptedException e) {
            throw e;
        }
        if (isClosedFor(payload)) {
            return AcquireResult.CLOSED;
        }
        usedBytes += bytes;
        if (payload) {
            payloadUsedBytes += bytes;
            addPayloadStage(stage, bytes);
        }
        updateHighWatermark();
        return AcquireResult.ACQUIRED;
    }

    private long saturatedDeadline(long timeoutMs) {
        long now = monotonicMs();
        return timeoutMs > Long.MAX_VALUE - now ? Long.MAX_VALUE : now + timeoutMs;
    }

    private boolean hasCapacity(long bytes, boolean payload) {
        return bytes <= capacityBytes - usedBytes
                && (!payload || bytes <= payloadCapacityBytes - usedBytes);
    }

    private boolean isClosedFor(boolean payload) {
        return closed || (payload && payloadClosed);
    }

    private void rejectObserved(boolean payload) {
        if (!observationEnabled) return;
        // Saturate the shared total first, so the two classes always conserve that total.
        if (observed.rejectedTotal == Long.MAX_VALUE) return;
        observed.rejectedTotal++;
        if (payload) observed.payloadAdmissionRejectedTotal++;
        else observed.runtimeBufferRejectedTotal++;
    }

    private void updateHighWatermark() {
        if (observationEnabled && usedBytes > observed.highWatermarkBytes) {
            observed.highWatermarkBytes = usedBytes;
        }
    }

    private void addPayloadStage(PayloadStage stage, long bytes) {
        if (bytes <= 0) {
            return;
        }
        switch (stage) {
            case INGRESS:
                ingressPayloadBytes += bytes;
                break;
            case AGGREGATE:
                aggregatePayloadBytes += bytes;
                break;
            case SEND:
                sendPayloadBytes += bytes;
                break;
            case RETRY:
                retryPayloadBytes += bytes;
                break;
            default:
                throw new IllegalStateException("unexpected payload stage " + stage);
        }
        updateStageHighWatermark(stage);
    }

    private void updateStageHighWatermark(PayloadStage stage) {
        if (!observationEnabled) return;
        long current = getPayloadStageBytes(stage);
        switch (stage) {
            case INGRESS:
                observed.ingressHighWatermarkBytes = Math.max(observed.ingressHighWatermarkBytes, current);
                break;
            case AGGREGATE:
                observed.aggregateHighWatermarkBytes = Math.max(observed.aggregateHighWatermarkBytes, current);
                break;
            case SEND:
                observed.sendHighWatermarkBytes = Math.max(observed.sendHighWatermarkBytes, current);
                break;
            case RETRY:
                observed.retryHighWatermarkBytes = Math.max(observed.retryHighWatermarkBytes, current);
                break;
            default:
                throw new IllegalStateException("unexpected payload stage " + stage);
        }
    }

    /**
     * Moves an exact byte range between payload stages without allocating a reservation token.
     *
     * <p>This is the aggregation path: callers may acquire each group into INGRESS, transition each
     * group into AGGREGATE, then move the combined BatchLog byte count through SEND/RETRY. The
     * operation never scans groups or batches. With observation OFF, the same primitive ownership
     * balances remain authoritative without allocating observation state.
     */
    public synchronized boolean transitionPayloadBytes(PayloadStage expected, PayloadStage next,
                                                       long bytes) {
        if (expected == null || next == null) {
            throw new NullPointerException("payload stage");
        }
        if (bytes <= 0 || expected == next) {
            return !forceReleased;
        }
        if (forceReleased) {
            return false;
        }
        if (bytes > payloadUsedBytes || bytes > usedBytes) {
            throw new IllegalStateException("payload accounting underflow");
        }
        subtractPayloadStage(expected, bytes);
        addPayloadStage(next, bytes);
        return true;
    }

    /** Releases an exact byte range from the specified payload stage. */
    public synchronized void releasePayloadBytes(PayloadStage stage, long bytes) {
        if (stage == null) {
            throw new NullPointerException("stage");
        }
        if (forceReleased || bytes <= 0) {
            return;
        }
        releasePayloadFromStage(stage, bytes);
    }

    /**
     * Calibrates an exact payload range while preserving its current ownership stage.
     *
     * <p>Growth acquires only the positive delta and leaves the old reservation unchanged on
     * failure. Shrinkage releases only the negative delta. Both sizes must be non-negative.
     */
    public synchronized AcquireResult resizePayloadBytes(PayloadStage stage, long oldBytes,
                                                         long newBytes, long timeoutMs)
            throws InterruptedException {
        if (stage == null) {
            throw new NullPointerException("stage");
        }
        if (oldBytes < 0 || newBytes < 0) {
            throw new IllegalArgumentException("payload sizes must be non-negative");
        }
        if (forceReleased) {
            return AcquireResult.CLOSED;
        }
        if (oldBytes > getPayloadStageBytes(stage)) {
            throw new IllegalStateException("payload stage does not own oldBytes");
        }
        if (oldBytes == newBytes) {
            return AcquireResult.ACQUIRED;
        }
        if (newBytes > oldBytes) {
            return acquire(newBytes - oldBytes, timeoutMs, true, stage);
        }
        releasePayloadFromStage(stage, oldBytes - newBytes);
        return AcquireResult.ACQUIRED;
    }

    private synchronized boolean transition(PayloadReservation reservation, PayloadStage expected,
                                            PayloadStage next) {
        requireOwner(reservation);
        if (expected == null || next == null) {
            throw new NullPointerException("payload stage");
        }
        if (!reservation.active || forceReleased) {
            reservation.active = false;
            return false;
        }
        if (reservation.stage != expected) {
            throw new IllegalStateException("payload stage is " + reservation.stage
                    + ", expected " + expected);
        }
        if (expected == next || reservation.bytes == 0) {
            reservation.stage = next;
            return true;
        }
        subtractPayloadStage(expected, reservation.bytes);
        addPayloadStage(next, reservation.bytes);
        reservation.stage = next;
        return true;
    }

    private synchronized AcquireResult resize(PayloadReservation reservation, long newBytes,
                                              long timeoutMs) throws InterruptedException {
        requireOwner(reservation);
        if (newBytes < 0) {
            throw new IllegalArgumentException("newBytes must be non-negative");
        }
        if (!reservation.active || forceReleased) {
            reservation.active = false;
            return AcquireResult.CLOSED;
        }
        long delta = newBytes - reservation.bytes;
        if (delta == 0) {
            return AcquireResult.ACQUIRED;
        }
        if (delta > 0) {
            PayloadStage stageAtAcquire = reservation.stage;
            AcquireResult result = acquire(delta, timeoutMs, true, stageAtAcquire);
            if (result != AcquireResult.ACQUIRED) {
                return result;
            }
            // acquire() may wait and therefore release this monitor. A concurrent terminal/force
            // release wins over the resize; roll back the newly acquired delta. A concurrent stage
            // transition keeps the resize but moves the delta into the token's current stage.
            if (!reservation.active || forceReleased) {
                releasePayloadFromStage(stageAtAcquire, delta);
                reservation.active = false;
                return AcquireResult.CLOSED;
            }
            if (reservation.stage != stageAtAcquire) {
                subtractPayloadStage(stageAtAcquire, delta);
                addPayloadStage(reservation.stage, delta);
            }
        } else {
            releasePayloadFromStage(reservation.stage, -delta);
        }
        reservation.bytes = newBytes;
        return AcquireResult.ACQUIRED;
    }

    private synchronized boolean releaseTerminal(PayloadReservation reservation) {
        requireOwner(reservation);
        if (!reservation.active || forceReleased) {
            reservation.active = false;
            return false;
        }
        releasePayloadFromStage(reservation.stage, reservation.bytes);
        reservation.bytes = 0;
        reservation.active = false;
        return true;
    }

    private void requireOwner(PayloadReservation reservation) {
        if (reservation == null || reservation.owner != this) {
            throw new IllegalArgumentException("reservation belongs to another accountant");
        }
    }

    /** Releases payload bytes across stages deterministically using the same ownership ledger. */
    public synchronized void releasePayloadBytes(long bytes) {
        if (bytes <= 0) {
            return;
        }
        if (forceReleased) {
            return;
        }
        if (bytes > payloadUsedBytes || bytes > usedBytes) {
            throw new IllegalStateException("release exceeds acquired payload bytes");
        }
        long remains = bytes;
        long take = Math.min(ingressPayloadBytes, remains);
        ingressPayloadBytes -= take;
        remains -= take;
        take = Math.min(aggregatePayloadBytes, remains);
        aggregatePayloadBytes -= take;
        remains -= take;
        take = Math.min(sendPayloadBytes, remains);
        sendPayloadBytes -= take;
        remains -= take;
        take = Math.min(retryPayloadBytes, remains);
        retryPayloadBytes -= take;
        remains -= take;
        if (remains != 0) {
            throw new IllegalStateException("payload stage accounting underflow");
        }
        payloadUsedBytes -= bytes;
        usedBytes -= bytes;
        notifyAll();
    }

    public synchronized void releaseRuntimeBytes(long bytes) {
        if (bytes <= 0) {
            return;
        }
        if (forceReleased) {
            return;
        }
        long runtimeUsed = usedBytes - payloadUsedBytes;
        if (bytes > runtimeUsed) {
            throw new IllegalStateException("release exceeds acquired runtime bytes");
        }
        usedBytes -= bytes;
        notifyAll();
    }

    private void releasePayloadFromStage(PayloadStage stage, long bytes) {
        if (bytes <= 0) {
            return;
        }
        if (bytes > payloadUsedBytes || bytes > usedBytes) {
            throw new IllegalStateException("payload accounting underflow");
        }
        subtractPayloadStage(stage, bytes);
        payloadUsedBytes -= bytes;
        usedBytes -= bytes;
        notifyAll();
    }

    private void subtractPayloadStage(PayloadStage stage, long bytes) {
        long current = getPayloadStageBytes(stage);
        if (bytes > current) {
            throw new IllegalStateException("payload stage accounting underflow");
        }
        setPayloadStageBytes(stage, current - bytes);
    }

    private long getPayloadStageBytes(PayloadStage stage) {
        switch (stage) {
            case INGRESS:
                return ingressPayloadBytes;
            case AGGREGATE:
                return aggregatePayloadBytes;
            case SEND:
                return sendPayloadBytes;
            case RETRY:
                return retryPayloadBytes;
            default:
                throw new IllegalStateException("unexpected payload stage " + stage);
        }
    }

    private void setPayloadStageBytes(PayloadStage stage, long bytes) {
        switch (stage) {
            case INGRESS:
                ingressPayloadBytes = bytes;
                break;
            case AGGREGATE:
                aggregatePayloadBytes = bytes;
                break;
            case SEND:
                sendPayloadBytes = bytes;
                break;
            case RETRY:
                retryPayloadBytes = bytes;
                break;
            default:
                throw new IllegalStateException("unexpected payload stage " + stage);
        }
    }

    public synchronized void closePayload() {
        payloadClosed = true;
        notifyAll();
    }

    public synchronized void close() {
        closed = true;
        payloadClosed = true;
        notifyAll();
    }

    /**
     * Atomically closes the accountant and force-releases every managed byte.
     *
     * <p>This is the closeNow/final-sweep primitive. It retains lifetime HWM/rejection facts but
     * zeros current payload/runtime/stage ownership. Late terminal or finally releases become safe
     * no-ops, preventing double release and underflow.
     */
    public synchronized void forceReleaseAll() {
        closed = true;
        payloadClosed = true;
        forceReleased = true;
        usedBytes = 0;
        payloadUsedBytes = 0;
        ingressPayloadBytes = 0;
        aggregatePayloadBytes = 0;
        sendPayloadBytes = 0;
        retryPayloadBytes = 0;
        notifyAll();
    }

    public synchronized long getUsedBytes() {
        return usedBytes;
    }

    public synchronized long getPayloadUsedBytes() {
        return payloadUsedBytes;
    }

    public long getCapacityBytes() {
        return capacityBytes;
    }

    public long getPayloadCapacityBytes() {
        return payloadCapacityBytes;
    }

    /** Returns a same-monitor immutable capture; no business container is scanned. */
    public synchronized Capture capture() {
        if (!observationEnabled) {
            return new Capture(false, capacityBytes, payloadCapacityBytes, usedBytes,
                    payloadUsedBytes, usedBytes - payloadUsedBytes, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        long payload = ingressPayloadBytes + aggregatePayloadBytes
                + sendPayloadBytes + retryPayloadBytes;
        long runtime = usedBytes - payloadUsedBytes;
        if (payload != payloadUsedBytes
                || usedBytes != payload + runtime) {
            throw new IllegalStateException("managed-memory accounting invariant broken");
        }
        return new Capture(true, capacityBytes, payloadCapacityBytes, usedBytes, payload,
                runtime, observed.highWatermarkBytes, observed.rejectedTotal,
                ingressPayloadBytes, aggregatePayloadBytes, sendPayloadBytes, retryPayloadBytes,
                observed.ingressHighWatermarkBytes, observed.aggregateHighWatermarkBytes,
                observed.sendHighWatermarkBytes, observed.retryHighWatermarkBytes,
                observed.payloadAdmissionRejectedTotal, observed.runtimeBufferRejectedTotal);
    }

    private static long monotonicMs() {
        return System.nanoTime() / 1_000_000L;
    }
}
