package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeTraceInstancesRequest {

    @JSONField(name = "PageNumber")
    private Integer pageNumber;

    @JSONField(name = "PageSize")
    private Integer pageSize;

    @JSONField(name = "TraceInstanceName")
    private String traceInstanceName;

    @JSONField(name = "TraceInstanceId")
    private String traceInstanceId;

    @JSONField(name = "ProjectId")
    private String projectId;

    @JSONField(name = "ProjectName")
    private String projectName;

    @JSONField(name = "Status")
    private String status;

    @JSONField(name = "IamProjectName")
    private String iamProjectName;

    public boolean CheckValidation() {
        return true;
    }
}