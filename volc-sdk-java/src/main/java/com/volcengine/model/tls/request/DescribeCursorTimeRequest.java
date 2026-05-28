package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeCursorTimeRequest {
    @JSONField(name = TOPIC_ID, serialize = false)
    private String topicId;
    @JSONField(name = SHARD_ID, serialize = false)
    private Integer shardId;
    @JSONField(name = CURSOR, serialize = false)
    private String cursor;

    public DescribeCursorTimeRequest(String topicId, Integer shardId, String cursor) {
        this.topicId = topicId;
        this.shardId = shardId;
        this.cursor = cursor;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Integer getShardId() {
        return shardId;
    }

    public void setShardId(Integer shardId) {
        this.shardId = shardId;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public boolean CheckValidation() {
        return this.topicId != null && this.shardId != null && this.cursor != null;
    }
}
