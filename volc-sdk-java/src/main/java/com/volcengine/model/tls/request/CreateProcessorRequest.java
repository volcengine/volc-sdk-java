package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateProcessorRequest {
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = PROCESSOR_NAME)
    String processorName;
    @JSONField(name = DESCRIPTION)
    String description;
    @JSONField(name = DSL_CONTENT)
    String dslContent;
    @JSONField(name = PROCESSOR_TYPE)
    String processorType;
    @JSONField(name = PROCESSOR_DSL_TYPE)
    String processorDSLType;
    @JSONField(name = PROCESSOR_STATUS)
    String processorStatus;
    @JSONField(name = FAIL_STRATEGY)
    String failStrategy;
    @JSONField(name = TIMEOUT_MS)
    Integer timeoutMs;
    @JSONField(name = MAX_QPS)
    Integer maxQps;

    public boolean CheckValidation() {
        return projectId != null && !projectId.isEmpty()
                && processorName != null && !processorName.isEmpty()
                && dslContent != null && !dslContent.isEmpty()
                && processorType != null && !processorType.isEmpty();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDslContent() {
        return dslContent;
    }

    public void setDslContent(String dslContent) {
        this.dslContent = dslContent;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getProcessorDSLType() {
        return processorDSLType;
    }

    public void setProcessorDSLType(String processorDSLType) {
        this.processorDSLType = processorDSLType;
    }

    public String getProcessorStatus() {
        return processorStatus;
    }

    public void setProcessorStatus(String processorStatus) {
        this.processorStatus = processorStatus;
    }

    public String getFailStrategy() {
        return failStrategy;
    }

    public void setFailStrategy(String failStrategy) {
        this.failStrategy = failStrategy;
    }

    public Integer getTimeoutMs() {
        return timeoutMs;
    }

    public void setTimeoutMs(Integer timeoutMs) {
        this.timeoutMs = timeoutMs;
    }

    public Integer getMaxQps() {
        return maxQps;
    }

    public void setMaxQps(Integer maxQps) {
        this.maxQps = maxQps;
    }
}
