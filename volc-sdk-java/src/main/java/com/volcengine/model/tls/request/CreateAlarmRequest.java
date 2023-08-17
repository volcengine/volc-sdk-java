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
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.alarmName == null || this.projectId == null || this.queryRequest == null ||
                this.requestCycle == null || this.condition == null || this.alarmPeriod == null ||
                this.alarmNotifyGroup == null) {
            return false;
        }
        return true;
    }
}
