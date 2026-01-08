package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.WEBHOOK_ID;

@Data
@NoArgsConstructor
public class DeleteAlarmWebhookIntegrationRequest {
    @JSONField(name = WEBHOOK_ID)
    private String webhookId;

    /**
     * @param webhookId 告警 Webhook 集成配置的 ID
     */
    public DeleteAlarmWebhookIntegrationRequest(String webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * @return 告警 Webhook 集成配置的 ID
     */
    public String getWebhookId() {
        return webhookId;
    }

    /**
     * @param webhookId 告警 Webhook 集成配置的 ID
     */
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public boolean CheckValidation() {
        return this.webhookId != null && !this.webhookId.isEmpty();
    }
}