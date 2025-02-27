package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class QueryRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = QUERY)
    String query;
    @JSONField(name = NUMBER)
    int number;
    @JSONField(name = START_TIME_OFFSET)
    int startTimeOffset;
    @JSONField(name = END_TIME_OFFSET)
    int endTimeOffset;
    @JSONField(name = TIME_SPAN_TYPE)
    String timeSpanType;
    @JSONField(name = TRUNCATED_TIME)
    String truncatedTime;

    /**
     * @return 告警策略执行的日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 告警策略执行的日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 告警策略执行的日志主题名称
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * @param topicName 告警策略执行的日志主题名称
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * @return 查询语句，支持的最大长度为 1024
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query 查询语句，支持的最大长度为 1024
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return 告警对象序号；从 1 开始递增
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number 告警对象序号；从 1 开始递增
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return 查询范围起始时间相对当前的历史时间，单位为分钟，取值为非正，最大值为 0，最小值为 -1440
     */
    public int getStartTimeOffset() {
        return startTimeOffset;
    }

    /**
     * @param startTimeOffset 查询范围起始时间相对当前的历史时间，单位为分钟，取值为非正，最大值为 0，最小值为 -1440
     */
    public void setStartTimeOffset(int startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }

    /**
     * @return 查询范围终止时间相对当前的历史时间，单位为分钟，取值为非正，须大于StartTimeOffset，最大值为 0，最小值为 -1440
     */
    public int getEndTimeOffset() {
        return endTimeOffset;
    }

    /**
     * @param endTimeOffset 查询范围终止时间相对当前的历史时间，单位为分钟，取值为非正，须大于StartTimeOffset，最大值为 0，最小值为 -1440
     */
    public void setEndTimeOffset(int endTimeOffset) {
        this.endTimeOffset = endTimeOffset;
    }
}
