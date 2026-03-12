package com.volcengine.model.tls;

import org.junit.Assert;
import org.junit.Test;

public class RetryPolicyTest {

    @Test
    public void normalize_clampsTotalTimeoutToMax() {
        RetryPolicy policy = new RetryPolicy();
        policy.setTotalTimeoutMs(RetryPolicy.TOTAL_TIMEOUT_MAX_MS + 1_000L);
        RetryPolicy normalized = policy.normalize();
        Assert.assertEquals(RetryPolicy.TOTAL_TIMEOUT_MAX_MS, normalized.getTotalTimeoutMs());
    }

    @Test
    public void normalize_respectsInitialAndMaxIntervalBounds() {
        RetryPolicy policy = new RetryPolicy();
        policy.setInitialIntervalMs(RetryPolicy.INITIAL_INTERVAL_MIN_MS - 1);
        policy.setMaxIntervalMs(RetryPolicy.MAX_INTERVAL_MIN_MS - 1);
        RetryPolicy normalized = policy.normalize();
        Assert.assertEquals(RetryPolicy.INITIAL_INTERVAL_MIN_MS, normalized.getInitialIntervalMs());
        Assert.assertEquals(RetryPolicy.MAX_INTERVAL_MIN_MS, normalized.getMaxIntervalMs());
    }

    @Test
    public void normalize_ensuresMaxIntervalAtLeastInitialInterval() {
        RetryPolicy policy = new RetryPolicy();
        policy.setInitialIntervalMs(5_000L);
        policy.setMaxIntervalMs(1_000L);
        RetryPolicy normalized = policy.normalize();
        Assert.assertEquals(5_000L, normalized.getMaxIntervalMs());
    }

    @Test
    public void normalize_defaultsInvalidMultiplierAndRandomization() {
        RetryPolicy policy = new RetryPolicy();
        policy.setMultiplier(Double.NaN);
        policy.setRandomizationFactor(-1.0);
        RetryPolicy normalized = policy.normalize();
        Assert.assertEquals(RetryPolicy.DEFAULT_MULTIPLIER, normalized.getMultiplier(), 0.0001);
        Assert.assertEquals(RetryPolicy.DEFAULT_RANDOMIZATION_FACTOR, normalized.getRandomizationFactor(), 0.0001);
    }
}
