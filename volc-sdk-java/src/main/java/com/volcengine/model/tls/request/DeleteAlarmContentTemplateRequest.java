package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.volcengine.model.tls.Const.ALARM_CONTENT_TEMPLATE_ID;

@Data
public class DeleteAlarmContentTemplateRequest {
    @JSONField(name = ALARM_CONTENT_TEMPLATE_ID)
    private String alarmContentTemplateId;

    public DeleteAlarmContentTemplateRequest(String alarmContentTemplateId) {
        this.alarmContentTemplateId = alarmContentTemplateId;
    }

    /**
     * @return 告警通知内容模板的 ID
     */
    public String getAlarmContentTemplateId() {
        return alarmContentTemplateId;
    }

    /**
     * @param alarmContentTemplateId 告警通知内容模板的 ID
     */
    public void setAlarmContentTemplateId(String alarmContentTemplateId) {
        this.alarmContentTemplateId = alarmContentTemplateId;
    }

    public boolean CheckValidation() {
        return this.alarmContentTemplateId != null
                && !this.alarmContentTemplateId.trim().isEmpty();
    }
}