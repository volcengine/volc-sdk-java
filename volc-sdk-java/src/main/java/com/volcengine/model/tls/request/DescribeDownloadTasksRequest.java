package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeDownloadTasksRequest {
    @JSONField(serialize = false)
    String topicId;

    @JSONField(serialize = false)
    Integer pageNumber;

    @JSONField(serialize = false)
    Integer pageSize;

    /**
     * @param topicId    日志所在的日志主题 ID
     * @param pageNumber 分页查询时的页码。默认为 1
     * @param pageSize   分页大小。默认为 20，最大为 100
     */
    public DescribeDownloadTasksRequest(String topicId, Integer pageNumber, Integer pageSize) {
        this.topicId = topicId;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    /**
     * @return 日志所在的日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志所在的日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
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
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null) {
            return false;
        }
        return true;
    }
}
