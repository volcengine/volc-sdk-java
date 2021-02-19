package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetAdvertisementDataAPIRequest {
    @JSONField(name = "ActivityId")
    Long activityId;
    @JSONField(name = "Source")
    Integer source;
}
