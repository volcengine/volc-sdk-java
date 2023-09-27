package com.volcengine.model.tls;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class AlarmNotifyGroupInfo {
    @JSONField(name=ALARM_NOTIFY_GROUP_NAME)
    String alarmNotifyGroupName;
    @JSONField(name=ALARM_NOTIFY_GROUP_ID)
    String alarmNotifyGroupId;
    @JSONField(name=NOTIFY_TYPE)
    List<String> notifyType;
    @JSONField(name=RECEIVERS)
    List<Receiver> receivers;
    @JSONField(name=CREATE_TIME)
    String createTime;
    @JSONField(name=MODIFY_TIME)
    String modifyTime;
    @JSONField(name = IAM_PROJECT_NAME)
    String iamProjectName;
}
