package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageMigrateTasksReq {
    @JSONField(name = "Region")
    String region;

    @JSONField(name = "TaskId")
    String taskId;
}

