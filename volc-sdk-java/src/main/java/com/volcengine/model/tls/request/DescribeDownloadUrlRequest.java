package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeDownloadUrlRequest {
    @JSONField(serialize = false)
    String taskId;

    /**
     * @param taskId 下载任务的任务 ID
     */
    public DescribeDownloadUrlRequest(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return 下载任务的任务 ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId 下载任务的任务 ID
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
