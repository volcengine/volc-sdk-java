package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListAccountActivityHistoryDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAccountActivityHistoryDataResponseBody result;

    @Data
    public static class ListAccountActivityHistoryDataResponseBody {
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
        @JSONField(name = "LivePromotionLiveDuration")
        Long LivePromotionLiveDuration;
        @JSONField(name = "AppTemplateLiveCount")
        Long AppTemplateLiveCount;
        @JSONField(name = "ActivityName")
        String ActivityName;
        @JSONField(name = "LiveDuration")
        Long LiveDuration;
        @JSONField(name = "PCU")
        Long PCU;
        @JSONField(name = "LivePromotionPlatformCount")
        Long LivePromotionPlatformCount;
        @JSONField(name = "AppTemplateLiveDuration")
        Long AppTemplateLiveDuration;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "PV")
        Long PV;
        @JSONField(name = "WatchDurationPerPeople")
        Long WatchDurationPerPeople;
        @JSONField(name = "LivePromotionLiveCount")
        Long LivePromotionLiveCount;
        @JSONField(name = "CommentCount")
        Long CommentCount;
        @JSONField(name = "LiveCount")
        Long LiveCount;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "UV")
        Long UV;
    }
}