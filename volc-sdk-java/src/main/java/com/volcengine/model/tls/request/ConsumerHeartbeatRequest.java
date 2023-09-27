package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ConsumerHeartbeatRequest {
    @JSONField(name = PROJECT_ID_UPPERCASE)
    String projectID;
    @JSONField(name = CONSUMER_GROUP_NAME)
    String consumerGroupName;
    @JSONField(name = CONSUMER_NAME)
    String consumerName;

    /**
     * @param projectID 日志项目ID
     * @param consumerGroupName 消费组名称
     * @param consumerName 消费者
     */
    public ConsumerHeartbeatRequest(String projectID, String consumerGroupName, String consumerName) {
        this.projectID = projectID;
        this.consumerGroupName = consumerGroupName;
        this.consumerName = consumerName;
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
     * @return 消费者
     */
    public String getConsumerName() {
        return consumerName;
    }

    /**
     * @param consumerName 消费者
     */
    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.projectID != null && this.consumerGroupName != null && this.consumerName != null;
    }
}
