package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TASK_ID;

@Data
@NoArgsConstructor
public class DeleteScheduleSqlTaskRequest {
    @JSONField(name = TASK_ID)
    private String taskId;

    /**
     * @param scheduleSqlTaskId 定时SQL任务 ID
     */
    public DeleteScheduleSqlTaskRequest(String scheduleSqlTaskId) {
        this.taskId = scheduleSqlTaskId;
    }

    /**
     * @return 定时SQL任务 ID
     */
    public String getScheduleSqlTaskId() {
        return taskId;
    }

    /**
     * @param scheduleSqlTaskId 定时SQL任务 ID
     */
    public void setScheduleSqlTaskId(String scheduleSqlTaskId) {
        this.taskId = scheduleSqlTaskId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.taskId == null || this.taskId.isEmpty()) {
            return false;
        }
        return true;
    }
}
