package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GenerateVideoAISummaryRequest {
    @JSONField(name = "Vid")
    String Vid;

    @JSONField(name = "ActivityId")
    Long ActivityId;
}
