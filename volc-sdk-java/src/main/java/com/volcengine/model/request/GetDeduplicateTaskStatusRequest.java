package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDeduplicateTaskStatusRequest {
    @JSONField(name = "TaskId")
    private String taskId;
}
