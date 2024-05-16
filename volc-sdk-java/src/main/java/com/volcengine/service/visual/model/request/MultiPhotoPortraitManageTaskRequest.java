package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MultiPhotoPortraitManageTaskRequest {
    
    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "manage_type")
    String manageType;

    @JSONField(name = "task_id")
    String taskId;

    @JSONField(name = "task_type")
    Integer taskType;

    @JSONField(name = "model_id")
    String modelId;
}