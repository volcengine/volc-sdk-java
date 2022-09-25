package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeAlarmNotifyGroupsRequest {
    @JSONField(name = ALARM_NOTIFY_GROUP_NAME)
    String alarmNotifyGroupName;
    @JSONField(name = ALARM_NOTIFY_GROUP_ID)
    String alarmNotifyGroupId;
    @JSONField(name = RECEIVER_NAME)
    String receiverName;
    @JSONField(name = PAGE_NUMBER)
    Integer pageNumber;
    @JSONField(name = PAGE_SIZE)
    Integer pageSize;

    public DescribeAlarmNotifyGroupsRequest(String alarmNotifyGroupId) {
        this.alarmNotifyGroupId = alarmNotifyGroupId;
    }
}
