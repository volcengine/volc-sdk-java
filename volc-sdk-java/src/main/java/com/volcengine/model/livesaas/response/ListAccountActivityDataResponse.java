package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListAccountActivityDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAccountActivityDataResponseBody result;

    @Data
    public static class ListAccountActivityDataResponseBody {
        @JSONField(name = "PageToken")
        String PageToken;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "Activities")
        List<AccountActivityData> Activities;
    }

    @Data
    public static class AccountActivityData {
        @JSONField(name = "AppTemplateLiveDuration")
        Long AppTemplateLiveDuration;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "UV")
        Long UV;
        @JSONField(name = "WatchDurationPerPeople")
        Long WatchDurationPerPeople;
        @JSONField(name = "LivePromotionLiveDuration")
        Long LivePromotionLiveDuration;
        @JSONField(name = "AppTemplateLiveCount")
        Long AppTemplateLiveCount;
        @JSONField(name = "CommentCount")
        Long CommentCount;
        @JSONField(name = "LiveCount")
        Long LiveCount;
        @JSONField(name = "LivePromotionLiveCount")
        Long LivePromotionLiveCount;
        @JSONField(name = "LivePromotionPlatformCount")
        Long LivePromotionPlatformCount;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "LiveDuration")
        Long LiveDuration;
        @JSONField(name = "PV")
        Long PV;
        @JSONField(name = "ActivityName")
        String ActivityName;
        @JSONField(name = "PCU")
        Long PCU;
    }
}