package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeImportTaskRequest {
    @JSONField(name = "TaskId")
    private String taskId;

    /**
     * @param taskId 导入任务ID
     */
    public DescribeImportTaskRequest(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return 导入任务ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId 导入任务ID
     */
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