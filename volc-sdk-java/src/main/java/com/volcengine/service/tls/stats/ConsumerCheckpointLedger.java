package com.volcengine.service.tls.stats;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Fixed-stripe ledger for dirty consumer checkpoints.
 *
 * <p>Each tracker owns one stable {@link TrackerSlot}. Dirty/clean transitions update a per-stripe
 * ordered timestamp multiset on the event path. Capture only reads the fixed number of pre-aggregated
 * stripe minima, so its cost does not grow with the shard or dirty-checkpoint count.
 */
final class ConsumerCheckpointLedger {
    static final int MAX_STRIPES = 64;

    static final class TrackerSlot {
        private final ConsumerCheckpointLedger owner;
        private final int stableSlotIndex;
        private final int stripeIndex;

        // Guarded by owner.metaLock followed by the slot's stripe lock.
        private boolean dirty;
        private long dirtySinceNanos;
        private long observationGeneration = 1L;

        private TrackerSlot(ConsumerCheckpointLedger owner, int stableSlotIndex, int stripeIndex) {
            this.owner = owner;
            this.stableSlotIndex = stableSlotIndex;
            this.stripeIndex = stripeIndex;
        }

        int getStableSlotIndex() {
            return stableSlotIndex;
        }
    }

    private static final class Stripe {
        private final ReentrantLock lock = new ReentrantLock();
        private final TreeMap<Long, Integer> dirtyTimestamps = new TreeMap<>();
        private boolean hasOldest;
        private long oldestNanos;
    }

    static final class Capture {
        private final long pending;
        private final long lifetimeHighWatermark;
        private final Long oldestAgeMs;
        private final boolean counterSaturated;
        private final boolean accountingInvariantBroken;

        private Capture(long pending,
                        long lifetimeHighWatermark,
                        Long oldestAgeMs,
                        boolean counterSaturated,
                        boolean accountingInvariantBroken) {
            this.pending = pending;
            this.lifetimeHighWatermark = lifetimeHighWatermark;
            this.oldestAgeMs = oldestAgeMs;
            this.counterSaturated = counterSaturated;
            this.accountingInvariantBroken = accountingInvariantBroken;
        }

        long getPending() {
            return pending;
        }

        long getLifetimeHighWatermark() {
            return lifetimeHighWatermark;
        }

        Long getOldestAgeMs() {
            return oldestAgeMs;
        }

        boolean isCounterSaturated() {
            return counterSaturated;
        }

        boolean isAccountingInvariantBroken() {
            return accountingInvariantBroken;
        }
    }

    private final ReentrantLock metaLock = new ReentrantLock();
    private final Stripe[] stripes;

    // Guarded by metaLock.
    private long pending;
    private long lifetimeHighWatermark;
    private long observationGeneration = 1L;

    private volatile boolean counterSaturated;
    private volatile boolean accountingInvariantBroken;

    ConsumerCheckpointLedger(int requestedStripeCount) {
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

    TrackerSlot newTrackerSlot(int stableSlotIndex) {
        if (stableSlotIndex < 0) {
            throw new IllegalArgumentException("stableSlotIndex must be non-negative");
        }
        return new TrackerSlot(this, stableSlotIndex, stableSlotIndex % stripes.length);
    }

    /** Marks the tracker dirty on its clean-to-dirty transition. Duplicate dirty updates are no-ops. */
    boolean markDirty(TrackerSlot slot, long nowNanos) {
        return markDirty(slot, nowNanos, currentGeneration());
    }

    boolean markDirty(TrackerSlot slot, long nowNanos, long generation) {
        requireOwnedSlot(slot);
        if (generation == 0L) {
            return false;
        }
        metaLock.lock();
        Stripe stripe = stripes[slot.stripeIndex];
        try {
            stripe.lock.lock();
            try {
                if (generation != observationGeneration) {
                    if (slot.observationGeneration != observationGeneration) {
                        slot.dirty = false;
                        slot.dirtySinceNanos = 0L;
                        slot.observationGeneration = observationGeneration;
                    }
                    return false;
                }
                if (slot.observationGeneration != generation) {
                    slot.dirty = false;
                    slot.dirtySinceNanos = 0L;
                    slot.observationGeneration = generation;
                }
                if (slot.dirty) {
                    return false;
                }
                slot.dirty = true;
                slot.dirtySinceNanos = nowNanos;
                addTimestamp(stripe, nowNanos);
                pending = saturatedIncrement(pending);
                if (pending > lifetimeHighWatermark) {
                    lifetimeHighWatermark = pending;
                }
                return true;
            } finally {
                stripe.lock.unlock();
            }
        } finally {
            metaLock.unlock();
        }
    }

    /** Clears a successfully persisted or permanently abandoned tracker. Duplicate clears are no-ops. */
    boolean markClean(TrackerSlot slot) {
        return markClean(slot, currentGeneration());
    }

    boolean markClean(TrackerSlot slot, long generation) {
        requireOwnedSlot(slot);
        if (generation == 0L) {
            return false;
        }
        metaLock.lock();
        Stripe stripe = stripes[slot.stripeIndex];
        try {
            stripe.lock.lock();
            try {
                if (generation != observationGeneration) {
                    if (slot.observationGeneration != observationGeneration) {
                        slot.dirty = false;
                        slot.dirtySinceNanos = 0L;
                        slot.observationGeneration = observationGeneration;
                    }
                    return false;
                }
                if (slot.observationGeneration != generation) {
                    slot.dirty = false;
                    slot.dirtySinceNanos = 0L;
                    slot.observationGeneration = generation;
                    return false;
                }
                if (!slot.dirty) {
                    return false;
                }
                removeTimestamp(stripe, slot.dirtySinceNanos);
                slot.dirty = false;
                slot.dirtySinceNanos = 0L;
                if (pending <= 0L) {
                    accountingInvariantBroken = true;
                    pending = 0L;
                } else {
                    pending--;
                }
                return true;
            } finally {
                stripe.lock.unlock();
            }
        } finally {
            metaLock.unlock();
        }
    }

    /** Clears only live pending markers at a collection-generation boundary. */
    void resetObservation(long generation) {
        if (generation == 0L) {
            throw new IllegalArgumentException("generation must be non-zero");
        }
        metaLock.lock();
        lockAllStripes();
        try {
            observationGeneration = generation;
            pending = 0L;
            lifetimeHighWatermark = 0L;
            for (Stripe stripe : stripes) {
                stripe.dirtyTimestamps.clear();
                stripe.hasOldest = false;
                stripe.oldestNanos = 0L;
            }
        } finally {
            unlockAllStripes();
            metaLock.unlock();
        }
    }

    Capture capture(long nowNanos) {
        metaLock.lock();
        lockAllStripes();
        try {
            boolean hasOldest = false;
            long oldest = 0L;
            for (Stripe stripe : stripes) {
                if (stripe.hasOldest && (!hasOldest || stripe.oldestNanos < oldest)) {
                    hasOldest = true;
                    oldest = stripe.oldestNanos;
                }
            }
            Long oldestAgeMs = hasOldest ? elapsedMillis(oldest, nowNanos) : null;
            if ((pending == 0L) == hasOldest) {
                accountingInvariantBroken = true;
            }
            return new Capture(
                    pending,
                    lifetimeHighWatermark,
                    oldestAgeMs,
                    counterSaturated,
                    accountingInvariantBroken);
        } finally {
            unlockAllStripes();
            metaLock.unlock();
        }
    }

    private void requireOwnedSlot(TrackerSlot slot) {
        if (slot == null || slot.owner != this) {
            throw new IllegalArgumentException("tracker slot does not belong to this ledger");
        }
    }

    private long currentGeneration() {
        metaLock.lock();
        try {
            return observationGeneration;
        } finally {
            metaLock.unlock();
        }
    }

    private void addTimestamp(Stripe stripe, long timestamp) {
        Integer count = stripe.dirtyTimestamps.get(timestamp);
        stripe.dirtyTimestamps.put(timestamp, count == null ? 1 : count + 1);
        if (!stripe.hasOldest || timestamp < stripe.oldestNanos) {
            stripe.hasOldest = true;
            stripe.oldestNanos = timestamp;
        }
    }

    private void removeTimestamp(Stripe stripe, long timestamp) {
        Integer count = stripe.dirtyTimestamps.get(timestamp);
        if (count == null) {
            accountingInvariantBroken = true;
            return;
        }
        if (count == 1) {
            stripe.dirtyTimestamps.remove(timestamp);
        } else {
            stripe.dirtyTimestamps.put(timestamp, count - 1);
        }
        Map.Entry<Long, Integer> first = stripe.dirtyTimestamps.firstEntry();
        stripe.hasOldest = first != null;
        stripe.oldestNanos = first == null ? 0L : first.getKey();
    }

    private long saturatedIncrement(long value) {
        if (value == Long.MAX_VALUE) {
            counterSaturated = true;
            return value;
        }
        return value + 1L;
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
