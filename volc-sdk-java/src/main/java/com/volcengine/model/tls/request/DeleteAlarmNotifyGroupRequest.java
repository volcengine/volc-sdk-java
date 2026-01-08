package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUP_ID;

@Data
@NoArgsConstructor
public class DeleteAlarmNotifyGroupRequest {
    @JSONField(name = ALARM_NOTIFY_GROUP_ID)
    private String alarmNotifyGroupId;

    /**
     * @param alarmNotifyGroupId 告警通知组 ID
     */
    public DeleteAlarmNotifyGroupRequest(String alarmNotifyGroupId) {
        this.alarmNotifyGroupId = alarmNotifyGroupId;
    }

    /**
     * @return 告警通知组 ID
     */
    public String getAlarmNotifyGroupId() {
        return alarmNotifyGroupId;
    }

    /**
     * @param alarmNotifyGroupId 告警通知组 ID
     */
    public void setAlarmNotifyGroupId(String alarmNotifyGroupId) {
        this.alarmNotifyGroupId = alarmNotifyGroupId;
    }

    public boolean CheckValidation() {
        if (this.alarmNotifyGroupId == null || this.alarmNotifyGroupId.isEmpty()) {
            return false;
        }
        return true;
    }
}
