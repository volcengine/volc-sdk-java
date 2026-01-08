package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.END_TIME_OFFSET;
import static com.volcengine.model.tls.Const.END_TIME_OFFSET_UNIT;
import static com.volcengine.model.tls.Const.NUMBER;
import static com.volcengine.model.tls.Const.QUERY;
import static com.volcengine.model.tls.Const.START_TIME_OFFSET;
import static com.volcengine.model.tls.Const.START_TIME_OFFSET_UNIT;
import static com.volcengine.model.tls.Const.TIME_SPAN_TYPE;
import static com.volcengine.model.tls.Const.TOPIC_ID;
import static com.volcengine.model.tls.Const.TOPIC_NAME;
import static com.volcengine.model.tls.Const.TRUNCATED_TIME;

@Data
@NoArgsConstructor
public class QueryRequest {

    /** 告警策略执行的日志主题 ID. */
    @JSONField(name = TOPIC_ID)
    private String topicId;

    /** 告警策略执行的日志主题名称. */
    @JSONField(name = TOPIC_NAME)
    private String topicName;

    /** 查询语句，最大长度为 1024. */
    @JSONField(name = QUERY)
    private String query;

    /** 告警对象序号，从 1 开始递增. */
    @JSONField(name = NUMBER)
    private int number;

    /**
     * 查询范围起始时间相对当前的历史时间.
     * 单位为分钟，取值为非正，最大值为 0，最小值为 -1440。
     */
    @JSONField(name = START_TIME_OFFSET)
    private int startTimeOffset;

    /**
     * 查询范围终止时间相对当前的历史时间.
     * 单位为分钟，取值为非正，须大于起始时间偏移，最大值为 0，最小值为 -1440。
     */
    @JSONField(name = END_TIME_OFFSET)
    private int endTimeOffset;

    /** 时间跨度类型. */
    @JSONField(name = TIME_SPAN_TYPE)
    private String timeSpanType;

    /** 截断时间. */
    @JSONField(name = TRUNCATED_TIME)
    private String truncatedTime;

    /** 结束时间偏移单位. */
    @JSONField(name = END_TIME_OFFSET_UNIT)
    private String endTimeOffsetUnit;

    /** 起始时间偏移单位. */
    @JSONField(name = START_TIME_OFFSET_UNIT)
    private String startTimeOffsetUnit;

    /**
     * 获取日志主题 ID.
     *
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * 设置日志主题 ID.
     *
     * @param newTopicId 日志主题 ID
     */
    public void setTopicId(final String newTopicId) {
        this.topicId = newTopicId;
    }

    /**
     * 获取日志主题名称.
     *
     * @return 日志主题名称
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * 设置日志主题名称.
     *
     * @param newTopicName 日志主题名称
     */
    public void setTopicName(final String newTopicName) {
        this.topicName = newTopicName;
    }

    /**
     * 获取查询语句.
     *
     * @return 查询语句
     */
    public String getQuery() {
        return query;
    }

    /**
     * 设置查询语句.
     *
     * @param newQuery 查询语句
     */
    public void setQuery(final String newQuery) {
        this.query = newQuery;
    }

    /**
     * 获取告警对象序号.
     *
     * @return 告警对象序号
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置告警对象序号.
     *
     * @param newNumber 告警对象序号
     */
    public void setNumber(final int newNumber) {
        this.number = newNumber;
    }

    /**
     * 获取查询范围起始时间偏移.
     *
     * @return 起始时间偏移（分钟）
     */
    public int getStartTimeOffset() {
        return startTimeOffset;
    }

    /**
     * 设置查询范围起始时间偏移.
     *
     * @param newStartTimeOffset 起始时间偏移（分钟）
     */
    public void setStartTimeOffset(final int newStartTimeOffset) {
        this.startTimeOffset = newStartTimeOffset;
    }

    /**
     * 获取查询范围结束时间偏移.
     *
     * @return 结束时间偏移（分钟）
     */
    public int getEndTimeOffset() {
        return endTimeOffset;
    }

    /**
     * 设置查询范围结束时间偏移.
     *
     * @param newEndTimeOffset 结束时间偏移（分钟）
     */
    public void setEndTimeOffset(final int newEndTimeOffset) {
        this.endTimeOffset = newEndTimeOffset;
    }
}
