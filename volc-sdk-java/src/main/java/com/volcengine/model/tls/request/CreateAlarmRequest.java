package com.volcengine.model.tls.request;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AlarmPeriodSetting;
import com.volcengine.model.tls.QueryRequest;
import com.volcengine.model.tls.RequestCycle;
import com.volcengine.model.tls.JoinConfig;
import com.volcengine.model.tls.TriggerCondition;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateAlarmRequest {
    @JSONField(name = ALARM_NAME)
    String alarmName;
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = STATUS)
    Boolean status;
    @JSONField(name = QUERY_REQUEST)
    List<QueryRequest> queryRequest;
    @JSONField(name = REQUEST_CYCLE)
    RequestCycle requestCycle;
    @JSONField(name = CONDITION)
    String condition;
    @JSONField(name = TRIGGER_PERIOD)
    Integer triggerPeriod;
    @JSONField(name = ALARM_PERIOD)
    Integer alarmPeriod;
    @JSONField(name = ALARM_NOTIFY_GROUP)
    List<String> alarmNotifyGroup;
    @JSONField(name = USER_DEFINE_MSG)
    String userDefineMsg;
    @JSONField(name = SEVERITY)
    String severity;
    @JSONField(name = ALARM_PERIOD_DETAIL)
    AlarmPeriodSetting alarmPeriodDetail;
    @JSONField(name = JOIN_CONFIGURATIONS)
    List<JoinConfig> joinConfigurations;
    @JSONField(name = TRIGGER_CONDITIONS)
    List<TriggerCondition> triggerConditions;
    @JSONField(name = SEND_RESOLVED)
    Boolean sendResolved;

    /**
     * @return 告警策略名称
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * @param alarmName 告警策略名称
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * @return 告警策略所属的日志项目 ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId 告警策略所属的日志项目 ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return 是否开启告警策略。默认值为 true
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status 是否开启告警策略。默认值为 true
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return 检索分析语句，可配置 1~3 条
     */
    public List<QueryRequest> getQueryRequest() {
        return queryRequest;
    }

    /**
     * @param queryRequest 检索分析语句，可配置 1~3 条
     */
    public void setQueryRequest(List<QueryRequest> queryRequest) {
        this.queryRequest = queryRequest;
    }

    /**
     * @return 告警任务的执行周期
     */
    public RequestCycle getRequestCycle() {
        return requestCycle;
    }

    /**
     * @param requestCycle 告警任务的执行周期
     */
    public void setRequestCycle(RequestCycle requestCycle) {
        this.requestCycle = requestCycle;
    }

    /**
     * @return 告警触发条件
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition 告警触发条件
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * @return 触发告警持续周期。最小值为 1，最大值为10。
     */
    public Integer getTriggerPeriod() {
        return triggerPeriod;
    }

    /**
     * @param triggerPeriod 触发告警持续周期。最小值为 1，最大值为10。
     */
    public void setTriggerPeriod(Integer triggerPeriod) {
        this.triggerPeriod = triggerPeriod;
    }

    /**
     * @return 告警重复的周期
     */
    public Integer getAlarmPeriod() {
        return alarmPeriod;
    }

    /**
     * @param alarmPeriod 告警重复的周期
     */
    public void setAlarmPeriod(Integer alarmPeriod) {
        this.alarmPeriod = alarmPeriod;
    }

    /**
     * @return 告警对应的通知列表
     */
    public List<String> getAlarmNotifyGroup() {
        return alarmNotifyGroup;
    }

    /**
     * @param alarmNotifyGroup 告警对应的通知列表
     */
    public void setAlarmNotifyGroup(List<String> alarmNotifyGroup) {
        this.alarmNotifyGroup = alarmNotifyGroup;
    }

    /**
     * @return 告警通知的内容
     */
    public String getUserDefineMsg() {
        return userDefineMsg;
    }

    /**
     * @param userDefineMsg 告警通知的内容
     */
    public void setUserDefineMsg(String userDefineMsg) {
        this.userDefineMsg = userDefineMsg;
    }

    /**
     * @return 告警通知的级别，即告警的严重程度
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * @param severity 告警通知的级别，即告警的严重程度
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * @return 告警通知发送的周期
     */
    public AlarmPeriodSetting getAlarmPeriodDetail() {
        return alarmPeriodDetail;
    }

    /**
     * @param alarmPeriodDetail 告警通知发送的周期
     */
    public void setAlarmPeriodDetail(AlarmPeriodSetting alarmPeriodDetail) {
        this.alarmPeriodDetail = alarmPeriodDetail;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.alarmName == null || this.alarmName.isEmpty()
                || this.projectId == null || this.projectId.isEmpty()
                || this.queryRequest == null || this.queryRequest.isEmpty()
                || this.requestCycle == null
                || this.alarmNotifyGroup == null || this.alarmNotifyGroup.isEmpty()) {
            return false;
        }
        boolean hasTriggerConditions = this.triggerConditions != null && !this.triggerConditions.isEmpty();
        boolean hasCondition = this.condition != null && !this.condition.isEmpty();
        if (!hasTriggerConditions && !hasCondition) {
            return false;
        }
        boolean hasAlarmPeriod = this.alarmPeriod != null;
        boolean hasAlarmPeriodDetail = this.alarmPeriodDetail != null;
        if (!hasAlarmPeriod && !hasAlarmPeriodDetail) {
            return false;
        }
        if (this.triggerPeriod == null) {
            return false;
        }
        return true;
    }
}
