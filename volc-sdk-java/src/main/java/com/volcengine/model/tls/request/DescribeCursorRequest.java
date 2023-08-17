package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.FROM;

@Data
public class DescribeCursorRequest {
    @JSONField(serialize = false)
    private String topicId;
    @JSONField(serialize = false)
    private Integer shardId;
    @JSONField(name = FROM)
    private String from;

    public DescribeCursorRequest() {
    }

    /**
     * @param topicId 要获取日志游标的日志主题 ID
     * @param shardId 日志分区的 ID
     * @param from 时间点（Unix 时间戳，以秒为单位）或者字符串 begin、end
     */
    public DescribeCursorRequest(String topicId, Integer shardId, String from) {
        this.topicId = topicId;
        this.shardId = shardId;
        this.from = from;
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
     * @return 日志分区的 ID
     */
    public Integer getShardId() {
        return shardId;
    }

    /**
     * @param shardId 日志分区的 ID
     */
    public void setShardId(Integer shardId) {
        this.shardId = shardId;
    }

    /**
     * @return 时间点（Unix 时间戳，以秒为单位）或者字符串 begin、end
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from 时间点（Unix 时间戳，以秒为单位）或者字符串 begin、end
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null || this.shardId == null || this.from == null) {
            return false;
        }
        return true;
    }
}
