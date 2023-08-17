package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeProjectRequest {
    private String projectId;

    /**
     * @param projectId 日志主题所属的日志项目 ID
     */
    public DescribeProjectRequest(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return 日志主题所属的日志项目 ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId 日志主题所属的日志项目 ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.projectId == null) {
            return false;
        }
        return true;
    }
}
