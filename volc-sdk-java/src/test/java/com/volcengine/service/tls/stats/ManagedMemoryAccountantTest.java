package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.producer.MemoryLimiter;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.AcquireResult.ACQUIRED;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.AcquireResult.CAPACITY_EXCEEDED;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.AcquireResult.CLOSED;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.AcquireResult.TIMED_OUT;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.AGGREGATE;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.INGRESS;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.RETRY;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.SEND;

public class ManagedMemoryAccountantTest {

    @Test
    public void acquireReturnsStableReasonsWithoutConsumingRejectedBytes() throws Exception {
        ManagedMemoryAccountant accountant = new ManagedMemoryAccountant(100, 80, true);

        Assert.assertEquals(CAPACITY_EXCEEDED, accountant.acquirePayloadBytes(81, 0));
        ManagedMemoryAccountant.PayloadReservation failed =
                accountant.acquirePayload(81, INGRESS, 0);
        Assert.assertFalse(failed.isAcquired());
        Assert.assertEquals(CAPACITY_EXCEEDED, failed.getAcquireResult());
        Assert.assertFalse(failed.releaseTerminal());
        Assert.assertEquals(ACQUIRED, accountant.acquirePayloadBytes(80, 0));
        Assert.assertEquals(ACQUIRED, accountant.acquireRuntimeBytes(20, 0));
        Assert.assertEquals(TIMED_OUT, accountant.acquireRuntimeBytes(1, 0));
        accountant.closePayload();
        Assert.assertEquals(CLOSED, accountant.acquirePayloadBytes(1, 0));

        ManagedMemoryAccountant.Capture capture = accountant.capture();
        Assert.assertEquals(100, capture.getUsedBytes());
        Assert.assertEquals(80, capture.getPayloadOwnedBytes());
        Assert.assertEquals(20, capture.getBoundedRuntimeBufferBytes());
        Assert.assertEquals("closed is not admission pressure", 3, capture.getRejectedTotal());
    }

    @Test
    public void separatesPressureRejectionsFromCancellationAndRetainsOffOwnership() throws Exception {
        ManagedMemoryAccountant memory = new ManagedMemoryAccountant(100, 80, true);
        Assert.assertEquals(ACQUIRED, memory.acquirePayloadBytes(50, 0));
        Assert.assertEquals(CAPACITY_EXCEEDED, memory.acquirePayloadBytes(81, 0));
        Assert.assertEquals(CAPACITY_EXCEEDED, memory.acquireRuntimeBytes(101, 0));
        Assert.assertEquals(1, memory.capture().getPayloadAdmissionRejectedTotal());
        Assert.assertEquals(1, memory.capture().getRuntimeBufferRejectedTotal());
        memory.setObservationEnabled(false);
        memory.releasePayloadBytes(10);
        memory.acquireRuntimeBytes(101, 0);
        memory.setObservationEnabled(true);
        ManagedMemoryAccountant.Capture capture = memory.capture();
        Assert.assertEquals(40, capture.getPayloadOwnedBytes());
        Assert.assertEquals(40, capture.getUsedBytes());
        Assert.assertEquals(40, capture.getHighWatermarkBytes());
        Assert.assertEquals(2, capture.getRejectedTotal());
        memory.close();
        Assert.assertEquals(CLOSED, memory.acquirePayloadBytes(1, 0));
        Assert.assertEquals(2, memory.capture().getRejectedTotal());
    }

    @Test
    public void payloadAdmissionReservesHeadroomAgainstTotalManagedUsage() throws Exception {
        ManagedMemoryAccountant memory = new ManagedMemoryAccountant(100, 80, true);
        Assert.assertEquals(ACQUIRED, memory.acquireRuntimeBytes(30, 0));
        Assert.assertEquals(ACQUIRED, memory.acquirePayloadBytes(50, 0));
        Assert.assertEquals(TIMED_OUT, memory.acquirePayloadBytes(1, 0));
        Assert.assertEquals(ACQUIRED, memory.acquireRuntimeBytes(20, 0));
        Assert.assertEquals(100, memory.getUsedBytes());
        Assert.assertEquals(1, memory.capture().getPayloadAdmissionRejectedTotal());
    }

    @Test
    public void payloadMovesThroughAllStagesAndCaptureConservesBytes() throws Exception {
        ManagedMemoryAccountant accountant = new ManagedMemoryAccountant(100, 80, true);
        ManagedMemoryAccountant.PayloadReservation reservation =
                accountant.acquirePayload(40, INGRESS, 0);
        Assert.assertTrue(reservation.isAcquired());
        assertStages(accountant.capture(), 40, 0, 0, 0);

        Assert.assertTrue(reservation.transition(INGRESS, AGGREGATE));
        assertStages(accountant.capture(), 0, 40, 0, 0);
        Assert.assertTrue(reservation.transition(AGGREGATE, SEND));
        assertStages(accountant.capture(), 0, 0, 40, 0);

        Assert.assertEquals(ACQUIRED, accountant.acquireRuntimeBytes(10, 0));
        Assert.assertEquals(ACQUIRED, reservation.resize(60, 0));
        ManagedMemoryAccountant.Capture grown = accountant.capture();
        assertStages(grown, 0, 0, 60, 0);
        Assert.assertEquals(70, grown.getUsedBytes());
        Assert.assertEquals(70, grown.getHighWatermarkBytes());

        Assert.assertEquals(ACQUIRED, reservation.resize(30, 0));
        Assert.assertTrue(reservation.transition(SEND, RETRY));
        assertStages(accountant.capture(), 0, 0, 0, 30);
        Assert.assertTrue(reservation.transition(RETRY, SEND));
        assertStages(accountant.capture(), 0, 0, 30, 0);

        Assert.assertTrue(reservation.releaseTerminal());
        ManagedMemoryAccountant.Capture terminal = accountant.capture();
        Assert.assertEquals(10, terminal.getUsedBytes());
        Assert.assertEquals(0, terminal.getPayloadOwnedBytes());
        Assert.assertEquals(10, terminal.getBoundedRuntimeBufferBytes());
        Assert.assertEquals(40, terminal.getIngressHighWatermarkBytes());
        Assert.assertEquals(40, terminal.getAggregateHighWatermarkBytes());
        Assert.assertEquals(60, terminal.getSendHighWatermarkBytes());
        Assert.assertEquals(30, terminal.getRetryHighWatermarkBytes());
        accountant.releaseRuntimeBytes(10);
        Assert.assertEquals(0, accountant.capture().getUsedBytes());
    }

    @Test
    public void byteAccountingAggregatesMultipleGroupsAndCalibratesWithoutSecondLedger() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(100, 80, true);

        Assert.assertTrue(limiter.acquirePayload(10, 0));
        Assert.assertTrue(limiter.transitionPayloadBytes(INGRESS, AGGREGATE, 10));
        Assert.assertTrue(limiter.acquirePayload(20, 0));
        Assert.assertTrue(limiter.transitionPayloadBytes(INGRESS, AGGREGATE, 20));
        Assert.assertTrue(limiter.acquirePayload(15, 0));
        Assert.assertTrue(limiter.transitionPayloadBytes(INGRESS, AGGREGATE, 15));
        assertStages(limiter.getAccountant().capture(), 0, 45, 0, 0);

        Assert.assertTrue(limiter.transitionPayloadBytes(AGGREGATE, SEND, 45));
        Assert.assertEquals(ACQUIRED, limiter.resizePayloadBytes(SEND, 45, 55, 0));
        assertStages(limiter.getAccountant().capture(), 0, 0, 55, 0);
        Assert.assertEquals(ACQUIRED, limiter.resizePayloadBytes(SEND, 55, 50, 0));
        Assert.assertTrue(limiter.transitionPayloadBytes(SEND, RETRY, 50));
        assertStages(limiter.getAccountant().capture(), 0, 0, 0, 50);
        Assert.assertTrue(limiter.transitionPayloadBytes(RETRY, SEND, 50));
        assertStages(limiter.getAccountant().capture(), 0, 0, 50, 0);

        limiter.releasePayloadBytes(SEND, 50);
        ManagedMemoryAccountant.Capture terminal = limiter.getAccountant().capture();
        Assert.assertEquals(0, terminal.getUsedBytes());
        assertStages(terminal, 0, 0, 0, 0);
        Assert.assertEquals(55, terminal.getHighWatermarkBytes());
    }

    @Test
    public void byteAccountingRejectsWrongStageAndUnderflow() throws Exception {
        ManagedMemoryAccountant accountant = new ManagedMemoryAccountant(100, 80, true);
        Assert.assertEquals(ACQUIRED, accountant.acquirePayloadBytes(20, 0));
        Assert.assertTrue(accountant.transitionPayloadBytes(INGRESS, AGGREGATE, 20));

        try {
            accountant.transitionPayloadBytes(INGRESS, SEND, 1);
            Assert.fail("wrong source stage must fail");
        } catch (IllegalStateException expected) {
            // expected
        }
        try {
            accountant.releasePayloadBytes(SEND, 1);
            Assert.fail("release from wrong stage must fail");
        } catch (IllegalStateException expected) {
            // expected
        }
        try {
            accountant.transitionPayloadBytes(AGGREGATE, SEND, 21);
            Assert.fail("transition beyond owned payload must fail");
        } catch (IllegalStateException expected) {
            // expected
        }
        try {
            accountant.resizePayloadBytes(SEND, 20, 21, 0);
            Assert.fail("resize from wrong stage must fail");
        } catch (IllegalStateException expected) {
            // expected
        }

        assertStages(accountant.capture(), 0, 20, 0, 0);
        accountant.releasePayloadBytes(AGGREGATE, 20);
        Assert.assertEquals(0, accountant.capture().getUsedBytes());
    }

    @Test
    public void repeatedTerminalReleaseIsANoopAndCannotUnderflow() throws Exception {
        ManagedMemoryAccountant accountant = new ManagedMemoryAccountant(100, 80, true);
        ManagedMemoryAccountant.PayloadReservation reservation =
                accountant.acquirePayload(25, SEND, 0);

        Assert.assertTrue(reservation.releaseTerminal());
        Assert.assertFalse(reservation.releaseTerminal());
        Assert.assertFalse(reservation.isActive());
        ManagedMemoryAccountant.Capture capture = accountant.capture();
        Assert.assertEquals(0, capture.getUsedBytes());
        Assert.assertEquals(0, capture.getPayloadOwnedBytes());
        assertStages(capture, 0, 0, 0, 0);
    }

    @Test
    public void forceReleaseZerosAllCurrentOwnershipAndMakesLateReleaseSafe() throws Exception {
        ManagedMemoryAccountant accountant = new ManagedMemoryAccountant(100, 80, true);
        ManagedMemoryAccountant.PayloadReservation sending =
                accountant.acquirePayload(30, SEND, 0);
        ManagedMemoryAccountant.PayloadReservation retrying =
                accountant.acquirePayload(20, RETRY, 0);
        Assert.assertEquals(ACQUIRED, accountant.acquireRuntimeBytes(10, 0));

        accountant.forceReleaseAll();

        ManagedMemoryAccountant.Capture capture = accountant.capture();
        Assert.assertEquals(0, capture.getUsedBytes());
        Assert.assertEquals(0, capture.getPayloadOwnedBytes());
        Assert.assertEquals(0, capture.getBoundedRuntimeBufferBytes());
        Assert.assertEquals(60, capture.getHighWatermarkBytes());
        assertStages(capture, 0, 0, 0, 0);
        Assert.assertFalse(sending.releaseTerminal());
        Assert.assertFalse(retrying.releaseTerminal());
        accountant.releaseRuntimeBytes(10);
        Assert.assertEquals(CLOSED, accountant.acquirePayloadBytes(1, 0));
        Assert.assertEquals("closed is not admission pressure", 0, accountant.capture().getRejectedTotal());
    }

    @Test
    public void interruptedAcquireDoesNotConsumeBytesOrCountAsAdmissionPressure() throws Exception {
        final ManagedMemoryAccountant accountant = new ManagedMemoryAccountant(10, 10, true);
        Assert.assertEquals(ACQUIRED, accountant.acquirePayloadBytes(10, 0));
        final CountDownLatch entered = new CountDownLatch(1);
        final AtomicBoolean interrupted = new AtomicBoolean(false);
        Thread waiter = new Thread(new Runnable() {
            @Override
            public void run() {
                entered.countDown();
                try {
                    accountant.acquireRuntimeBytes(1, -1);
                } catch (InterruptedException expected) {
                    interrupted.set(true);
                }
            }
        });
        waiter.start();
        Assert.assertTrue(entered.await(1, TimeUnit.SECONDS));
        waitUntilBlocked(waiter);
        waiter.interrupt();
        waiter.join(2000);

        Assert.assertFalse(waiter.isAlive());
        Assert.assertTrue(interrupted.get());
        Assert.assertEquals(10, accountant.capture().getUsedBytes());
        Assert.assertEquals(0, accountant.capture().getRejectedTotal());
    }

    @Test
    public void offModeAllocatesNoObservedLedgerAndFacadeUsesSameAuthority() throws Exception {
        ManagedMemoryAccountant accountant = new ManagedMemoryAccountant(100, 80, false);
        MemoryLimiter limiter = new MemoryLimiter(accountant);

        Field observed = ManagedMemoryAccountant.class.getDeclaredField("observed");
        observed.setAccessible(true);
        Assert.assertNull("OFF must not allocate stage/counter state", observed.get(accountant));
        Assert.assertSame(accountant, limiter.getAccountant());

        Assert.assertTrue(limiter.acquirePayload(20, 0));
        Assert.assertTrue(limiter.transitionPayloadBytes(INGRESS, AGGREGATE, 20));
        try {
            limiter.releasePayloadBytes(INGRESS, 1);
            Assert.fail("OFF must still reject a wrong ownership stage");
        } catch (IllegalStateException expected) {
            // expected
        }
        Assert.assertTrue(limiter.acquireTemporary(10, 0));
        ManagedMemoryAccountant.Capture capture = accountant.capture();
        Assert.assertFalse(capture.isObservationEnabled());
        Assert.assertEquals(30, capture.getUsedBytes());
        Assert.assertEquals(20, capture.getPayloadOwnedBytes());
        Assert.assertEquals(10, capture.getBoundedRuntimeBufferBytes());
        limiter.releaseTemporary(10);
        limiter.releasePayload(20);
        Assert.assertEquals(0, limiter.getUsedBytes());
    }

    private static void assertStages(ManagedMemoryAccountant.Capture capture, long ingress,
                                     long aggregate, long send, long retry) {
        Assert.assertEquals(ingress, capture.getIngressOwnedBytes());
        Assert.assertEquals(aggregate, capture.getAggregateOwnedBytes());
        Assert.assertEquals(send, capture.getSendOwnedBytes());
        Assert.assertEquals(retry, capture.getRetryOwnedBytes());
        Assert.assertEquals(capture.getPayloadOwnedBytes(), ingress + aggregate + send + retry);
        Assert.assertEquals(capture.getUsedBytes(), capture.getPayloadOwnedBytes()
                + capture.getBoundedRuntimeBufferBytes());
    }

    private static void waitUntilBlocked(Thread thread) throws InterruptedException {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(1);
        while (System.nanoTime() < deadline) {
            Thread.State state = thread.getState();
            if (state == Thread.State.WAITING || state == Thread.State.TIMED_WAITING) {
                return;
            }
            Thread.yield();
        }
        Assert.fail("acquire thread did not block");
    }
}
