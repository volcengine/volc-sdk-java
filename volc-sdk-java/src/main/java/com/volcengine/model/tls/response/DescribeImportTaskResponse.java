package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ImportTaskInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeImportTaskResponse extends CommonResponse {
    @JSONField(name = "TaskId")
    private String taskId;

    @JSONField(name = "TaskName")
    private String taskName;

    @JSONField(name = "TopicId")
    private String topicId;

    @JSONField(name = "TopicName")
    private String topicName;

    @JSONField(name = "ProjectId")
    private String projectId;

    @JSONField(name = "ProjectName")
    private String projectName;

    @JSONField(name = "TaskType")
    private String taskType;

    @JSONField(name = "Status")
    private String status;

    @JSONField(name = "CreateTime")
    private String createTime;

    @JSONField(name = "StartTime")
    private String startTime;

    @JSONField(name = "EndTime")
    private String endTime;

    @JSONField(name = "LastModifiedTime")
    private String lastModifiedTime;

    @JSONField(name = "ImportedBytes")
    private Long importedBytes;

    @JSONField(name = "ImportedCount")
    private Long importedCount;

    @JSONField(name = "FailedCount")
    private Long failedCount;

    @JSONField(name = "Progress")
    private Integer progress;

    @JSONField(name = "UploadDetail")
    private String uploadDetail;

    @JSONField(name = "TaskDetail")
    private String taskDetail;

    @JSONField(name = "TaskInfo")
    private ImportTaskInfo taskInfo;

    public DescribeImportTaskResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeImportTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeImportTaskResponse response = (DescribeImportTaskResponse) super.deSerialize(data, clazz);
        this.setTaskId(response.getTaskId());
        this.setTaskName(response.getTaskName());
        this.setTopicId(response.getTopicId());
        this.setTopicName(response.getTopicName());
        this.setProjectId(response.getProjectId());
        this.setProjectName(response.getProjectName());
        this.setTaskType(response.getTaskType());
        this.setStatus(response.getStatus());
        this.setCreateTime(response.getCreateTime());
        this.setStartTime(response.getStartTime());
        this.setEndTime(response.getEndTime());
        this.setLastModifiedTime(response.getLastModifiedTime());
        this.setImportedBytes(response.getImportedBytes());
        this.setImportedCount(response.getImportedCount());
        this.setFailedCount(response.getFailedCount());
        this.setProgress(response.getProgress());
        this.setUploadDetail(response.getUploadDetail());
        this.setTaskDetail(response.getTaskDetail());
        this.setTaskInfo(response.getTaskInfo());
        return this;
    }
}
