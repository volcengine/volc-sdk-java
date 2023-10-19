package com.volcengine.model.tls.request;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyConsumerGroupRequest {
    @JSONField(name = PROJECT_ID_UPPERCASE)
    String projectID;
    @JSONField(name = CONSUMER_GROUP_NAME)
    String consumerGroupName;
    @JSONField(name = TOPIC_ID_LIST)
    List<String> topicIDList;
    @JSONField(name = HEARTBEAT_TTL)
    int heartbeatTTL;
    @JSONField(name = ORDERED_CONSUME)
    boolean orderedConsume;

    /**
     * @param projectID 日志项目ID
     * @param consumerGroupName 消费组名称
     */
    public ModifyConsumerGroupRequest(String projectID, String consumerGroupName) {
        this.projectID = projectID;
        this.consumerGroupName = consumerGroupName;
    }

    /**
     * @param projectID 日志项目ID
     * @param consumerGroupName 消费组名称
     * @param topicIDList 消费者要消费的TopicID列表
     * @param heartbeatTTL 心跳TTL
     * @param orderedConsume 是否按顺序消费
     */
    public ModifyConsumerGroupRequest(String projectID, String consumerGroupName, List<String> topicIDList, int heartbeatTTL, boolean orderedConsume) {
        this.projectID = projectID;
        this.consumerGroupName = consumerGroupName;
        this.topicIDList = topicIDList;
        this.heartbeatTTL = heartbeatTTL;
        this.orderedConsume = orderedConsume;
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
     * @return 消费者要消费的TopicID列表
     */
    public List<String> getTopicIDList() {
        return topicIDList;
    }

    /**
     * @param topicIDList 消费者要消费的TopicID列表
     */
    public void setTopicIDList(List<String> topicIDList) {
        this.topicIDList = topicIDList;
    }

    /**
     * @return 心跳TTL
     */
    public int getHeartbeatTTL() {
        return heartbeatTTL;
    }

    /**
     * @param heartbeatTTL 心跳TTL
     */
    public void setHeartbeatTTL(int heartbeatTTL) {
        this.heartbeatTTL = heartbeatTTL;
    }

    /**
     * @return 是否按顺序消费
     */
    public boolean isOrderedConsume() {
        return orderedConsume;
    }

    /**
     * @param orderedConsume 是否按顺序消费
     */
    public void setOrderedConsume(boolean orderedConsume) {
        this.orderedConsume = orderedConsume;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.projectID != null && this.consumerGroupName != null;
    }
}
