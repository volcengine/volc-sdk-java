package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeConsumerGroupsRequest {
    String projectID;
    String projectName;
    String consumerGroupName;
    String topicId;
    Integer pageNumber;
    Integer pageSize;

    public DescribeConsumerGroupsRequest(String projectID) {
        this.projectID = projectID;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return this.projectID != null;
    }
}
