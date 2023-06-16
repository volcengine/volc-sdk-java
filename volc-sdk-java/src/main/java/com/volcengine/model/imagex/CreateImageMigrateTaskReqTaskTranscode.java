package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageMigrateTaskReqTaskTranscode {
    @JSONField(name = "Format")
    String format;

    @JSONField(name = "Quality")
    Integer quality;

    @JSONField(name = "AlphaDemotion")
    Boolean AlphaDemotion;

    @JSONField(name = "DemotionFmt")
    String DemotionFmt;
}

