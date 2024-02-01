package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageMigrateTasksReq {
    @JSONField(name = "Region")
    String region;

    @JSONField(name = "TaskId")
    String taskId;

    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "Offset")
    Integer offset;

    @JSONField(name = "Limit")
    Integer limit;

    @JSONField(name = "TaskNamePtn")
    String taskNamePtn;

    @JSONField(name = "Status")
    String status;
}

