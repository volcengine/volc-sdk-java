package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TASK_ID;

@Data
@NoArgsConstructor
public class DeleteLogBackFlowTaskRequest {
    @JSONField(name = TASK_ID)
    private String taskId;

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
