package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeTopicsRequest {
    String projectId;
    Integer pageNumber;
    Integer pageSize;
    Boolean IsFullName;
    String topicName;
    String topicId;
}
