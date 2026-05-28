package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeProcessorByTopicRequest {
    String topicId;

    public boolean CheckValidation() {
        return topicId != null && !topicId.isEmpty();
    }
}
