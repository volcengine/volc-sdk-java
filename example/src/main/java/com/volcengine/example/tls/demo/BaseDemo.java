package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.service.tls.TLSLogClient;

public class BaseDemo {
    // 初始化客户端，推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免AccessKey硬编码引发数据安全风险。详细说明请参考 https://www.volcengine.com/docs/6470/1166455
    // 使用STS时，ak和sk均使用临时密钥，且设置VOLCENGINE_TOKEN；不使用STS时，VOLCENGINE_TOKEN部分传空
    static String endpoint = System.getenv("VOLCENGINE_ENDPOINT");
    static String accessKeyID = System.getenv("VOLCENGINE_ACCESS_KEY_ID");
    static String accessKeySecret = System.getenv("VOLCENGINE_ACCESS_KEY_SECRET");
    static String region = System.getenv("VOLCENGINE_REGION");
    static String token = System.getenv("VOLCENGINE_TOKEN");
    protected static final ClientConfig clientConfig = new ClientConfig(endpoint, region, accessKeyID, accessKeySecret, token);
    protected static TLSLogClient client;

    static {
        try {
            client = ClientBuilder.newClient(clientConfig);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
