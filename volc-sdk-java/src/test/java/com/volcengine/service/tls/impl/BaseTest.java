package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.service.tls.TLSLogClient;

public class BaseTest {
    static String endPoint = System.getenv("endPoint");
    static String accessKey = System.getenv("ak");
    static String secretKey = System.getenv("sk");
    static String region = System.getenv("region");
    static String token = System.getenv("token");
    protected static final ClientConfig clientConfig;
    protected static TLSLogClient client;

    static {
        boolean enableLocalValidationOnly = false;
        if (isEmpty(endPoint) || isEmpty(accessKey) || isEmpty(secretKey) || isEmpty(region)) {
            enableLocalValidationOnly = true;
            if (isEmpty(endPoint)) {
                endPoint = "https://tls.local.validation";
            }
            if (isEmpty(region)) {
                region = "cn-north-1";
            }
            if (isEmpty(accessKey)) {
                accessKey = "AK_LOCAL";
            }
            if (isEmpty(secretKey)) {
                secretKey = "SK_LOCAL";
            }
        }
        clientConfig = new ClientConfig(endPoint, region, accessKey, secretKey, token);
        clientConfig.setLocalValidationOnly(enableLocalValidationOnly);
        try {
            client = ClientBuilder.newClient(clientConfig);
        } catch (LogException e) {
            throw new RuntimeException("failed to initialize TLSLogClient in BaseTest", e);
        }
    }

    private static boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }
}
