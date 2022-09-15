package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.Receiver;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateAlarmNotifyGroupRequest {
    @JSONField(name=ALARM_NOTIFY_GROUP_NAME)
    String alarmNotifyGroupName;
    @JSONField(name=NOTIFY_TYPE)
    List<String> notifyType;
    @JSONField(name=RECEIVERS)
    List<Receiver> receivers;

}
