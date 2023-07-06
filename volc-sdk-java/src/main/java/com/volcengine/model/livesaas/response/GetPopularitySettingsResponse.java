package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


@Data
public class GetPopularitySettingsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetPopularitySettingsResponseBody result;

    @Data
    public static class GetPopularitySettingsResponseBody {
        @JSONField(name = "VirtualPopularity")
        Long VirtualPopularity;
        @JSONField(name = "IsVirtualPopularityEnable")
        Integer IsVirtualPopularityEnable;
        @JSONField(name = "VirtualPeopleIncreaseMin")
        Long VirtualPeopleIncreaseMin;
        @JSONField(name = "VirtualPeopleIncreaseMax")
        Long VirtualPeopleIncreaseMax;
        @JSONField(name = "VirtualPeopleReduceMin")
        Long VirtualPeopleReduceMin;
        @JSONField(name = "VirtualPeopleReduceMax")
        Long VirtualPeopleReduceMax;
    }
}