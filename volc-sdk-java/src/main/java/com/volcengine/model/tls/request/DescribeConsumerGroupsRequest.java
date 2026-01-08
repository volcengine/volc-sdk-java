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
    String topicName;
    String iamProjectName;
    Integer pageNumber;
    Integer pageSize;

    public DescribeConsumerGroupsRequest(String projectID) {
        this.projectID = projectID;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        // 与 log-service 中 `DescribeConsumerGroupsReq` 的实现对齐：该接口不要求 ProjectID 等任一过滤参数必填，
        // 仅在服务端通过 ParsePage 做分页参数校验，因此这里不做本地必填约束，交由服务端校验。
        return true;
    }
}
