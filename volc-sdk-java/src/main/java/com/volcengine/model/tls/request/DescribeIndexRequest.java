package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeIndexRequest {
    private String topicId;

    public DescribeIndexRequest(String topicId) {
        this.topicId = topicId;
    }

}
