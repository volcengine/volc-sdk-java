package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeHostGroupRulesRequest {
    private String hostGroupId;
    private int pageNumber;
    private int pageSize;

    public DescribeHostGroupRulesRequest(String hostGroupId, int pageNumber, int pageSize) {
        this.hostGroupId = hostGroupId;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public String getHostGroupId() {
        return hostGroupId;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public boolean CheckValidation() {
        if (this.hostGroupId == null) {
            return false;
        }
        return true;
    }
}
