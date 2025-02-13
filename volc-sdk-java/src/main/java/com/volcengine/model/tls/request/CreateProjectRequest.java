package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.TagInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateProjectRequest {
    @JSONField(name = PROJECT_NAME)
    private String projectName;
    @JSONField(name = REGION)
    private String region;
    @JSONField(name = DESCRIPTION)
    private String description;
    @JSONField(name = IAM_PROJECT_NAME)
    private String iamProjectName;
    @JSONField(name = PROJECT_TAGS)
    private List<TagInfo> tags;

    /**
     * @param projectName 日志项目的名称
     * @param region      地域
     * @param description 日志项目描述信息
     */
    public CreateProjectRequest(String projectName, String region, String description) {
        this.projectName = projectName;
        this.region = region;
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
     * @return 地域
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region 地域
     */
    public void setRegion(String region) {
        this.region = region;
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
        return this.projectName != null && this.region != null;
    }
}
