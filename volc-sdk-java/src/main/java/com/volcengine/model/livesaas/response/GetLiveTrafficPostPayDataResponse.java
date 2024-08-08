package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetLiveTrafficPostPayDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetLiveTrafficPostPayDataResponseBody result;

    @Data
    public static class GetLiveTrafficPostPayDataResponseBody {
        @JSONField(name = "EstimatedResult")
        List<LiveTrafficData> EstimatedResult;
        @JSONField(name = "ActualResult")
        List<LiveTrafficData> ActualResult;
        @JSONField(name = "ActualPrePayResult")
        List<LiveTrafficData> ActualPrePayResult;
    }

    @Data
    public static class LiveTrafficData {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "ActivityCreator")
        ActivityCreatorForm ActivityCreator;
        @JSONField(name = "LiveUV")
        Long LiveUV;
        @JSONField(name = "LiveTraffic")
        Double LiveTraffic;
    }
}