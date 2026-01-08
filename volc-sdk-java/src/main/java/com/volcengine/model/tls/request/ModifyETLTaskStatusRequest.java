package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyETLTaskStatusRequest {
    @JSONField(name = ENABLE)
    private boolean enable;
    @JSONField(name = TASK_ID)
    private String taskId;

    /**
     * @param enable 是否开启数据加工任务。true：开启。false：不开启
     * @param taskId 加工任务 ID
     */
    public ModifyETLTaskStatusRequest(boolean enable, String taskId) {
        this.enable = enable;
        this.taskId = taskId;
    }

    /**
     * @return 是否开启数据加工任务
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * @param enable 是否开启数据加工任务。true：开启。false：不开启
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    /**
     * @return 加工任务 ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId 加工任务 ID
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