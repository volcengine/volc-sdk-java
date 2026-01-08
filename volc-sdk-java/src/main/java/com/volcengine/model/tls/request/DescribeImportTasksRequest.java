package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeImportTasksRequest {
    /**
     * 分页页码
     */
    @JSONField(name = PAGE_NUMBER)
    private Integer pageNumber;

    /**
     * 页面大小
     */
    @JSONField(name = PAGE_SIZE)
    private Integer pageSize;

    /**
     * 导入任务ID，支持模糊查询
     */
    @JSONField(name = TASK_ID)
    private String taskId;

    /**
     * 导入任务名称，支持模糊查询
     */
    @JSONField(name = TASK_NAME)
    private String taskName;

    /**
     * 日志主题ID
     */
    @JSONField(name = TOPIC_ID)
    private String topicId;

    /**
     * 日志项目名称
     */
    @JSONField(name = PROJECT_NAME)
    private String projectName;

    /**
     * 日志项目 ID
     */
    @JSONField(name = PROJECT_ID)
    private String projectId;

    /**
     * 日志主题名称
     */
    @JSONField(name = TOPIC_NAME)
    private String topicName;

    /**
     * 导入源类型
     */
    @JSONField(name = SOURCE_TYPE)
    private String sourceType;

    /**
     * 访问控制项目名称
     */
    @JSONField(name = IAM_PROJECT_NAME)
    private String iamProjectName;

    /**
     * 导入任务状态
     */
    @JSONField(name = STATUS)
    private String status;

    public boolean CheckValidation() {
        return true;
    }
}
