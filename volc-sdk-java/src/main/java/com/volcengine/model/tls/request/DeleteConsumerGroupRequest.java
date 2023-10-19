package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DeleteConsumerGroupRequest {
    @JSONField(name = PROJECT_ID_UPPERCASE)
    String projectID;
    @JSONField(name = CONSUMER_GROUP_NAME)
    String consumerGroupName;

    /**
     * @param projectID 日志项目ID
     * @param consumerGroupName 消费组名称
     */
    public DeleteConsumerGroupRequest(String projectID, String consumerGroupName) {
        this.projectID = projectID;
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
        return this.projectID != null && this.consumerGroupName != null;
    }
}
