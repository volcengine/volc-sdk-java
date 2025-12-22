package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyImportTaskRequest {
    @JSONField(name = TASK_ID)
    private String taskId;
    
    @JSONField(name = TASK_NAME)
    private String taskName;
    
    @JSONField(name = DESCRIPTION)
    private String description;
    
    @JSONField(name = PROJECT_ID_UPPERCASE)
    private String projectID;
    
    @JSONField(name = TOPIC_ID_UPPERCASE)
    private String topicID;
    
    @JSONField(name = SOURCE_TYPE)
    private String sourceType;
    
    @JSONField(name = STATUS)
    private Integer status;
    
    @JSONField(name = IMPORT_SOURCE_INFO)
    private ImportSourceInfo importSourceInfo;
    
    @JSONField(name = TARGET_INFO)
    private TargetInfo targetInfo;

    public boolean CheckValidation() {
        if (this.taskId == null || this.taskId.isEmpty()) {
            return false;
        }
        if (this.taskName == null || this.taskName.isEmpty()) {
            return false;
        }
        if (this.sourceType == null || this.sourceType.isEmpty()) {
            return false;
        }
        if (this.status == null) {
            return false;
        }
        if (this.projectID == null || this.projectID.isEmpty()) {
            return false;
        }
        if (this.topicID == null || this.topicID.isEmpty()) {
            return false;
        }
        if (this.importSourceInfo == null) {
            return false;
        }
        if (this.targetInfo == null) {
            return false;
        }
        return true;
    }
}