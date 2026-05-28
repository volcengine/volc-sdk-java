package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.RetryPolicy;
import com.volcengine.model.tls.exception.LogException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TLSRetryPolicyIntegrationTest {

    @Test
    public void retryStopsAtMaxAttempts() throws Exception {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        RetryPolicy policy = new RetryPolicy();
        policy.setMaxAttempts(2);
        config.setRetryPolicy(policy);
        ServiceInfo info = ClientConfig.initServiceInfo(config);
        FakeTLSHttpUtil util = new FakeTLSHttpUtil(info, new int[]{503, 503, 503});
        TLSLogClientImpl client = new TLSLogClientImpl(util, config);
        invokeDoRetryRequest(client);
        Assert.assertEquals(2, util.getCallCount());
    }

    @Test
    public void retrySucceedsBeforeMaxAttempts() throws Exception {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        RetryPolicy policy = new RetryPolicy();
        policy.setMaxAttempts(3);
        config.setRetryPolicy(policy);
        ServiceInfo info = ClientConfig.initServiceInfo(config);
        FakeTLSHttpUtil util = new FakeTLSHttpUtil(info, new int[]{503, 200});
        TLSLogClientImpl client = new TLSLogClientImpl(util, config);
        RawResponse response = invokeDoRetryRequest(client);
        Assert.assertEquals(SdkError.SUCCESS.getNumber(), response.getCode());
        Assert.assertEquals(2, util.getCallCount());
    }

    @Test
    public void retryIgnoresRetryAfterHeader() throws Exception {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        RetryPolicy policy = new RetryPolicy();
        policy.setMaxAttempts(2);
        policy.setInitialIntervalMs(100);
        policy.setMaxIntervalMs(100);
        config.setRetryPolicy(policy);
        ServiceInfo info = ClientConfig.initServiceInfo(config);
        FakeTLSHttpUtil util = new FakeTLSHttpUtil(info, new int[]{503, 503},
                new BasicHeader("Retry-After", "1"));
        TLSLogClientImpl client = new TLSLogClientImpl(util, config);

        long startMs = System.currentTimeMillis();
        invokeDoRetryRequest(client);
        long elapsedMs = System.currentTimeMillis() - startMs;

        Assert.assertEquals(2, util.getCallCount());
        Assert.assertTrue("Retry-After is not returned by TLS server and must not override SDK backoff, elapsed=" + elapsedMs,
                elapsedMs < 500);
    }

    private RawResponse invokeDoRetryRequest(TLSLogClientImpl client) throws Exception {
        Method method = TLSLogClientImpl.class.getDeclaredMethod("doRetryRequest", String.class, ArrayList.class, String.class, Map.class);
        method.setAccessible(true);
        try {
            return (RawResponse) method.invoke(client, "/test", new ArrayList<>(), "{}", new HashMap<>());
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getTargetException() instanceof LogException) {
                return null;
            }
            throw e;
        }
    }

    static class FakeTLSHttpUtil extends TLSHttpUtil {
        private final int[] httpCodes;
        private final Header[] headers;
        private int idx = 0;

        FakeTLSHttpUtil(ServiceInfo info, int[] httpCodes) {
            this(info, httpCodes, new Header[0]);
        }

        FakeTLSHttpUtil(ServiceInfo info, int[] httpCodes, Header... headers) {
            super(info, new HashMap<>());
            this.httpCodes = httpCodes;
            this.headers = headers;
        }

        int getCallCount() {
            return idx;
        }

        @Override
        public RawResponse json(String api, java.util.List<org.apache.http.NameValuePair> params, String body, Map<String, String> headers) {
            int httpCode = httpCodes[Math.min(idx, httpCodes.length - 1)];
            idx++;
            int code = httpCode == 200 ? SdkError.SUCCESS.getNumber() : SdkError.ERESP.getNumber();
            return new RawResponse(null, code, null, this.headers, httpCode);
        }
    }
}
