package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeHostsRequest {
    String hostGroupId;
    String ip;
    Integer heartbeatStatus;
    Integer pageNumber;
    Integer pageSize;

    /**
     * @return 机器 IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip 机器 IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return 机器心跳状态
     */
    public Integer getHeartbeatStatus() {
        return heartbeatStatus;
    }

    /**
     * @param heartbeatStatus 机器心跳状态
     */
    public void setHeartbeatStatus(Integer heartbeatStatus) {
        this.heartbeatStatus = heartbeatStatus;
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
        if (this.hostGroupId == null || this.hostGroupId.isEmpty()) {
            return false;
        }
        return true;
    }
}
