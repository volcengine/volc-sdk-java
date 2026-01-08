package com.volcengine.model.tls.request;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateAlarmWebhookIntegrationRequest {
    @JSONField(name = WEBHOOK_NAME)
    private String webhookName;
    
    @JSONField(name = WEBHOOK_TYPE)
    private String webhookType;
    
    @JSONField(name = WEBHOOK_URL)
    private String webhookUrl;
    
    @JSONField(name = WEBHOOK_METHOD)
    private String webhookMethod;
    
    @JSONField(name = WEBHOOK_SECRET)
    private String webhookSecret;
    
    @JSONField(name = WEBHOOK_HEADERS)
    private List<GeneralWebhookHeaderKV> webhookHeaders;

    /**
     * @param webhookName Webhook 集成配置名称
     * @param webhookType Webhook 类型
     * @param webhookUrl Webhook 请求地址
     */
    public CreateAlarmWebhookIntegrationRequest(String webhookName, String webhookType, String webhookUrl) {
        this.webhookName = webhookName;
        this.webhookType = webhookType;
        this.webhookUrl = webhookUrl;
    }

    /**
     * @param webhookName Webhook 集成配置名称
     * @param webhookType Webhook 类型
     * @param webhookUrl Webhook 请求地址
     * @param webhookMethod Webhook 请求方法
     * @param webhookSecret Webhook 加密密钥
     * @param webhookHeaders 自定义 Webhook 的请求头
     */
    public CreateAlarmWebhookIntegrationRequest(String webhookName, String webhookType, String webhookUrl, 
                                               String webhookMethod, String webhookSecret, List<GeneralWebhookHeaderKV> webhookHeaders) {
        this.webhookName = webhookName;
        this.webhookType = webhookType;
        this.webhookUrl = webhookUrl;
        this.webhookMethod = webhookMethod;
        this.webhookSecret = webhookSecret;
        this.webhookHeaders = webhookHeaders;
    }

    /**
     * @return Webhook 集成配置名称
     */
    public String getWebhookName() {
        return webhookName;
    }

    /**
     * @param webhookName Webhook 集成配置名称
     */
    public void setWebhookName(String webhookName) {
        this.webhookName = webhookName;
    }

    /**
     * @return Webhook 类型
     */
    public String getWebhookType() {
        return webhookType;
    }

    /**
     * @param webhookType Webhook 类型
     */
    public void setWebhookType(String webhookType) {
        this.webhookType = webhookType;
    }

    /**
     * @return Webhook 请求地址
     */
    public String getWebhookUrl() {
        return webhookUrl;
    }

    /**
     * @param webhookUrl Webhook 请求地址
     */
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    /**
     * @return Webhook 请求方法
     */
    public String getWebhookMethod() {
        return webhookMethod;
    }

    /**
     * @param webhookMethod Webhook 请求方法
     */
    public void setWebhookMethod(String webhookMethod) {
        this.webhookMethod = webhookMethod;
    }

    /**
     * @return Webhook 加密密钥
     */
    public String getWebhookSecret() {
        return webhookSecret;
    }

    /**
     * @param webhookSecret Webhook 加密密钥
     */
    public void setWebhookSecret(String webhookSecret) {
        this.webhookSecret = webhookSecret;
    }

    /**
     * @return 自定义 Webhook 的请求头
     */
    public List<GeneralWebhookHeaderKV> getWebhookHeaders() {
        return webhookHeaders;
    }

    /**
     * @param webhookHeaders 自定义 Webhook 的请求头
     */
    public void setWebhookHeaders(List<GeneralWebhookHeaderKV> webhookHeaders) {
        this.webhookHeaders = webhookHeaders;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.webhookName != null && !this.webhookName.trim().isEmpty()
                && this.webhookType != null && !this.webhookType.trim().isEmpty()
                && this.webhookUrl != null && !this.webhookUrl.trim().isEmpty();
    }
}