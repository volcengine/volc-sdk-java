package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WebhookIntegrationInfo {

    /** Webhook ID. */
    @JSONField(name = "WebhookID")
    private String webhookId;

    /** 创建时间. */
    @JSONField(name = "CreateTime")
    private String createTime;

    /** 修改时间. */
    @JSONField(name = "ModifyTime")
    private String modifyTime;

    /** Webhook URL. */
    @JSONField(name = "WebhookUrl")
    private String webhookUrl;

    /** Webhook 名称. */
    @JSONField(name = "WebhookName")
    private String webhookName;

    /** Webhook 类型. */
    @JSONField(name = "WebhookType")
    private String webhookType;

    /** Webhook 请求方法. */
    @JSONField(name = "WebhookMethod")
    private String webhookMethod;

    /** Webhook 密钥. */
    @JSONField(name = "WebhookSecret")
    private String webhookSecret;

    /** Webhook 请求头列表. */
    @JSONField(name = "WebhookHeaders")
    private List<GeneralWebhookHeaderKV> webhookHeaders;

    /**
     * 获取 Webhook ID.
     *
     * @return Webhook ID
     */
    public String getWebhookId() {
        return webhookId;
    }

    /**
     * 设置 Webhook ID.
     *
     * @param newWebhookId Webhook ID
     */
    public void setWebhookId(final String newWebhookId) {
        this.webhookId = newWebhookId;
    }

    /**
     * 获取创建时间.
     *
     * @return 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间.
     *
     * @param newCreateTime 创建时间
     */
    public void setCreateTime(final String newCreateTime) {
        this.createTime = newCreateTime;
    }

    /**
     * 获取修改时间.
     *
     * @return 修改时间
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间.
     *
     * @param newModifyTime 修改时间
     */
    public void setModifyTime(final String newModifyTime) {
        this.modifyTime = newModifyTime;
    }

    /**
     * 获取 Webhook URL.
     *
     * @return Webhook URL
     */
    public String getWebhookUrl() {
        return webhookUrl;
    }

    /**
     * 设置 Webhook URL.
     *
     * @param newWebhookUrl Webhook URL
     */
    public void setWebhookUrl(final String newWebhookUrl) {
        this.webhookUrl = newWebhookUrl;
    }

    /**
     * 获取 Webhook 名称.
     *
     * @return Webhook 名称
     */
    public String getWebhookName() {
        return webhookName;
    }

    /**
     * 设置 Webhook 名称.
     *
     * @param newWebhookName Webhook 名称
     */
    public void setWebhookName(final String newWebhookName) {
        this.webhookName = newWebhookName;
    }

    /**
     * 获取 Webhook 类型.
     *
     * @return Webhook 类型
     */
    public String getWebhookType() {
        return webhookType;
    }

    /**
     * 设置 Webhook 类型.
     *
     * @param newWebhookType Webhook 类型
     */
    public void setWebhookType(final String newWebhookType) {
        this.webhookType = newWebhookType;
    }

    /**
     * 获取 Webhook 请求方法.
     *
     * @return Webhook 请求方法
     */
    public String getWebhookMethod() {
        return webhookMethod;
    }

    /**
     * 设置 Webhook 请求方法.
     *
     * @param newWebhookMethod Webhook 请求方法
     */
    public void setWebhookMethod(final String newWebhookMethod) {
        this.webhookMethod = newWebhookMethod;
    }

    /**
     * 获取 Webhook 密钥.
     *
     * @return Webhook 密钥
     */
    public String getWebhookSecret() {
        return webhookSecret;
    }

    /**
     * 设置 Webhook 密钥.
     *
     * @param newWebhookSecret Webhook 密钥
     */
    public void setWebhookSecret(final String newWebhookSecret) {
        this.webhookSecret = newWebhookSecret;
    }

    /**
     * 获取 Webhook 请求头列表.
     *
     * @return Webhook 请求头列表
     */
    public List<GeneralWebhookHeaderKV> getWebhookHeaders() {
        return webhookHeaders;
    }

    /**
     * 设置 Webhook 请求头列表.
     *
     * @param newWebhookHeaders Webhook 请求头列表
     */
    public void setWebhookHeaders(
            final List<GeneralWebhookHeaderKV> newWebhookHeaders) {
        this.webhookHeaders = newWebhookHeaders;
    }
}
