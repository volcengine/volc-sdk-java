package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeProcessorsRequest {
    String iamProjectName;
    String projectId;
    String projectName;
    String processorId;
    String processorName;
    String processorType;
    String processorStatus;
    String processorDSLType;
    Boolean orderByProject;
    Integer pageNumber;
    Integer pageSize;

    public boolean CheckValidation() {
        return true;
    }
}
