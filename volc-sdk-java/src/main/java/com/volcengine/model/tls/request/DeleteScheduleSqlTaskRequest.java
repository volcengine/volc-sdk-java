package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.SCHEDULE_SQL_TASK_ID;

@Data
@NoArgsConstructor
public class DeleteScheduleSqlTaskRequest {
    @JSONField(name = SCHEDULE_SQL_TASK_ID)
    private String scheduleSqlTaskId;

    /**
     * @param scheduleSqlTaskId 定时SQL任务 ID
     */
    public DeleteScheduleSqlTaskRequest(String scheduleSqlTaskId) {
        this.scheduleSqlTaskId = scheduleSqlTaskId;
    }

    /**
     * @return 定时SQL任务 ID
     */
    public String getScheduleSqlTaskId() {
        return scheduleSqlTaskId;
    }

    /**
     * @param scheduleSqlTaskId 定时SQL任务 ID
     */
    public void setScheduleSqlTaskId(String scheduleSqlTaskId) {
        this.scheduleSqlTaskId = scheduleSqlTaskId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.scheduleSqlTaskId == null || this.scheduleSqlTaskId.isEmpty()) {
            return false;
        }
        return true;
    }
}
