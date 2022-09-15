package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class AlarmInfo {
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = ALARM_ID)
    String alarmId;
    @JSONField(name = ALARM_NAME)
    String alarmName;
    @JSONField(name = STATUS)
    boolean status;
    @JSONField(name = QUERY_REQUEST)
    List<QueryRequest> queryRequest;
    @JSONField(name = REQUEST_CYCLE)
    RequestCycle requestCycle;
    @JSONField(name = CONDITION)
    String condition;
    @JSONField(name = TRIGGER_PERIOD)
    int triggerPeriod;
    @JSONField(name = ALARM_PERIOD)
    int alarmPeriod;
    @JSONField(name = ALARM_NOTIFY_GROUP)
    List<AlarmNotifyGroupInfo> alarmNotifyGroup;
    @JSONField(name = USER_DEFINE_MSG)
    String userDefineMsg;
    @JSONField(name = CREATE_TIME)
    String createTime;
    @JSONField(name = MODIFY_TIME)
    String modifyTime;
}
