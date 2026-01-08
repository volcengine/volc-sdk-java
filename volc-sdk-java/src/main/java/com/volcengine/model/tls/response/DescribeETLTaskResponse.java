package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.TargetResources;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeETLTaskResponse extends CommonResponse {
    @JSONField(name = CREATE_TIME)
    private String createTime;
    
    @JSONField(name = DSL_TYPE)
    private String dslType;
    
    @JSONField(name = DESCRIPTION)
    private String description;
    
    @JSONField(name = ETL_STATUS)
    private String etlStatus;
    
    @JSONField(name = ENABLE)
    private Boolean enable;
    
    @JSONField(name = FROM_TIME)
    private Long fromTime;
    
    @JSONField(name = LAST_ENABLE_TIME)
    private String lastEnableTime;
    
    @JSONField(name = MODIFY_TIME)
    private String modifyTime;
    
    @JSONField(name = NAME)
    private String name;
    
    @JSONField(name = PROJECT_ID)
    private String projectId;
    
    @JSONField(name = PROJECT_NAME)
    private String projectName;
    
    @JSONField(name = SCRIPT)
    private String script;
    
    @JSONField(name = SOURCE_TOPIC_ID)
    private String sourceTopicId;
    
    @JSONField(name = SOURCE_TOPIC_NAME)
    private String sourceTopicName;
    
    @JSONField(name = TARGET_RESOURCES)
    private List<TargetResources> targetResources;
    
    @JSONField(name = TASK_ID)
    private String taskId;
    
    @JSONField(name = TASK_TYPE)
    private String taskType;
    
    @JSONField(name = TO_TIME)
    private Long toTime;

    public DescribeETLTaskResponse(Header[] headers) throws LogException {
        super(headers);
    }

    @Override
    public DescribeETLTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeETLTaskResponse response = (DescribeETLTaskResponse) super.deSerialize(data, clazz);
        this.setCreateTime(response.getCreateTime());
        this.setDslType(response.getDslType());
        this.setDescription(response.getDescription());
        this.setEtlStatus(response.getEtlStatus());
        this.setEnable(response.getEnable());
        this.setFromTime(response.getFromTime());
        this.setLastEnableTime(response.getLastEnableTime());
        this.setModifyTime(response.getModifyTime());
        this.setName(response.getName());
        this.setProjectId(response.getProjectId());
        this.setProjectName(response.getProjectName());
        this.setScript(response.getScript());
        this.setSourceTopicId(response.getSourceTopicId());
        this.setSourceTopicName(response.getSourceTopicName());
        this.setTargetResources(response.getTargetResources());
        this.setTaskId(response.getTaskId());
        this.setTaskType(response.getTaskType());
        this.setToTime(response.getToTime());
        return this;
    }
}
