package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeETLTaskRequest {
    @JSONField(name = TASK_ID)
    private String taskId;

    /**
     * @param taskId 待查询的加工任务 ID
     */
    public DescribeETLTaskRequest(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return 待查询的加工任务 ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId 待查询的加工任务 ID
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.taskId == null) {
            return false;
        }
        return true;
    }
}