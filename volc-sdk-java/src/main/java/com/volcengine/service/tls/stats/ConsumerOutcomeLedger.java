package com.volcengine.service.tls.stats;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Fixed-stripe ledger for consumer batch ownership and synchronous handler outcomes.
 *
 * <p>A {@link Slot} is owned by one logical shard worker and is reused for its batches. The ledger
 * keeps slot/ready/outcome state in fixed stripes and held/backlog metadata behind one small lock.
 * All event paths and capture use the same stripe-before-metadata lock order. A capture therefore
 * cannot observe a torn state such as an attempt that is in neither in-flight nor a terminal bucket.
 *
 * <p>This is an internal implementation type. It stores no topic, shard, consumer-group, thread, or
 * other business identifier. Capture work is bounded by the fixed stripe count and never scans the
 * registered slots.
 */
final class ConsumerOutcomeLedger {
    static final int MAX_STRIPES = 64;

    private enum BatchState {
        EMPTY,
        READY,
        IN_FLIGHT,
        POST_HANDLER,
        RELEASED_IN_FLIGHT
    }

    /** Stable logical worker slot. The slot index is configuration-local and is not a thread ID. */
    static final class Slot {
        private final ConsumerOutcomeLedger owner;
        private final int slotIndex;
        private final int stripeIndex;

        // All mutable fields below are guarded by the slot's stripe lock.
        private BatchState state = BatchState.EMPTY;
        private long observationGeneration = 1L;
        /** Handler-attempt state is independent from whether this slot owns a live batch. */
        private boolean processActive;
        private long processGeneration;

        private Slot(ConsumerOutcomeLedger owner, int slotIndex, int stripeIndex) {
            this.owner = owner;
            this.slotIndex = slotIndex;
            this.stripeIndex = stripeIndex;
        }

        int getSlotIndex() {
            return slotIndex;
        }
    }

    private static final class Stripe {
        private final ReentrantLock lock = new ReentrantLock();
        private long ready;
        private long processInFlight;
        private long normalReturns;
        private long exceptionReturns;
        private long returnedGroups;
        private long returnedLogs;
    }

    /** Immutable, internally consistent ledger capture. */
    static final class Capture {
        private final long heldBatchReferences;
        private final long readyToProcess;
        private final long processInFlight;
        private final long handlerNormalReturns;
        private final long handlerExceptionReturns;
        private final long processAttempts;
        private final long handlerReturnedGroups;
        private final long handlerReturnedLogs;
        private final Long backlogNonzeroAgeMs;
        private final boolean counterSaturated;
        private final boolean accountingInvariantBroken;

        private Capture(long heldBatchReferences,
                        long readyToProcess,
                        long processInFlight,
                        long handlerNormalReturns,
                        long handlerExceptionReturns,
                        long processAttempts,
                        long handlerReturnedGroups,
                        long handlerReturnedLogs,
                        Long backlogNonzeroAgeMs,
                        boolean counterSaturated,
                        boolean accountingInvariantBroken) {
            this.heldBatchReferences = heldBatchReferences;
            this.readyToProcess = readyToProcess;
            this.processInFlight = processInFlight;
            this.handlerNormalReturns = handlerNormalReturns;
            this.handlerExceptionReturns = handlerExceptionReturns;
            this.processAttempts = processAttempts;
            this.handlerReturnedGroups = handlerReturnedGroups;
            this.handlerReturnedLogs = handlerReturnedLogs;
            this.backlogNonzeroAgeMs = backlogNonzeroAgeMs;
            this.counterSaturated = counterSaturated;
            this.accountingInvariantBroken = accountingInvariantBroken;
        }

        long getHeldBatchReferences() {
            return heldBatchReferences;
        }

        long getReadyToProcess() {
            return readyToProcess;
        }

        long getProcessInFlight() {
            return processInFlight;
        }

        long getHandlerNormalReturns() {
            return handlerNormalReturns;
        }

        long getHandlerExceptionReturns() {
            return handlerExceptionReturns;
        }

        long getProcessAttempts() {
            return processAttempts;
        }

        long getHandlerReturnedGroups() {
            return handlerReturnedGroups;
        }

        long getHandlerReturnedLogs() {
            return handlerReturnedLogs;
        }

        Long getBacklogNonzeroAgeMs() {
            return backlogNonzeroAgeMs;
        }

        boolean isCounterSaturated() {
            return counterSaturated;
        }

        boolean isAccountingInvariantBroken() {
            return accountingInvariantBroken;
        }
    }

    private final ReentrantLock ownershipMetaLock = new ReentrantLock();
    private final Stripe[] stripes;

    // Guarded by ownershipMetaLock. Ready state is kept in the fixed stripes.
    private long heldBatchReferences;
    private boolean backlogActive;
    private long backlogSinceNanos;

    private volatile boolean counterSaturated;
    private volatile boolean accountingInvariantBroken;
    /** Generation of the live ownership gauges; cumulative outcomes are never reset. */
    private long observationGeneration = 1L;

    ConsumerOutcomeLedger(int requestedStripeCount) {
        int stripeCount = requestedStripeCount;
        if (stripeCount < 1) {
            stripeCount = 1;
        } else if (stripeCount > MAX_STRIPES) {
            stripeCount = MAX_STRIPES;
        }
        this.stripes = new Stripe[stripeCount];
        for (int i = 0; i < stripeCount; i++) {
            this.stripes[i] = new Stripe();
        }
    }

    Slot newSlot(int stableSlotIndex) {
        if (stableSlotIndex < 0) {
            throw new IllegalArgumentException("stableSlotIndex must be non-negative");
        }
        return new Slot(this, stableSlotIndex, stableSlotIndex % stripes.length);
    }

    /**
     * Establishes ownership of one non-empty batch and makes it ready for its handler.
     *
     * @return true if ownership was established; false when the slot already held a batch
     */
    boolean onBatchHeld(Slot slot, long groups, long logs, long nowNanos,
                        long generation) {
        requireOwnedSlot(slot);
        if (generation == 0L) {
            return false;
        }
        Stripe stripe = stripes[slot.stripeIndex];
        stripe.lock.lock();
        try {
            ownershipMetaLock.lock();
            try {
                if (generation != observationGeneration) {
                    if (slot.observationGeneration != observationGeneration) {
                        discardStaleSlot(slot, observationGeneration);
                    }
                    return false;
                }
                if (slot.observationGeneration != generation) {
                    // The previous live cohort was discarded at an OFF boundary. The aggregate
                    // was reset there, so stale slot state can be safely overwritten without a
                    // second decrement or an invariant failure. Use discardStaleSlot so the
                    // slot's process flags (processActive/processGeneration) are cleared too;
                    // resetObservation only clears stripe-level counters, so a slot left
                    // in-flight before the boundary would otherwise trip
                    // accountingInvariantBroken on the next beginProcessAttempt.
                    discardStaleSlot(slot, generation);
                }
                if (slot.state != BatchState.EMPTY) {
                    accountingInvariantBroken = true;
                    return false;
                }
                if (groups < 0 || logs < 0) {
                    accountingInvariantBroken = true;
                }
                long previousHeld = heldBatchReferences;
                heldBatchReferences = saturatedIncrement(heldBatchReferences);
                stripe.ready = saturatedIncrement(stripe.ready);
                slot.state = BatchState.READY;
                if (previousHeld == 0L) {
                    backlogActive = true;
                    backlogSinceNanos = nowNanos;
                }
            } finally {
                ownershipMetaLock.unlock();
            }
            return true;
        } finally {
            stripe.lock.unlock();
        }
    }

    /**
     * Starts a handler attempt. A new collection can process a payload acquired before OFF without
     * reconstructing a held/ready batch, so ownership and attempt accounting deliberately differ.
     */
    boolean beginProcessAttempt(Slot slot, long generation, boolean fromReadyBatch) {
        requireOwnedSlot(slot);
        if (generation == 0L) {
            return false;
        }
        Stripe stripe = stripes[slot.stripeIndex];
        stripe.lock.lock();
        try {
            ownershipMetaLock.lock();
            try {
                if (generation != observationGeneration) {
                    if (slot.observationGeneration != observationGeneration) {
                        discardStaleSlot(slot, observationGeneration);
                    }
                    return false;
                }
                if (slot.observationGeneration != generation) {
                    if (fromReadyBatch) {
                        discardStaleSlot(slot, observationGeneration);
                        return false;
                    }
                    discardStaleSlot(slot, generation);
                }
                if (slot.processActive) {
                    accountingInvariantBroken = true;
                    return false;
                }
                if (fromReadyBatch) {
                    if (slot.state != BatchState.READY) {
                        accountingInvariantBroken = true;
                        return false;
                    }
                    stripe.ready = decrementGauge(stripe.ready);
                    slot.state = BatchState.IN_FLIGHT;
                }
                stripe.processInFlight = saturatedIncrement(stripe.processInFlight);
                slot.processActive = true;
                slot.processGeneration = generation;
                return true;
            } finally {
                ownershipMetaLock.unlock();
            }
        } finally {
            stripe.lock.unlock();
        }
    }

    /** Completes a handler attempt independently of batch ownership. */
    boolean finishProcessAttempt(Slot slot, long generation, boolean normal,
                                 long groups, long logs, boolean ownsBatch) {
        requireOwnedSlot(slot);
        if (generation == 0L) {
            return false;
        }
        Stripe stripe = stripes[slot.stripeIndex];
        stripe.lock.lock();
        try {
            ownershipMetaLock.lock();
            try {
                if (generation != observationGeneration) {
                    if (slot.observationGeneration != observationGeneration) {
                        discardStaleSlot(slot, observationGeneration);
                    }
                    return false;
                }
                if (slot.observationGeneration != generation || !slot.processActive
                        || slot.processGeneration != generation) {
                    accountingInvariantBroken = true;
                    return false;
                }
                boolean released = ownsBatch && slot.state == BatchState.RELEASED_IN_FLIGHT;
                if (ownsBatch && slot.state != BatchState.IN_FLIGHT && !released) {
                    accountingInvariantBroken = true;
                    return false;
                }
                stripe.processInFlight = decrementGauge(stripe.processInFlight);
                slot.processActive = false;
                slot.processGeneration = 0L;
                if (normal) {
                    stripe.normalReturns = saturatedIncrement(stripe.normalReturns);
                    stripe.returnedGroups = saturatedAdd(stripe.returnedGroups, Math.max(0L, groups));
                    stripe.returnedLogs = saturatedAdd(stripe.returnedLogs, Math.max(0L, logs));
                    if (ownsBatch) {
                        slot.state = released ? BatchState.EMPTY : BatchState.POST_HANDLER;
                    }
                } else {
                    stripe.exceptionReturns = saturatedIncrement(stripe.exceptionReturns);
                    if (ownsBatch) {
                        if (released) {
                            slot.state = BatchState.EMPTY;
                        } else {
                            stripe.ready = saturatedIncrement(stripe.ready);
                            slot.state = BatchState.READY;
                        }
                    }
                }
                return true;
            } finally {
                ownershipMetaLock.unlock();
            }
        } finally {
            stripe.lock.unlock();
        }
    }

    /**
     * Releases the current batch exactly once. Releasing an in-flight batch prevents an exceptional
     * handler completion from putting it back into the ready state.
     *
     * @return true for the first release of an owned batch, false for an idempotent duplicate
     */
    boolean releaseBatch(Slot slot, long generation) {
        requireOwnedSlot(slot);
        if (generation == 0L) {
            return false;
        }
        Stripe stripe = stripes[slot.stripeIndex];
        stripe.lock.lock();
        try {
            ownershipMetaLock.lock();
            try {
                if (generation != observationGeneration) {
                    if (slot.observationGeneration != observationGeneration) {
                        discardStaleSlot(slot, observationGeneration);
                    }
                    return false;
                }
                if (slot.observationGeneration != generation) {
                    discardStaleSlot(slot, observationGeneration);
                    return false;
                }
                switch (slot.state) {
                    case READY:
                        stripe.ready = decrementGauge(stripe.ready);
                        releaseHeldReference();
                        slot.state = BatchState.EMPTY;
                        return true;
                    case IN_FLIGHT:
                        releaseHeldReference();
                        slot.state = BatchState.RELEASED_IN_FLIGHT;
                        return true;
                    case POST_HANDLER:
                        releaseHeldReference();
                        slot.state = BatchState.EMPTY;
                        return true;
                    case EMPTY:
                    case RELEASED_IN_FLIGHT:
                    default:
                        return false;
                }
            } finally {
                ownershipMetaLock.unlock();
            }
        } finally {
            stripe.lock.unlock();
        }
    }

    /** Clears only live ownership state at a collection-generation boundary. */
    void resetObservation(long generation) {
        if (generation == 0L) {
            throw new IllegalArgumentException("generation must be non-zero");
        }
        lockAllStripes();
        ownershipMetaLock.lock();
        try {
            observationGeneration = generation;
            heldBatchReferences = 0L;
            backlogActive = false;
            backlogSinceNanos = 0L;
            for (Stripe stripe : stripes) {
                stripe.ready = 0L;
                stripe.processInFlight = 0L;
            }
        } finally {
            ownershipMetaLock.unlock();
            unlockAllStripes();
        }
    }

    Capture capture(long nowNanos) {
        lockAllStripes();
        ownershipMetaLock.lock();
        try {
            long ready = 0L;
            long processInFlight = 0L;
            long normal = 0L;
            long exception = 0L;
            long groups = 0L;
            long logs = 0L;
            for (Stripe stripe : stripes) {
                ready = saturatedAdd(ready, stripe.ready);
                processInFlight = saturatedAdd(processInFlight, stripe.processInFlight);
                normal = saturatedAdd(normal, stripe.normalReturns);
                exception = saturatedAdd(exception, stripe.exceptionReturns);
                groups = saturatedAdd(groups, stripe.returnedGroups);
                logs = saturatedAdd(logs, stripe.returnedLogs);
            }
            long attempts = saturatedAdd(saturatedAdd(normal, exception), processInFlight);
            Long backlogAgeMs = null;
            if (heldBatchReferences > 0L && backlogActive) {
                backlogAgeMs = elapsedMillis(backlogSinceNanos, nowNanos);
            }
            if ((heldBatchReferences == 0L) == backlogActive) {
                accountingInvariantBroken = true;
            }
            return new Capture(
                    heldBatchReferences,
                    ready,
                    processInFlight,
                    normal,
                    exception,
                    attempts,
                    groups,
                    logs,
                    backlogAgeMs,
                    counterSaturated,
                    accountingInvariantBroken);
        } finally {
            ownershipMetaLock.unlock();
            unlockAllStripes();
        }
    }

    private void requireOwnedSlot(Slot slot) {
        if (slot == null || slot.owner != this) {
            throw new IllegalArgumentException("slot does not belong to this ledger");
        }
    }

    /** Must be called with the slot stripe lock held. */
    private void discardStaleSlot(Slot slot, long generation) {
        slot.state = BatchState.EMPTY;
        slot.observationGeneration = generation;
        slot.processActive = false;
        slot.processGeneration = 0L;
    }

    private void releaseHeldReference() {
        ownershipMetaLock.lock();
        try {
            heldBatchReferences = decrementGauge(heldBatchReferences);
            if (heldBatchReferences == 0L) {
                backlogActive = false;
                backlogSinceNanos = 0L;
            }
        } finally {
            ownershipMetaLock.unlock();
        }
    }

    private long decrementGauge(long value) {
        if (value <= 0L) {
            accountingInvariantBroken = true;
            return 0L;
        }
        return value - 1L;
    }

    private long saturatedIncrement(long value) {
        return saturatedAdd(value, 1L);
    }

    private long saturatedAdd(long value, long delta) {
        if (delta <= 0L) {
            return value;
        }
        if (value > Long.MAX_VALUE - delta) {
            counterSaturated = true;
            return Long.MAX_VALUE;
        }
        return value + delta;
    }

    private static long elapsedMillis(long startNanos, long endNanos) {
        long elapsed = endNanos - startNanos;
        if (elapsed < 0L) {
            elapsed = 0L;
        }
        return elapsed / 1_000_000L;
    }

    private void lockAllStripes() {
        for (Stripe stripe : stripes) {
            stripe.lock.lock();
        }
    }

    private void unlockAllStripes() {
        for (int i = stripes.length - 1; i >= 0; i--) {
            stripes[i].lock.unlock();
        }
    }
}
