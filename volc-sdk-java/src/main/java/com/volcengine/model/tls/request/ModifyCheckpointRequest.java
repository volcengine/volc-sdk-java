package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyCheckpointRequest {
    @JSONField(name = PROJECT_ID_UPPERCASE)
    String projectID;
    @JSONField(name = TOPIC_ID_UPPERCASE)
    String topicID;
    @JSONField(name = SHARD_ID_UPPERCASE)
    int shardID;
    @JSONField(name = CONSUMER_GROUP_NAME)
    String consumerGroupName;
    @JSONField(name = CHECKPOINT)
    String checkpoint;

    /**
     * @param projectID 日志项目ID
     * @param topicID 日志主题ID
     * @param shardID ShardID
     * @param consumerGroupName 消费组名称
     * @param checkpoint 检查点
     */
    public ModifyCheckpointRequest(String projectID, String topicID, int shardID, String consumerGroupName, String checkpoint) {
        this.projectID = projectID;
        this.topicID = topicID;
        this.shardID = shardID;
        this.consumerGroupName = consumerGroupName;
        this.checkpoint = checkpoint;
    }

    /**
     * @return 日志项目ID
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * @param projectID 日志项目ID
     */
    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    /**
     * @return 日志主题ID
     */
    public String getTopicID() {
        return topicID;
    }

    /**
     * @param topicID 日志主题ID
     */
    public void setTopicID(String topicID) {
        this.topicID = topicID;
    }

    /**
     * @return ShardID
     */
    public int getShardID() {
        return shardID;
    }

    /**
     * @param shardID ShardID
     */
    public void setShardID(int shardID) {
        this.shardID = shardID;
    }

    /**
     * @return 消费组名称
     */
    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    /**
     * @param consumerGroupName 消费组名称
     */
    public void setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
    }

    /**
     * @return 检查点
     */
    public String getCheckpoint() {
        return checkpoint;
    }

    /**
     * @param checkpoint 检查点
     */
    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.projectID != null && this.topicID != null && this.consumerGroupName != null && this.checkpoint != null;
    }
}
