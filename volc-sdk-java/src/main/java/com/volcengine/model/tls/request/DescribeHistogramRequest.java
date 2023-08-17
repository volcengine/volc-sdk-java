package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeHistogramRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;

    @JSONField(name = QUERY)
    String query;

    @JSONField(name = START_TIME)
    Long startTime;

    @JSONField(name = END_TIME)
    Long endTime;

    @JSONField(name = INTERVAL)
    BigInteger interval;

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
     * @param startTime 查询开始时间点，精确到毫秒。Unix 时间戳格式
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     * @param endTime 查询结束时间点，精确到毫秒。Unix 时间戳格式
     */
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

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
     * @return 查询语句，语句长度最大为 4KiB
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query 查询语句，语句长度最大为 4KiB
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return 查询开始时间点，精确到毫秒。Unix 时间戳格式
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 查询开始时间点，精确到毫秒。Unix 时间戳格式
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * @return 查询结束时间点，精确到毫秒。Unix 时间戳格式
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 查询结束时间点，精确到毫秒。Unix 时间戳格式
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * @return 直方图的子区间长度。单位为毫秒
     */
    public BigInteger getInterval() {
        return interval;
    }

    /**
     * @param interval 直方图的子区间长度。单位为毫秒
     */
    public void setInterval(BigInteger interval) {
        this.interval = interval;
    }

    /**
     * @param startTime 查询开始时间点，精确到毫秒。Unix 时间戳格式
     */
    @Deprecated
    public void setStartTime(BigInteger startTime) {
        this.startTime = startTime.longValue();
    }

    /**
     * @param endTime 查询结束时间点，精确到毫秒。Unix 时间戳格式
     */
    @Deprecated
    public void setEndTime(BigInteger endTime) {
        this.endTime = endTime.longValue();
    }
}
