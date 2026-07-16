package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.LogBackFlowETLTaskInfo;
import com.volcengine.model.tls.LogBackFlowQueryParams;
import com.volcengine.model.tls.LogBackFlowScheduleSqlTaskInfo;
import com.volcengine.model.tls.LogBackFlowShipperToTosInfo;
import com.volcengine.model.tls.LogBackFlowShipperToAgentLoopInfo;
import com.volcengine.model.tls.LogBackFlowTaskSource;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateLogBackFlowTaskRequest {
    @JSONField(name = BACK_FLOW_END_TIME)
    private Long backFlowEndTime;
    @JSONField(name = BACK_FLOW_START_TIME)
    private Long backFlowStartTime;
    @JSONField(name = DESCRIPTION)
    private String description;
    @JSONField(name = IAM_PROJECT_NAME)
    private String iamProjectName;
    @JSONField(name = LOG_BACK_FLOW_TASK_SOURCE)
    private LogBackFlowTaskSource logBackFlowTaskSource;
    @JSONField(name = ETL_TASK_INFO)
    private LogBackFlowETLTaskInfo etlTaskInfo;
    @JSONField(name = QUERY_PARAMS)
    private LogBackFlowQueryParams queryParams;
    @Deprecated
    @JSONField(name = SCHEDULE_SQL_TASK_INFO, serialize = false, deserialize = false)
    private LogBackFlowScheduleSqlTaskInfo scheduleSqlTaskInfo;
    @JSONField(name = SHIPPER_TO_TOS_INFO)
    private LogBackFlowShipperToTosInfo shipperToTosInfo;
    @JSONField(name = SHIPPER_TO_AGENT_LOOP_INFO)
    private LogBackFlowShipperToAgentLoopInfo shipperToAgentLoopInfo;
    @JSONField(name = TASK_NAME)
    private String taskName;

    public Long getBackFlowEndTime() {
        return backFlowEndTime;
    }

    public void setBackFlowEndTime(Long backFlowEndTime) {
        this.backFlowEndTime = backFlowEndTime;
    }

    public Long getBackFlowStartTime() {
        return backFlowStartTime;
    }

    public void setBackFlowStartTime(Long backFlowStartTime) {
        this.backFlowStartTime = backFlowStartTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIamProjectName() {
        return iamProjectName;
    }

    public void setIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
    }

    public LogBackFlowTaskSource getLogBackFlowTaskSource() {
        return logBackFlowTaskSource;
    }

    public void setLogBackFlowTaskSource(LogBackFlowTaskSource logBackFlowTaskSource) {
        this.logBackFlowTaskSource = logBackFlowTaskSource;
    }

    public LogBackFlowQueryParams getQueryParams() {
        return queryParams;
    }

    public LogBackFlowETLTaskInfo getEtlTaskInfo() {
        return etlTaskInfo;
    }

    public void setEtlTaskInfo(LogBackFlowETLTaskInfo etlTaskInfo) {
        this.etlTaskInfo = etlTaskInfo;
    }

    public void setQueryParams(LogBackFlowQueryParams queryParams) {
        this.queryParams = queryParams;
    }

    public LogBackFlowScheduleSqlTaskInfo getScheduleSqlTaskInfo() {
        return scheduleSqlTaskInfo;
    }

    public void setScheduleSqlTaskInfo(LogBackFlowScheduleSqlTaskInfo scheduleSqlTaskInfo) {
        this.scheduleSqlTaskInfo = scheduleSqlTaskInfo;
    }

    public LogBackFlowShipperToTosInfo getShipperToTosInfo() {
        return shipperToTosInfo;
    }

    public LogBackFlowShipperToAgentLoopInfo getShipperToAgentLoopInfo() {
        return shipperToAgentLoopInfo;
    }

    public void setShipperToAgentLoopInfo(LogBackFlowShipperToAgentLoopInfo shipperToAgentLoopInfo) {
        this.shipperToAgentLoopInfo = shipperToAgentLoopInfo;
    }

    public void setShipperToTosInfo(LogBackFlowShipperToTosInfo shipperToTosInfo) {
        this.shipperToTosInfo = shipperToTosInfo;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean CheckValidation() {
        return this.taskName != null && !this.taskName.isEmpty()
                && isValidSource()
                && isValidEtlTaskInfo()
                && (this.queryParams == null || (this.queryParams.getFields() != null
                && !this.queryParams.getFields().isEmpty()))
                && this.backFlowStartTime != null && this.backFlowStartTime > 0
                && !(this.shipperToTosInfo != null && this.shipperToAgentLoopInfo != null)
                && this.scheduleSqlTaskInfo == null;
    }

    private boolean isValidSource() {
        return this.logBackFlowTaskSource != null
                && "Topic".equals(this.logBackFlowTaskSource.getSourceType())
                && this.logBackFlowTaskSource.getLogBackFlowTaskTopicSource() != null
                && this.logBackFlowTaskSource.getLogBackFlowTaskTopicSource().getProjectId() != null
                && !this.logBackFlowTaskSource.getLogBackFlowTaskTopicSource().getProjectId().isEmpty()
                && this.logBackFlowTaskSource.getLogBackFlowTaskTopicSource().getTopicId() != null
                && !this.logBackFlowTaskSource.getLogBackFlowTaskTopicSource().getTopicId().isEmpty();
    }

    private boolean isValidEtlTaskInfo() {
        return this.etlTaskInfo != null
                && this.etlTaskInfo.getScript() != null && !this.etlTaskInfo.getScript().isEmpty()
                && this.etlTaskInfo.getTargetResources() != null
                && this.etlTaskInfo.getTargetResources().size() == 1
                && this.etlTaskInfo.getTargetResources().get(0).getAlias() != null
                && !this.etlTaskInfo.getTargetResources().get(0).getAlias().isEmpty()
                && this.etlTaskInfo.getTargetResources().get(0).getTopicId() != null
                && !this.etlTaskInfo.getTargetResources().get(0).getTopicId().isEmpty();
    }
}
