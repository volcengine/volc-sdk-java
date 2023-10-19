package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeCheckpointRequest {
    @JSONField(serialize = false)
    String projectID;
    @JSONField(serialize = false)
    String topicID;
    @JSONField(serialize = false)
    int shardID;
    @JSONField(name = CONSUMER_GROUP_NAME)
    String consumerGroupName;

    /**
     * @param projectID 日志项目ID
     * @param topicID 日志主题ID
     * @param shardID ShardID
     * @param consumerGroupName 消费组名称
     */
    public DescribeCheckpointRequest(String projectID, String topicID, int shardID, String consumerGroupName) {
        this.projectID = projectID;
        this.topicID = topicID;
        this.shardID = shardID;
        this.consumerGroupName = consumerGroupName;
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
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.projectID != null && this.topicID != null && this.consumerGroupName != null;
    }
}
