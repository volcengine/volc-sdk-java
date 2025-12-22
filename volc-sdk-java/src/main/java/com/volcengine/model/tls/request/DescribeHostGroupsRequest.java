package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeHostGroupsRequest {
    String hostGroupId;
    String hostGroupName;
    Integer pageNumber;
    Integer pageSize;
    String hostIdentifier;
    Boolean autoUpdate;
    String iamProjectName;
    Boolean serviceLogging;

    /**
     * @return 机器组的名称
     */
    public String getHostGroupName() {
        return hostGroupName;
    }

    /**
     * @param hostGroupName 机器组的名称
     */
    public void setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
    }

    /**
     * @return 机器组标识
     */
    public String getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * @param hostIdentifier 机器组标识
     */
    public void setHostIdentifier(String hostIdentifier) {
        this.hostIdentifier = hostIdentifier;
    }

    /**
     * @param hostGroupId 机器组的 ID
     */
    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    /**
     * @return 分页查询时的页码。默认为 1
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber 分页查询时的页码。默认为 1
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return 分页大小。默认为 20，最大为 100
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize 分页大小。默认为 20，最大为 100
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return 机器组的 ID
     */
    public String getHostGroupId() {
        return hostGroupId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return true;
    }
}
