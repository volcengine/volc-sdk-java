package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUP_ID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteAlarmNotifyGroupRequest {
    @JSONField(name = ALARM_NOTIFY_GROUP_ID)
    private String alarmNotifyGroupId;

}
