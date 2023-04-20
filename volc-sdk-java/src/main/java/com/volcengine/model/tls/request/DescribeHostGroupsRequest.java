package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeHostGroupsRequest {
    String hostGroupId;
    String hostGroupName;
    Integer pageNumber;
    Integer pageSize;
    String hostIdentifier;

    public boolean CheckValidation() {
        return true;
    }
}
