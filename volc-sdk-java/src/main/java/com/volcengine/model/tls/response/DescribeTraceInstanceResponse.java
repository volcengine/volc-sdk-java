package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.BackendConfig;
import com.volcengine.model.tls.enumration.TraceInstanceStatus;
import org.apache.http.Header;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeTraceInstanceResponse extends CommonResponse {
    @JSONField(name = "CreateTime")
    private String createTime;

    @JSONField(name = "DependencyTopicId")
    private String dependencyTopicId;

    @JSONField(name = "DependencyTopicTopicName")
    private String dependencyTopicTopicName;

    @JSONField(name = "Description")
    private String description;

    @JSONField(name = "ModifyTime")
    private String modifyTime;

    @JSONField(name = "ProjectId")
    private String projectId;

    @JSONField(name = "ProjectName")
    private String projectName;

    @JSONField(name = "TraceInstanceId")
    private String traceInstanceId;

    @JSONField(name = "TraceInstanceName")
    private String traceInstanceName;

    @JSONField(name = "TraceInstanceStatus")
    private TraceInstanceStatus traceInstanceStatus;

    @JSONField(name = "TraceTopicId")
    private String traceTopicId;

    @JSONField(name = "TraceTopicName")
    private String traceTopicName;

    @JSONField(name = "BackendConfig")
    private BackendConfig backendConfig;

    @JSONField(name = "CsAccountChannel")
    private String csAccountChannel;

    public DescribeTraceInstanceResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeTraceInstanceResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeTraceInstanceResponse response = (DescribeTraceInstanceResponse) super.deSerialize(data, clazz);
        this.setCreateTime(response.getCreateTime());
        this.setDependencyTopicId(response.getDependencyTopicId());
        this.setDependencyTopicTopicName(response.getDependencyTopicTopicName());
        this.setDescription(response.getDescription());
        this.setModifyTime(response.getModifyTime());
        this.setProjectId(response.getProjectId());
        this.setProjectName(response.getProjectName());
        this.setTraceInstanceId(response.getTraceInstanceId());
        this.setTraceInstanceName(response.getTraceInstanceName());
        this.setTraceInstanceStatus(response.getTraceInstanceStatus());
        this.setTraceTopicId(response.getTraceTopicId());
        this.setTraceTopicName(response.getTraceTopicName());
        this.setBackendConfig(response.getBackendConfig());
        this.setCsAccountChannel(response.getCsAccountChannel());
        return this;
    }
}
