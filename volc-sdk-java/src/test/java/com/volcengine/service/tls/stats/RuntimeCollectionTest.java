package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuntimeCollectionTest {
    @Test public void offInvalidatesOldWorkButPreservesDetailOnlyCounterWindow() {
        RuntimeCollection c = new RuntimeCollection(MetricsLevel.CORE, 100);
        long generation = c.beginCollection();
        assertTrue(generation > 0);
        assertEquals(100, c.getStartedAtUnixMs());
        c.changeLevel(MetricsLevel.DETAILED, LifecycleState.RUNNING, 200);
        assertEquals(generation, c.beginCollection());
        assertEquals(100, c.getStartedAtUnixMs());
        long detail = c.beginDetail();
        assertTrue(detail > 0);
        c.changeLevel(MetricsLevel.CORE, LifecycleState.RUNNING, 300);
        assertTrue(c.acceptsCollection(generation));
        assertFalse(c.acceptsDetail(detail));
        c.changeLevel(MetricsLevel.OFF, LifecycleState.RUNNING, 400);
        assertEquals(0, c.beginCollection());
        assertEquals(0, c.getStartedAtUnixMs());
        assertFalse(c.acceptsCollection(generation));
        c.changeLevel(MetricsLevel.DETAILED, LifecycleState.RUNNING, 500);
        assertTrue(c.beginCollection() > generation);
        assertEquals(500, c.getStartedAtUnixMs());
        assertFalse(c.acceptsCollection(generation));
        assertFalse(c.acceptsDetail(detail));
        assertFalse(c.acceptsCollection(0));
        assertFalse(c.acceptsDetail(0));
    }

    @Test public void noOpDoesNotChangeEpochAndInvalidStatesRejectEvenNoOp() {
        RuntimeCollection c = new RuntimeCollection(MetricsLevel.OFF, 100);
        long generation = c.getGeneration();
        assertFalse(c.changeLevel(MetricsLevel.OFF, LifecycleState.RUNNING, 200));
        assertEquals(generation, c.getGeneration());
        for (LifecycleState state : LifecycleState.values()) {
            if (state == LifecycleState.RUNNING) continue;
            try {
                c.changeLevel(MetricsLevel.OFF, state, 300);
                fail("accepted level change in " + state);
            } catch (IllegalStateException expected) { }
        }
        try {
            c.changeLevel(null, LifecycleState.RUNNING, 300);
            fail("accepted null level");
        } catch (IllegalArgumentException expected) { }
        assertEquals(generation, c.getGeneration());
    }

    @Test public void restartInvalidatesBothTokensWithoutChangingConfiguredLevel() {
        RuntimeCollection c = new RuntimeCollection(MetricsLevel.DETAILED, 100);
        long generation = c.beginCollection(), detail = c.beginDetail();
        c.restart(200);
        assertEquals(MetricsLevel.DETAILED, c.getLevel());
        assertEquals(200, c.getStartedAtUnixMs());
        assertFalse(c.acceptsCollection(generation));
        assertFalse(c.acceptsDetail(detail));
    }
}
