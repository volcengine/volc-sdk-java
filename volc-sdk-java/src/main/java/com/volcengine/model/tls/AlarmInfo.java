package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.ALARM_ID;
import static com.volcengine.model.tls.Const.ALARM_NAME;
import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUP;
import static com.volcengine.model.tls.Const.ALARM_PERIOD;
import static com.volcengine.model.tls.Const.ALARM_PERIOD_DETAIL;
import static com.volcengine.model.tls.Const.CONDITION;
import static com.volcengine.model.tls.Const.CREATE_TIME;
import static com.volcengine.model.tls.Const.JOIN_CONFIGURATIONS;
import static com.volcengine.model.tls.Const.MODIFY_TIME;
import static com.volcengine.model.tls.Const.PROJECT_ID;
import static com.volcengine.model.tls.Const.QUERY_REQUEST;
import static com.volcengine.model.tls.Const.REQUEST_CYCLE;
import static com.volcengine.model.tls.Const.SEND_RESOLVED;
import static com.volcengine.model.tls.Const.SEVERITY;
import static com.volcengine.model.tls.Const.STATUS;
import static com.volcengine.model.tls.Const.TRIGGER_CONDITIONS;
import static com.volcengine.model.tls.Const.TRIGGER_PERIOD;
import static com.volcengine.model.tls.Const.USER_DEFINE_MSG;

@Data
@NoArgsConstructor
public class AlarmInfo {

    /** 告警所属项目 ID. */
    @JSONField(name = PROJECT_ID)
    private String projectId;

    /** 告警策略 ID. */
    @JSONField(name = ALARM_ID)
    private String alarmId;

    /** 告警策略名称. */
    @JSONField(name = ALARM_NAME)
    private String alarmName;

    /** 告警策略是否启用. */
    @JSONField(name = STATUS)
    private boolean status;

    /** 告警查询条件. */
    @JSONField(name = QUERY_REQUEST)
    private List<QueryRequest> queryRequest;

    /** 告警执行周期配置. */
    @JSONField(name = REQUEST_CYCLE)
    private RequestCycle requestCycle;

    /** 告警表达式. */
    @JSONField(name = CONDITION)
    private String condition;

    /** 告警触发周期. */
    @JSONField(name = TRIGGER_PERIOD)
    private int triggerPeriod;

    /** 告警统计周期. */
    @JSONField(name = ALARM_PERIOD)
    private int alarmPeriod;

    /** 告警通知组. */
    @JSONField(name = ALARM_NOTIFY_GROUP)
    private List<AlarmNotifyGroupInfo> alarmNotifyGroup;

    /** 用户自定义告警内容. */
    @JSONField(name = USER_DEFINE_MSG)
    private String userDefineMsg;

    /** 告警创建时间. */
    @JSONField(name = CREATE_TIME)
    private String createTime;

    /** 告警修改时间. */
    @JSONField(name = MODIFY_TIME)
    private String modifyTime;

    /** 告警级别. */
    @JSONField(name = SEVERITY)
    private String severity;

    /** 告警周期详情. */
    @JSONField(name = ALARM_PERIOD_DETAIL)
    private AlarmPeriodSetting alarmPeriodDetail;

    /** 是否发送恢复通知. */
    @JSONField(name = SEND_RESOLVED)
    private Boolean sendResolved;

    /** 告警触发条件列表. */
    @JSONField(name = TRIGGER_CONDITIONS)
    private List<TriggerCondition> triggerConditions;

    /** 告警结果集合操作配置. */
    @JSONField(name = JOIN_CONFIGURATIONS)
    private List<JoinConfig> joinConfigurations;
}
