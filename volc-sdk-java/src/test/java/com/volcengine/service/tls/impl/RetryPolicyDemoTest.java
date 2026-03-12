package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.RetryPolicy;
import com.volcengine.model.tls.request.GetAccountStatusRequest;
import com.volcengine.service.tls.DefaultRetryDecider;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Assert;
import org.junit.Test;

public class RetryPolicyDemoTest {

    @Test
    public void demoRetryPolicyConfiguration() throws Exception {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        config.setLocalValidationOnly(true);
        RetryPolicy policy = new RetryPolicy();
        policy.setMaxAttempts(3);
        policy.setTotalTimeoutMs(120_000L);
        config.setRetryPolicy(policy);
        config.setRetryDecider(new DefaultRetryDecider());
        TLSLogClient client = ClientBuilder.newClient(config);
        Assert.assertNotNull(client.getAccountStatus(new GetAccountStatusRequest()));
    }
}
