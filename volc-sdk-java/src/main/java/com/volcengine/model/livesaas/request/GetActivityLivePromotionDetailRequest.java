package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityLivePromotionDetailRequest {
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "AppPlatformType")
    String AppPlatformType;
    @JSONField(name = "AppPlatformName")
    String AppPlatformName;
}