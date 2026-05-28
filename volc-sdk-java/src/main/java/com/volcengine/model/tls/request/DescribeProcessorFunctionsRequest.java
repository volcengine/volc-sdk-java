package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeProcessorFunctionsRequest {
    String processorType;
    String processorDSLType;

    public boolean CheckValidation() {
        return processorType != null && !processorType.isEmpty();
    }
}
