package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageMigrateTasksRespTaskRun {
    @JSONField(name = "StartAt")
    String startAt;

    @JSONField(name = "DoneAt")
    String doneAt;
}

