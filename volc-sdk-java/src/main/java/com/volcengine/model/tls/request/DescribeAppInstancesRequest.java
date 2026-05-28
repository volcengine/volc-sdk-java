package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeAppInstancesRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String instanceId;
    private String instanceType;
    private String instanceName;
    private String description;

    public boolean CheckValidation() {
        return true;
    }
}
