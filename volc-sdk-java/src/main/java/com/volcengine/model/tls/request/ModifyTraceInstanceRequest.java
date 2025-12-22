package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyTraceInstanceRequest {
    @JSONField(name = TRACE_INSTANCE_ID)
    private String traceInstanceId;
    
    @JSONField(name = DESCRIPTION)
    private String description;

    /**
     * @return Trace实例ID
     */
    public String getTraceInstanceId() {
        return traceInstanceId;
    }

    /**
     * @param traceInstanceId Trace实例ID
     */
    public void setTraceInstanceId(String traceInstanceId) {
        this.traceInstanceId = traceInstanceId;
    }

    /**
     * @return 日志主题描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description 日志主题描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.traceInstanceId == null) {
            return false;
        }
        return true;
    }
}