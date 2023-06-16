package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageMigrateTasksResp {
    @JSONField(name = "Tasks")
    List<GetImageMigrateTasksRespTask> tasks;
}

