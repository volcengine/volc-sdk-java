package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityLivePromotionDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityLivePromotionDataResponseBody result;

    @Data
    public static class GetActivityLivePromotionDataResponseBody {
        @JSONField(name = "LivePromotionCount")
        Long LivePromotionCount;
        @JSONField(name = "LivePromotionDuration")
        Long LivePromotionDuration;
        @JSONField(name = "LivePromotionPlatformCount")
        Long LivePromotionPlatformCount;
        @JSONField(name = "AppLiveTemplateLiveCount")
        Long AppLiveTemplateLiveCount;
        @JSONField(name = "AppLiveTemplateLiveDuration")
        Long AppLiveTemplateLiveDuration;
        @JSONField(name = "LiveCount")
        Long LiveCount;
    }
}