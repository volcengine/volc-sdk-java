package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Shard query response model.
 */
@Data
@NoArgsConstructor
public class ShardQueryResponse {
    /**
     * 分区的结束键值（不包含）.
     */
    @JSONField(name = "ExclusiveEndKey")
    private String exclusiveEndKey;
    
    /**
     * 分区的起始键值（包含）.
     */
    @JSONField(name = "InclusiveBeginKey")
    private String inclusiveBeginKey;
    
    /**
     * 分区修改时间.
     */
    @JSONField(name = "ModifyTime")
    private String modifyTime;
    
    /**
     * 分区ID.
     */
    @JSONField(name = "ShardId")
    private Integer shardId;
    
    /**
     * 分区状态.
     */
    @JSONField(name = "Status")
    private String status;
    
    /**
     * 日志主题ID.
     */
    @JSONField(name = "TopicId")
    private String topicId;

    /**
     * @param exclusiveEndKey 分区的结束键值（不包含）
     */
    public void setExclusiveEndKey(final String exclusiveEndKey) {
        this.exclusiveEndKey = exclusiveEndKey;
    }

    /**
     * @param inclusiveBeginKey 分区的起始键值（包含）
     */
    public void setInclusiveBeginKey(final String inclusiveBeginKey) {
        this.inclusiveBeginKey = inclusiveBeginKey;
    }

    /**
     * @param modifyTime 分区修改时间
     */
    public void setModifyTime(final String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @param shardId 分区ID
     */
    public void setShardId(final Integer shardId) {
        this.shardId = shardId;
    }

    /**
     * @param status 分区状态
     */
    public void setStatus(final String status) {
        this.status = status;
    }

    /**
     * @param topicId 日志主题ID
     */
    public void setTopicId(final String topicId) {
        this.topicId = topicId;
    }
}