package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class MultiPhotoPortraitGetTaskResultRequest {
    
    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "task_id")
    String taskId;

    @JSONField(name = "task_type")
    Integer taskType;

}