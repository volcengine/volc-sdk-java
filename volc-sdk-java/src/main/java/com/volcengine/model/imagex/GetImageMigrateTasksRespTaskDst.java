package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageMigrateTasksRespTaskDst {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "ServiceName")
    private String serviceName;


    @JSONField(name = "SkipBucket")
    private Boolean skipBucket;

    @JSONField(name = "Prefix")
    private String prefix;

    @JSONField(name = "UploadConf")
    private Integer uploadConf;
}

