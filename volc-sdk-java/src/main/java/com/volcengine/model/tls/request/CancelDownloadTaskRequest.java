package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TASK_ID;

@Data
@NoArgsConstructor
public class CancelDownloadTaskRequest {
    @JSONField(name = TASK_ID)
    String taskId;

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.taskId == null) {
            return false;
        }
        return true;
    }

    /**
     * @return 下载任务 ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId 下载任务 ID
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}