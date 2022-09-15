package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeAlarmsRequest {
    String projectId;
    String alarmName;
    String alarmId;
    String topicId;
    String topicName;
    Boolean status;
    Integer pageNumber;
    Integer pageSize;
}
