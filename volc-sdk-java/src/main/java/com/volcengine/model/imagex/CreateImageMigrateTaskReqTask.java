package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageMigrateTaskReqTask {

    @JSONField(name = "Name")
    String name;

    @JSONField(name = "Source")
    CreateImageMigrateTaskReqTaskSource source;

    @JSONField(name = "Dst")
    CreateImageMigrateTaskReqTaskDst dst;

    @JSONField(name = "Transcode")
    CreateImageMigrateTaskReqTaskTranscode transcode;

    @JSONField(name = "RunStrategy")
    CreateImageMigrateTaskReqTaskRunStrategy runStrategy;
}

