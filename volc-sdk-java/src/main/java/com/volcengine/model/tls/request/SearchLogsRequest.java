package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class SearchLogsRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = QUERY)
    String query;
    @JSONField(name = START_TIME)
    Long startTime;
    @JSONField(name = END_TIME)
    Long endTime;
    @JSONField(name = LIMIT)
    Integer limit = 20;
    @JSONField(name = CONTEXT)
    String context;
    @JSONField(name = SORT)
    String sort;

    /**
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 查询分析语句
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query 查询分析语句
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return 查询开始时间点，精确到毫秒
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @param endTime 查询结束时间点，精确到毫秒
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * @return 返回的日志条数，最大值为 100
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * @param limit 返回的日志条数，最大值为 100
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return 检索上下文
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context 检索上下文
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return 仅检索不分析时，日志的排序方式，生序asc降序desc
     */
    public String getSort() {
        return sort;
    }

    /**
     * @param sort 仅检索不分析时，日志的排序方式，生序asc降序desc
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null || this.query == null || this.startTime == null || this.endTime == null) {
            return false;
        }
        return true;
    }

    /**
     * @param startTime 查询开始时间点，精确到毫秒
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     * @param endTime 查询结束时间点，精确到毫秒
     */
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    /**
     * @param startTime 查询开始时间点，精确到毫秒
     */
    @Deprecated
    public void setStartTime(BigInteger startTime) {
        this.startTime = startTime.longValue();
    }

    /**
     * @param endTime 查询结束时间点，精确到毫秒
     */
    @Deprecated
    public void setEndTime(BigInteger endTime) {
        this.endTime = endTime.longValue();
    }
}
