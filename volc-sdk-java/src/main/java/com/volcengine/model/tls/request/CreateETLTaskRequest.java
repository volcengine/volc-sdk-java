package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.TargetResource;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateETLTaskRequest {
    @JSONField(name = DSL_TYPE)
    private String dslType;
    
    @JSONField(name = DESCRIPTION)
    private String description;
    
    @JSONField(name = ENABLE)
    private Boolean enable;
    
    @JSONField(name = FROM_TIME)
    private Long fromTime;
    
    @JSONField(name = NAME)
    private String name;
    
    @JSONField(name = SCRIPT)
    private String script;
    
    @JSONField(name = SOURCE_TOPIC_ID)
    private String sourceTopicId;
    
    @JSONField(name = TARGET_RESOURCES)
    private List<TargetResource> targetResources;
    
    @JSONField(name = TASK_TYPE)
    private String taskType;
    
    @JSONField(name = TO_TIME)
    private Long toTime;

    public CreateETLTaskRequest(String dslType, Boolean enable, String name, String script, 
                                String sourceTopicId, List<TargetResource> targetResources, String taskType) {
        this.dslType = dslType;
        this.enable = enable;
        this.name = name;
        this.script = script;
        this.sourceTopicId = sourceTopicId;
        this.targetResources = targetResources;
        this.taskType = taskType;
    }

    public boolean CheckValidation() {
        return this.dslType != null && !this.dslType.isEmpty() && this.enable != null && this.name != null && !this.name.isEmpty() && 
               this.script != null && !this.script.isEmpty() && this.sourceTopicId != null && !this.sourceTopicId.isEmpty() && 
               this.targetResources != null && !this.targetResources.isEmpty() && 
               this.taskType != null && !this.taskType.isEmpty();
    }
}
