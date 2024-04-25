package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityLivePromotionDataRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
}