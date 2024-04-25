package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityLivePromotionDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityLivePromotionDetailResponseBody result;

    @Data
    public static class GetActivityLivePromotionDetailResponseBody {
        @JSONField(name = "DetailList")
        List<LivePromotionDetail> DetailList;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class LivePromotionDetail {
        @JSONField(name = "PlatformName")
        String PlatformName;
        @JSONField(name = "PlatformType")
        String PlatformType;
        @JSONField(name = "PushStatus")
        Integer PushStatus;
        @JSONField(name = "PushStartTime")
        Long PushStartTime;
        @JSONField(name = "PushEndTime")
        Long PushEndTime;
        @JSONField(name = "UseAppTemplate")
        Boolean UseAppTemplate;
    }
}