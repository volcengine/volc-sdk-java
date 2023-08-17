package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.PROJECT_ID;

@Data
@NoArgsConstructor
public class DeleteProjectRequest {
    @JSONField(name = PROJECT_ID)
    private String projectId;

    /**
     * @param projectId 日志项目 ID
     */
    public DeleteProjectRequest(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return 日志项目 ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId 日志项目 ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public boolean CheckValidation() {
        if (this.projectId == null) {
            return false;
        }
        return true;
    }
}
