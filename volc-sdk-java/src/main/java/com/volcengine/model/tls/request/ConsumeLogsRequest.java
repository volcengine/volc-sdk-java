package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ConsumeLogsRequest {
    @JSONField(name = CURSOR)
    String cursor;
    @JSONField(name = END_CURSOR)
    String endCursor;
    @JSONField(name = LOG_GROUP_COUNT)
    Integer logGroupCount;
    @JSONField(name = COMPRESSION)
    String compression;
    @JSONField(serialize = false)
    String topicId;
    @JSONField(serialize = false)
    Integer shardId;


    /**
     * @return 开始游标
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * @param cursor 开始游标
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    /**
     * @return 结束游标
     */
    public String getEndCursor() {
        return endCursor;
    }

    /**
     * @param endCursor 结束游标
     */
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

    /**
     * @return 想要返回的最大 logGroup 数量
     */
    public Integer getLogGroupCount() {
        return logGroupCount;
    }

    /**
     * @param logGroupCount 想要返回的最大 logGroup 数量
     */
    public void setLogGroupCount(Integer logGroupCount) {
        this.logGroupCount = logGroupCount;
    }

    /**
     * @return 返回数据的压缩格式支持lz4、zlib
     */
    public String getCompression() {
        return compression;
    }

    /**
     * @param compression 数据的压缩格式支持lz4、zlib
     */
    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * @return 日志主题id
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题id
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 消费的日志主题分区的 ID
     */
    public Integer getShardId() {
        return shardId;
    }

    /**
     * @param shardId 要消费日志的分区id
     */
    public void setShardId(Integer shardId) {
        this.shardId = shardId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null || this.shardId == null || this.cursor == null) {
            return false;
        }
        return true;
    }
}
