package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeScheduleSqlTaskInfo {
    @JSONField(name = QUERY)
    private String query;

    @JSONField(name = STATUS)
    private Integer status;

    @JSONField(name = TASK_ID)
    private String taskId;

    @JSONField(name = TASK_NAME)
    private String taskName;

    @JSONField(name = DEST_REGION)
    private String destRegion;

    @JSONField(name = DESCRIPTION)
    private String description;

    @JSONField(name = DEST_TOPIC_ID)
    private String destTopicId;

    @JSONField(name = REQUEST_CYCLE)
    private RequestCycle requestCycle;

    @JSONField(name = DEST_TOPIC_NAME)
    private String destTopicName;

    @JSONField(name = PROCESS_END_TIME)
    private Long processEndTime;

    @JSONField(name = CREATE_TIME_STAMP)
    private Long createTimeStamp;

    @JSONField(name = MODIFY_TIME_STAMP)
    private Long modifyTimeStamp;

    @JSONField(name = PROCESS_SQL_DELAY)
    private Integer processSqlDelay;

    @JSONField(name = SOURCE_PROJECT_ID)
    private String sourceProjectId;

    @JSONField(name = SOURCE_PROJECT_NAME)
    private String sourceProjectName;

    @JSONField(name = PROCESS_TIME_WINDOW)
    private String processTimeWindow;

    @JSONField(name = SOURCE_TOPIC_NAME)
    private String sourceTopicName;

    @JSONField(name = SOURCE_TOPIC_ID)
    private String sourceTopicId;

    @JSONField(name = PROCESS_START_TIME)
    private Long processStartTime;
}