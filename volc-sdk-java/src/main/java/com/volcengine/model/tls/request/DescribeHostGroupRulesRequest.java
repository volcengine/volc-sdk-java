package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeHostGroupRulesRequest {
    private String hostGroupId;
    private int pageNumber;
    private int pageSize;

    /**
     * @param hostGroupId 机器组的 ID
     * @param pageNumber  分页查询时的页码。默认为 1
     * @param pageSize    分页大小。默认为 20
     */
    public DescribeHostGroupRulesRequest(String hostGroupId, int pageNumber, int pageSize) {
        this.hostGroupId = hostGroupId;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    /**
     * @param hostGroupId 机器组的 ID
     */
    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    /**
     * @param pageNumber 分页查询时的页码。默认为 1
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @param pageSize 分页大小。默认为 20
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return 分页查询时的页码。默认为 1
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * @return 分页大小。默认为 20
     */
    public int getPageSize() {
        return pageSize;
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
        if (this.hostGroupId == null) {
            return false;
        }
        return true;
    }
}
