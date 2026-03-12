package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.model.response.RawResponse;
import org.junit.Assert;
import org.junit.Test;

import java.net.SocketTimeoutException;

public class DefaultRetryDeciderTest {

    @Test
    public void shouldRetryOnHttp429() {
        DefaultRetryDecider decider = new DefaultRetryDecider();
        RawResponse response = new RawResponse(null, SdkError.ERESP.getNumber(), null, null, 429);
        Assert.assertTrue(decider.shouldRetry(response));
    }

    @Test
    public void shouldRetryOnRetryableException() {
        DefaultRetryDecider decider = new DefaultRetryDecider();
        RawResponse response = new RawResponse(null, SdkError.EHTTP.getNumber(), new SocketTimeoutException("timeout"), null, 400);
        Assert.assertTrue(decider.shouldRetry(response));
    }

    @Test
    public void shouldNotRetryOnSuccess() {
        DefaultRetryDecider decider = new DefaultRetryDecider();
        RawResponse response = new RawResponse(null, SdkError.SUCCESS.getNumber(), null, null, 200);
        Assert.assertFalse(decider.shouldRetry(response));
    }
}
