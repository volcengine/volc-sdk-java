package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateAlarmContentTemplateRequest {
    @JSONField(name = ALARM_CONTENT_TEMPLATE_NAME)
    private String alarmContentTemplateName;
    
    @JSONField(name = DING_TALK)
    private DingTalkContentTemplateInfo dingTalk;
    
    @JSONField(name = EMAIL)
    private EmailContentTemplateInfo email;
    
    @JSONField(name = LARK)
    private LarkContentTemplateInfo lark;
    
    @JSONField(name = NEED_VALID_CONTENT)
    private Boolean needValidContent;
    
    @JSONField(name = SMS)
    private SmsContentTemplateInfo sms;
    
    @JSONField(name = VMS)
    private VmsContentTemplateInfo vms;
    
    @JSONField(name = WE_CHAT)
    private WeChatContentTemplateInfo weChat;
    
    @JSONField(name = WEBHOOK)
    private WebhookContentTemplateInfo webhook;

    public boolean CheckValidation() {
        return this.alarmContentTemplateName != null
                && !this.alarmContentTemplateName.trim().isEmpty();
    }
}