package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.QueryRequest;
import com.volcengine.model.tls.RequestCycle;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateAlarmRequest {
    @JSONField(name=ALARM_NAME)
    String alarmName;
    @JSONField(name=PROJECT_ID)
    String projectId;
    @JSONField(name=STATUS)
    Boolean status;
    @JSONField(name=QUERY_REQUEST)
    List<QueryRequest> queryRequest;
    @JSONField(name=REQUEST_CYCLE)
    RequestCycle requestCycle;
    @JSONField(name=CONDITION)
    String condition;
    @JSONField(name=TRIGGER_PERIOD)
    Integer triggerPeriod;
    @JSONField(name=ALARM_PERIOD)
    Integer alarmPeriod;
    @JSONField(name=ALARM_NOTIFY_GROUP)
    List<String> alarmNotifyGroup;
    @JSONField(name=USER_DEFINE_MSG)
    String userDefineMsg;
}
