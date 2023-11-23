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
        @JSONField(name = "ActivityName")
        String ActivityName;
        @JSONField(name = "PV")
        Long PV;
        @JSONField(name = "PCU")
        Long PCU;
        @JSONField(name = "UV")
        Long UV;
        @JSONField(name = "CommentCount")
        Long CommentCount;
        @JSONField(name = "WatchDurationPerPeople")
        Long WatchDurationPerPeople;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "LiveDuration")
        Long LiveDuration;
    }
}