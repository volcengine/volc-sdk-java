package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeProcessorBindingsRequest {
    String projectId;
    Integer pageNumber;
    Integer pageSize;

    public boolean CheckValidation() {
        return projectId != null && !projectId.isEmpty();
    }
}
