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
    protected static final ClientConfig clientConfig = new ClientConfig(endPoint, region, accessKey,
            secretKey, token);
    protected static TLSLogClient client;

    static {
        try {
            client = ClientBuilder.newClient(clientConfig);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
