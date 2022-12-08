package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetBusinessAccountInfoAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetBusinessAccountInfoAPIResponseBody result;

    @Data
    public static class GetBusinessAccountInfoAPIResponseBody {
        @JSONField(name = "BusinessAccountInfo")
        BusinessAccountInfo BusinessAccountInfo;
        @JSONField(name = "IsBusinessAccountEnable")
        Integer IsBusinessAccountEnable;
    }

    @Data
    public static class BusinessAccountInfo {
        @JSONField(name = "AccountName")
        String AccountName;
        @JSONField(name = "AccountHeadImage")
        String AccountHeadImage;
        @JSONField(name = "AccountHeadRedirectUrl")
        String AccountHeadRedirectUrl;
        @JSONField(name = "HostAccountId")
        Long HostAccountId;
        @JSONField(name = "IsFollowEnable")
        Integer IsFollowEnable;
    }
}