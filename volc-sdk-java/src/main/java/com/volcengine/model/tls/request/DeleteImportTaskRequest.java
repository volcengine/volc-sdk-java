package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TASK_ID;

@Data
@NoArgsConstructor
public class DeleteImportTaskRequest {
    @JSONField(name = TASK_ID)
    private String taskId;

    /**
     * @param taskId 数据导入任务 ID
     */
    public DeleteImportTaskRequest(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return 数据导入任务 ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId 数据导入任务 ID
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean CheckValidation() {
        return this.taskId != null && !this.taskId.isEmpty();
    }
}