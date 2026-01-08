package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.request.importtask.ImportSourceInfo;
import com.volcengine.model.tls.request.importtask.TargetInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateImportTaskRequest {
    @JSONField(name = TASK_NAME)
    private String taskName;
    
    @JSONField(name = TOPIC_ID_UPPERCASE)
    private String topicID;
    
    @JSONField(name = PROJECT_ID_UPPERCASE)
    private String projectID;
    
    @JSONField(name = SOURCE_TYPE)
    private String sourceType;
    
    @JSONField(name = IMPORT_SOURCE_INFO)
    private ImportSourceInfo importSourceInfo;
    
    @JSONField(name = TARGET_INFO)
    private TargetInfo targetInfo;
    
    @JSONField(name = DESCRIPTION)
    private String description;

    public boolean CheckValidation() {
        return this.taskName != null && !this.taskName.isEmpty() && 
               this.topicID != null && !this.topicID.isEmpty() && 
               this.sourceType != null && !this.sourceType.isEmpty() && 
               this.importSourceInfo != null && 
               this.targetInfo != null;
    }
}