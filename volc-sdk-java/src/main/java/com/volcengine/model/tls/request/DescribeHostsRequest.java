package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeHostsRequest {
    String hostGroupId;
    String ip;
    Integer heartbeatStatus;
    Integer pageNumber;
    Integer pageSize;

    public boolean CheckValidation() {
        if (this.hostGroupId == null) {
            return false;
        }
        return true;
    }
}
