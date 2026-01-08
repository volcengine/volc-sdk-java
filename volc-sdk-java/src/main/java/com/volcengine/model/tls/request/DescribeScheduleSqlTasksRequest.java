package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeScheduleSqlTasksRequest {
    @JSONField(name = PROJECT_ID)
    private String projectId;

    @JSONField(name = PROJECT_NAME)
    private String projectName;

    @JSONField(name = IAM_PROJECT_NAME)
    private String iamProjectName;

    @JSONField(name = TOPIC_ID)
    private String topicId;

    @JSONField(name = SOURCE_TOPIC_NAME)
    private String sourceTopicName;

    @JSONField(name = TASK_ID)
    private String taskId;

    @JSONField(name = TASK_NAME)
    private String taskName;

    @JSONField(name = STATUS)
    private String status;

    @JSONField(name = PAGE_NUMBER)
    private Integer pageNumber;

    @JSONField(name = PAGE_SIZE)
    private Integer pageSize;

    public boolean CheckValidation() {
        return true;
    }
}