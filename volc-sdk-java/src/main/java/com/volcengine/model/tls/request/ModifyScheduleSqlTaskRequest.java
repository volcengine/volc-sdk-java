package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyScheduleSqlTaskRequest {
    @JSONField(name = TASK_ID)
    private String taskId;

    @JSONField(name = TASK_NAME)
    private String taskName;

    @JSONField(name = DESCRIPTION)
    private String description;

    @JSONField(name = DEST_REGION)
    private String destRegion;

    @JSONField(name = DEST_TOPIC_ID)
    private String destTopicID;

    @JSONField(name = STATUS)
    private Integer status;

    @JSONField(name = PROCESS_SQL_DELAY)
    private Integer processSqlDelay;

    @JSONField(name = PROCESS_TIME_WINDOW)
    private String processTimeWindow;

    @JSONField(name = QUERY)
    private String query;

    @JSONField(name = REQUEST_CYCLE)
    private RequestCycle requestCycle;

    public boolean CheckValidation() {
        if (this.taskId == null || this.taskId.isEmpty()) {
            return false;
        }
        return true;
    }
}