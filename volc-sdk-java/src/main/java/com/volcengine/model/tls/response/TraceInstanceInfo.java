package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.enumration.TraceInstanceStatus;
import lombok.Data;

@Data
public class TraceInstanceInfo {
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
}