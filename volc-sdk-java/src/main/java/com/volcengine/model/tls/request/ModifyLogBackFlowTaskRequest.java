package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.LogBackFlowQueryParams;
import com.volcengine.model.tls.LogBackFlowScheduleSqlTaskInfo;
import com.volcengine.model.tls.LogBackFlowShipperToTosInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyLogBackFlowTaskRequest {
    @JSONField(name = QUERY_PARAMS)
    private LogBackFlowQueryParams queryParams;
    @JSONField(name = SCHEDULE_SQL_TASK_INFO)
    private LogBackFlowScheduleSqlTaskInfo scheduleSqlTaskInfo;
    @JSONField(name = SHIPPER_TO_TOS_INFO)
    private LogBackFlowShipperToTosInfo shipperToTosInfo;
    @JSONField(name = TASK_ID)
    private String taskId;

    public LogBackFlowQueryParams getQueryParams() {
        return queryParams;
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
        return this.taskId != null;
    }
}
