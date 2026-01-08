package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;
import java.util.List;

@Data
@NoArgsConstructor
public class ModifyAlarmWebhookIntegrationRequest {
    @JSONField(name = WEBHOOK_ID)
    private String webhookID;
    
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
    
    public ModifyAlarmWebhookIntegrationRequest(String webhookID, String webhookName, String webhookType, String webhookUrl) {
        this.webhookID = webhookID;
        this.webhookName = webhookName;
        this.webhookType = webhookType;
        this.webhookUrl = webhookUrl;
    }
    
    public boolean CheckValidation() {
        if (this.webhookID == null || this.webhookID.trim().isEmpty()) {
            return false;
        }
        if (this.webhookName == null || this.webhookName.trim().isEmpty()) {
            return false;
        }
        if (this.webhookType == null || this.webhookType.trim().isEmpty()) {
            return false;
        }
        if (this.webhookUrl == null || this.webhookUrl.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}