package com.volcengine.model.tls;

import lombok.Data;

@Data
public class DescribeRulesRequest {
    String projectId;
    String ruleId;
    String ruleName;
    String topicId;
    String topicName;
    Integer pageNumber;
    Integer pageSize;

    public boolean CheckValidation() {
        if (this.projectId == null) {
            return false;
        }
        return true;
    }
}
