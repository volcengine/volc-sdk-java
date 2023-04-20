package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.Receiver;
import lombok.Data;

import java.util.List;

import static com.volcengine.model.tls.Const.*;
@Data
public class ModifyAlarmNotifyGroupRequest {
    @JSONField(name=ALARM_NOTIFY_GROUP_ID)
    String alarmNotifyGroupId;
    @JSONField(name=ALARM_NOTIFY_GROUP_NAME)
    String alarmNotifyGroupName;
    @JSONField(name=NOTIFY_TYPE)
    List<String> notifyType;
    @JSONField(name=RECEIVERS)
    List<Receiver> receivers;

    public boolean CheckValidation() {
        if (this.alarmNotifyGroupId == null) {
            return false;
        }
        return true;
    }
}
