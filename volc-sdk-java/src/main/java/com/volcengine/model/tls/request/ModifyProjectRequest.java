package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyProjectRequest {
    @JSONField(name = PROJECT_ID)
    private String projectId;
    @JSONField(name = PROJECT_NAME)
    private String projectName;
    @JSONField(name = DESCRIPTION)
    private String description;

    /**
     * @param projectId   日志主题所属的日志项目 ID
     * @param projectName 日志项目的名称
     * @param description 日志项目描述信息
     */
    public ModifyProjectRequest(String projectId, String projectName, String description) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
    }

    /**
     * @return 日志项目的名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName 日志项目的名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
     * @return 日志项目描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description 日志项目描述信息
     */
    public void setDescription(String description) {
        this.description = description;
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
