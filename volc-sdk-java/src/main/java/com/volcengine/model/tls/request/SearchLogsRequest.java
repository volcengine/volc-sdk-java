package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.RegionTopic;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class SearchLogsRequest {
    @JSONField(name = TOPIC_ID)
    private String topicId;

    @JSONField(name = QUERY)
    private String query;

    @JSONField(name = START_TIME)
    private Long startTime;

    @JSONField(name = END_TIME)
    private Long endTime;

    @JSONField(name = LIMIT)
    private Integer limit = 20;

    @JSONField(name = CONTEXT)
    private String context;

    @JSONField(name = SORT)
    private String sort;

    @JSONField(name = HIGH_LIGHT)
    private Boolean highLight;

    @JSONField(name = ACCURATE_QUERY)
    private Boolean accurateQuery;

    @JSONField(name = OFFSET)
    private Integer offset;

    @JSONField(name = MUST_COMPLETE)
    private Boolean mustComplete;

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
     * @return 返回的日志条数，上限以服务端配置为准
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * @param limit 返回的日志条数，上限以服务端配置为准
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return 翻页时使用的上下文信息
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context 翻页时使用的上下文信息
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return 日志的排序方式，升序 asc，降序 desc
     */
    public String getSort() {
        return sort;
    }

    /**
     * @param sort 日志的排序方式，升序 asc，降序 desc
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * @return 搜索的关键字在查询结果中是否高亮显示
     */
    public Boolean getHighLight() {
        return highLight;
    }

    /**
     * @param highLight 搜索的关键字在查询结果中是否高亮显示
     */
    public void setHighLight(Boolean highLight) {
        this.highLight = highLight;
    }

    /**
     * @return 是否使用精确查询
     */
    public Boolean getAccurateQuery() {
        return accurateQuery;
    }

    /**
     * @param accurateQuery 是否使用精确查询
     */
    public void setAccurateQuery(Boolean accurateQuery) {
        this.accurateQuery = accurateQuery;
    }

    /**
     * @return 深翻页偏移量
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * @param offset 深翻页偏移量
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * @return 是否必须返回完全精确的结果
     */
    public Boolean getMustComplete() {
        return mustComplete;
    }

    /**
     * @param mustComplete 是否必须返回完全精确的结果
     */
    public void setMustComplete(Boolean mustComplete) {
        this.mustComplete = mustComplete;
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

    /**
     * @return 检验必填参数，true 合法，false 不合法
     */
    public boolean CheckValidation() {
        return this.topicId != null && this.query != null && this.startTime != null && this.endTime != null;
    }

    /**
     * @param startTime 查询开始时间点，单位为秒级 Unix 时间戳
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     * @param endTime 查询结束时间点，单位为秒级 Unix 时间戳
     */
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    /**
     * @param startTime 查询开始时间点，单位为秒级 Unix 时间戳
     */
    @Deprecated
    public void setStartTime(BigInteger startTime) {
        this.startTime = startTime.longValue();
    }

    /**
     * @param endTime 查询结束时间点，单位为秒级 Unix 时间戳
     */
    @Deprecated
    public void setEndTime(BigInteger endTime) {
        this.endTime = endTime.longValue();
    }
}
