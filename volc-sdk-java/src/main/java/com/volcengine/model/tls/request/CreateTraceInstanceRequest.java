package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateTraceInstanceRequest {
    @JSONField(name = DESCRIPTION)
    private String description;
    
    @JSONField(name = PROJECT_ID)
    private String projectId;
    
    @JSONField(name = "TraceInstanceName")
    private String traceInstanceName;

    /**
     * @param projectId        日志项目uuid
     * @param traceInstanceName Trace实例名称
     * @param description      Trace实例描述信息
     */
    public CreateTraceInstanceRequest(String projectId, String traceInstanceName, String description) {
        this.projectId = projectId;
        this.traceInstanceName = traceInstanceName;
        this.description = description;
    }

    /**
     * @return 日志项目uuid
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId 日志项目uuid
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return Trace实例名称
     */
    public String getTraceInstanceName() {
        return traceInstanceName;
    }

    /**
     * @param traceInstanceName Trace实例名称
     */
    public void setTraceInstanceName(String traceInstanceName) {
        this.traceInstanceName = traceInstanceName;
    }

    /**
     * @return Trace实例描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description Trace实例描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.projectId != null && !this.projectId.isEmpty() && this.traceInstanceName != null && !this.traceInstanceName.isEmpty();
    }
}
