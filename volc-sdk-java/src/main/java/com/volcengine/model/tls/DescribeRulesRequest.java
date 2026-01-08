package com.volcengine.model.tls;

import lombok.Data;

@Data
public class DescribeRulesRequest {
    String projectId;
    String projectName;
    String iamProjectName;
    String ruleId;
    String ruleName;
    String topicId;
    String topicName;
    Integer pageNumber;
    String logType;
    Integer pageSize;
    Integer pause;

    public boolean CheckValidation() {
        if (this.projectId == null || this.projectId.isEmpty()) {
            return false;
        }
        return true;
    }
}
