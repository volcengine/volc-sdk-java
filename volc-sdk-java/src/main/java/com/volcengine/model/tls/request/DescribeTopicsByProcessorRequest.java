package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeTopicsByProcessorRequest {
    String processorId;
    Integer pageNumber;
    Integer pageSize;

    public boolean CheckValidation() {
        return processorId != null && !processorId.isEmpty();
    }
}

