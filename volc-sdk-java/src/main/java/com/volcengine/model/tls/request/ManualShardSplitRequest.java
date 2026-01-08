package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ManualShardSplit request model.
 */
@Data
@NoArgsConstructor
public class ManualShardSplitRequest {
    /**
     * 日志主题 ID.
     */
    @JSONField(name = "TopicId")
    private String topicId;
    
    /**
     * 待手动分裂的日志分区 ID.
     */
    @JSONField(name = "ShardId")
    private Integer shardId;
    
    /**
     * 分区的分裂数量.
     */
    @JSONField(name = "Number")
    private Integer number;

    /**
     * @param topicId 日志主题 ID
     * @param shardId 待手动分裂的日志分区 ID
     * @param number 分区的分裂数量
     */
    public ManualShardSplitRequest(final String topicId, final Integer shardId, 
                                  final Integer num) {
        this.topicId = topicId;
        this.shardId = shardId;
        this.number = num;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(final String topicId) {
        this.topicId = topicId;
    }

    /**
     * @param shardId 待手动分裂的日志分区 ID
     */
    public void setShardId(final Integer shardId) {
        this.shardId = shardId;
    }

    /**
     * @param num 分区的分裂数量
     */
    public void setNumber(final Integer num) {
        this.number = num;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean checkValidation() {
        return this.topicId != null && !this.topicId.isEmpty() && this.shardId != null 
            && this.number != null;
    }
}
