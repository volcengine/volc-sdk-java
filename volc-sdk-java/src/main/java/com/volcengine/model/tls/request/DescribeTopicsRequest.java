package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
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
