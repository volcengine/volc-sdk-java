package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.volcengine.model.tls.Const.ALARM_ID;

@Data
public class DeleteAlarmRequest {
    @JSONField(name = ALARM_ID)
    private String alarmId;

    public DeleteAlarmRequest(String alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * @return 报警id
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * @param alarmId 报警id
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public boolean CheckValidation() {
        if (this.alarmId == null) {
            return false;
        }
        return true;
    }
}
