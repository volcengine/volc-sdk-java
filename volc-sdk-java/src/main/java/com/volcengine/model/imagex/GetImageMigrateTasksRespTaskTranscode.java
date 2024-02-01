package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageMigrateTasksRespTaskTranscode {
    @JSONField(name = "Format")
    private String format;

    @JSONField(name = "Quality")
    private Integer quality;


    @JSONField(name = "AlphaDemotion")
    private Boolean alphaDemotion;

    @JSONField(name = "DemotionFmt")
    private String demotionFmt;
}

