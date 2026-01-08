package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.RegionTopic;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeHistogramV1Request {

    @JSONField(name = TOPIC_ID)
    private String topicId;

    @JSONField(name = QUERY)
    private String query;

    @JSONField(name = START_TIME)
    private Long startTime;

    @JSONField(name = END_TIME)
    private Long endTime;

    @JSONField(name = INTERVAL)
    private Long interval;

    @JSONField(name = REGION_TOPICS)
    private List<RegionTopic> regionTopics;

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
     * @return 查询开始时间点，单位为秒级 Unix 时间戳
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 查询开始时间点，单位为秒级 Unix 时间戳
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * @return 查询结束时间点，单位为秒级 Unix 时间戳
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 查询结束时间点，单位为秒级 Unix 时间戳
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * @return 直方图子区间间隔，单位为秒
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * @param interval 直方图子区间间隔，单位为秒
     */
    public void setInterval(Long interval) {
        this.interval = interval;
    }

    /**
     * @return 多 Region/Topic 查询使用的 RegionTopics 参数
     */
    public List<RegionTopic> getRegionTopics() {
        return regionTopics;
    }

    /**
     * @param regionTopics 多 Region/Topic 查询使用的 RegionTopics 参数
     */
    public void setRegionTopics(List<RegionTopic> regionTopics) {
        this.regionTopics = regionTopics;
    }

    public boolean CheckValidation() {
        return this.topicId != null && this.query != null && this.startTime != null && this.endTime != null;
    }
}
