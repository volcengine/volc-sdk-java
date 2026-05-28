package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeAlarmsRequest {
    String projectId;
    String alarmName;
    String alarmId;
    String topicId;
    String topicName;
    Boolean status;
    Integer pageNumber;
    Integer pageSize;
    String projectName;
    String alarmPolicyID;
    Boolean alarmDisabled;
    String severity;
    String iamProjectName;

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
     * @return 告警策略 ID
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * @param alarmId 告警策略 ID
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public String getAlarmPolicyID() {
        return alarmPolicyID;
    }

    public void setAlarmPolicyID(String alarmPolicyID) {
        this.alarmPolicyID = alarmPolicyID;
        this.alarmId = alarmPolicyID;
    }

    /**
     * @return 监控对象的日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 监控对象的日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 监控对象的日志主题名称
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * @param topicName 监控对象的日志主题名称
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * @return 分页查询时的页码。默认为 1
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber 分页查询时的页码。默认为 1
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return 分页大小。默认为 20，最大为 100
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize 分页大小。默认为 20，最大为 100
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Boolean getAlarmDisabled() {
        return alarmDisabled;
    }

    public void setAlarmDisabled(Boolean alarmDisabled) {
        this.alarmDisabled = alarmDisabled;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getIamProjectName() {
        return iamProjectName;
    }

    public void setIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.projectId == null || this.projectId.isEmpty()) {
            return false;
        }
        return true;
    }
}
