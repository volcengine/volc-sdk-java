package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.CreateAlarmWebhookIntegrationRequest;
import com.volcengine.model.tls.request.GeneralWebhookHeaderKV;
import com.volcengine.model.tls.response.CreateAlarmWebhookIntegrationResponse;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CreateAlarmWebhookIntegrationTest extends BaseTest {
    
    @Test
    public void testCreateAlarmWebhookIntegration() throws Exception {
        try {
            // 创建飞书 Webhook 集成
            CreateAlarmWebhookIntegrationRequest request = new CreateAlarmWebhookIntegrationRequest();
            request.setWebhookName("tls-java-sdk-test-alarm-webhook-integration-" + System.currentTimeMillis());
            request.setWebhookType("Lark");
            request.setWebhookUrl("https://open.feishu.cn/open-apis/bot/v2/hook/test-webhook-url");
            
            CreateAlarmWebhookIntegrationResponse response = client.createAlarmWebhookIntegration(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getAlarmWebhookIntegrationId());
            assertFalse(response.getAlarmWebhookIntegrationId().isEmpty());
            
            System.out.println("create alarm webhook integration success, response: " + response);
        } catch (LogException e) {
            System.out.println("create alarm webhook integration failed, error: " + e.getMessage());
            throw e;
        }
    }
    
    @Test
    public void testCreateAlarmWebhookIntegrationWithGeneralWebhook() throws Exception {
        try {
            // 创建自定义 Webhook 集成
            CreateAlarmWebhookIntegrationRequest request = new CreateAlarmWebhookIntegrationRequest();
            request.setWebhookName("tls-java-sdk-test-general-webhook-" + System.currentTimeMillis());
            request.setWebhookType("GeneralWebhook");
            request.setWebhookUrl("https://example.com/webhook");
            request.setWebhookMethod("POST");
            
            // 添加自定义请求头
            GeneralWebhookHeaderKV header1 = new GeneralWebhookHeaderKV("Content-Type", "application/json");
            GeneralWebhookHeaderKV header2 = new GeneralWebhookHeaderKV("Authorization", "Bearer token123");
            request.setWebhookHeaders(Arrays.asList(header1, header2));
            
            CreateAlarmWebhookIntegrationResponse response = client.createAlarmWebhookIntegration(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getAlarmWebhookIntegrationId());
            assertFalse(response.getAlarmWebhookIntegrationId().isEmpty());
            
            System.out.println("create general webhook integration success, response: " + response);
        } catch (LogException e) {
            System.out.println("create general webhook integration failed, error: " + e.getMessage());
            throw e;
        }
    }
    
    @Test
    public void testCreateAlarmWebhookIntegrationWithDingTalk() throws Exception {
        try {
            // 创建钉钉 Webhook 集成
            CreateAlarmWebhookIntegrationRequest request = new CreateAlarmWebhookIntegrationRequest();
            request.setWebhookName("tls-java-sdk-test-dingtalk-" + System.currentTimeMillis());
            request.setWebhookType("DingTalk");
            request.setWebhookUrl("https://oapi.dingtalk.com/robot/send?access_token=test_token");
            request.setWebhookSecret("SECxxx"); // 钉钉签名密钥
            
            CreateAlarmWebhookIntegrationResponse response = client.createAlarmWebhookIntegration(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getAlarmWebhookIntegrationId());
            assertFalse(response.getAlarmWebhookIntegrationId().isEmpty());
            
            System.out.println("create dingtalk webhook integration success, response: " + response);
        } catch (LogException e) {
            System.out.println("create dingtalk webhook integration failed, error: " + e.getMessage());
            throw e;
        }
    }
    
    @Test
    public void testCreateAlarmWebhookIntegrationInvalidRequest() {
        // 测试无效请求 - 缺少必填参数
        CreateAlarmWebhookIntegrationRequest request = new CreateAlarmWebhookIntegrationRequest();
        request.setWebhookName(""); // 空名称
        request.setWebhookType("Lark");
        // 缺少 webhookUrl
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.createAlarmWebhookIntegration(request);
        });
        
        assertNotNull(exception.getMessage());
        System.out.println("test invalid request success, error: " + exception.getMessage());
    }
}