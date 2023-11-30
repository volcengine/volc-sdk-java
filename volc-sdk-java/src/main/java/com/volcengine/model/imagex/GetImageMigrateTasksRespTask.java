package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageMigrateTasksRespTask {
    @JSONField(name = "ID")
    String id;

    @JSONField(name = "Name")
    String name;

    @JSONField(name = "Status")
    String status;

    @JSONField(name = "Source")
    GetImageMigrateTasksRespTaskSource source;

    @JSONField(name = "Dst")
    GetImageMigrateTasksRespTaskDst dst;

    @JSONField(name = "Transcode")
    GetImageMigrateTasksRespTaskTranscode transcode;

    @JSONField(name = "RunStrategy")
    GetImageMigrateTasksRespTaskRunStrategy runStrategy;

    @JSONField(name = "Progress")
    GetImageMigrateTasksRespTaskProgress progress;

    @JSONField(name = "Run")
    List<GetImageMigrateTasksRespTaskRun> run;
}

