package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeAlarmWebhookIntegrationsRequest {
    String webhookId;
    String webhookName;
    String webhookType;
    Integer pageNumber;
    Integer pageSize;

    /**
     * @return Webhook集成配置的ID
     */
    public String getWebhookId() {
        return webhookId;
    }

    /**
     * @param webhookId Webhook集成配置的ID
     */
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * @return Webhook集成配置名称
     */
    public String getWebhookName() {
        return webhookName;
    }

    /**
     * @param webhookName Webhook集成配置名称
     */
    public void setWebhookName(String webhookName) {
        this.webhookName = webhookName;
    }

    /**
     * @return Webhook集成配置的类型
     */
    public String getWebhookType() {
        return webhookType;
    }

    /**
     * @param webhookType Webhook集成配置的类型
     */
    public void setWebhookType(String webhookType) {
        this.webhookType = webhookType;
    }

    /**
     * @return 分页查询时的页码
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber 分页查询时的页码
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return 分页大小
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize 分页大小
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return true;
    }
}