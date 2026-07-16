package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.LogBackFlowETLTaskInfo;
import com.volcengine.model.tls.LogBackFlowQueryParams;
import com.volcengine.model.tls.LogBackFlowScheduleSqlTaskInfo;
import com.volcengine.model.tls.LogBackFlowShipperToTosInfo;
import com.volcengine.model.tls.LogBackFlowShipperToAgentLoopInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyLogBackFlowTaskRequest {
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
    @JSONField(name = TASK_ID)
    private String taskId;

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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean CheckValidation() {
        return this.taskId != null && !this.taskId.isEmpty()
                && (this.queryParams == null || this.etlTaskInfo != null)
                && (this.etlTaskInfo == null || isValidEtlTaskInfo())
                && (this.queryParams == null || (this.queryParams.getFields() != null
                && !this.queryParams.getFields().isEmpty()))
                && !(this.shipperToTosInfo != null && this.shipperToAgentLoopInfo != null)
                && this.scheduleSqlTaskInfo == null;
    }

    private boolean isValidEtlTaskInfo() {
        return this.etlTaskInfo.getScript() != null && !this.etlTaskInfo.getScript().isEmpty()
                && this.etlTaskInfo.getTargetResources() != null
                && this.etlTaskInfo.getTargetResources().size() == 1
                && this.etlTaskInfo.getTargetResources().get(0).getAlias() != null
                && !this.etlTaskInfo.getTargetResources().get(0).getAlias().isEmpty()
                && this.etlTaskInfo.getTargetResources().get(0).getTopicId() != null
                && !this.etlTaskInfo.getTargetResources().get(0).getTopicId().isEmpty();
    }
}
