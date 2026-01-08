package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ImportTaskInfo {
    /**
     * 导入任务ID
     */
    @JSONField(name = TASK_ID)
    private String taskId;

    /**
     * 导入任务名称
     */
    @JSONField(name = TASK_NAME)
    private String taskName;

    /**
     * 日志主题ID
     */
    @JSONField(name = TOPIC_ID)
    private String topicId;

    /**
     * 日志主题名称
     */
    @JSONField(name = TOPIC_NAME)
    private String topicName;

    /**
     * 日志项目ID
     */
    @JSONField(name = PROJECT_ID)
    private String projectId;

    /**
     * 日志项目名称
     */
    @JSONField(name = PROJECT_NAME)
    private String projectName;

    /**
     * 导入任务状态
     */
    @JSONField(name = "status")
    private String status;

    /**
     * 导入任务创建时间
     */
    @JSONField(name = CREATE_TIME)
    private String createTime;

    /**
     * 导入任务修改时间
     */
    @JSONField(name = MODIFY_TIME)
    private String modifyTime;

    /**
     * 导入配置
     */
    @JSONField(name = IMPORT_CONFIG)
    private ImportConfig importConfig;

    /**
     * 导入进度信息
     */
    @JSONField(name = PROGRESS)
    private ImportProgress progress;

    /**
     * 任务描述
     */
    @JSONField(name = DESCRIPTION)
    private String description;

    /**
     * 任务错误信息
     */
    @JSONField(name = ERROR_MESSAGE)
    private String errorMessage;
}