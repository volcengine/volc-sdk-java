package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageMigrateTaskResp {
    @JSONField(name = "TaskId")
    String taskId;
}

