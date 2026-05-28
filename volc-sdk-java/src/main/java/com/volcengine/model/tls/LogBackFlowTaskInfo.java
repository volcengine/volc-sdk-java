package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogBackFlowTaskInfo {
    @JSONField(name = TASK_ID)
    private String taskId;
    @JSONField(name = TASK_NAME)
    private String taskName;
    @JSONField(name = STATUS)
    private Integer status;
    @JSONField(name = LOG_BACK_FLOW_TASK_SOURCE)
    private LogBackFlowTaskSource logBackFlowTaskSource;
    @JSONField(name = SCHEDULE_SQL_TASK_INFO)
    private LogBackFlowScheduleSqlTaskInfo scheduleSqlTaskInfo;
    @JSONField(name = QUERY_PARAMS)
    private LogBackFlowQueryParams queryParams;
    @JSONField(name = SHIPPER_TO_TOS_INFO)
    private LogBackFlowShipperToTosInfo shipperToTosInfo;
    @JSONField(name = DESCRIPTION)
    private String description;
    @JSONField(name = RELA_TASKS_INFO)
    private LogBackFlowRelaTasksInfo relaTasksInfo;
    @JSONField(name = BACK_FLOW_START_TIME)
    private Long backFlowStartTime;
    @JSONField(name = BACK_FLOW_END_TIME)
    private Long backFlowEndTime;
    @JSONField(name = CREATE_TIME)
    private Long createTime;
    @JSONField(name = MODIFY_TIME)
    private Long modifyTime;
    @JSONField(name = IAM_PROJECT_NAME)
    private String iamProjectName;
}
