package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetAccountAggregatedStatisticsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAccountAggregatedStatisticsResponseBody result;

    @Data
    public static class GetAccountAggregatedStatisticsResponseBody {
        @JSONField(name = "LiveCount")
        Integer LiveCount;
        @JSONField(name = "WatchTime")
        Integer WatchTime;
        @JSONField(name = "WatchPeople")
        Integer WatchPeople;
        @JSONField(name = "WatchLivePerPeople")
        Double WatchLivePerPeople;
        @JSONField(name = "WatchTimePerPeople")
        Double WatchTimePerPeople;
        @JSONField(name = "WatchCountPerPeople")
        Double WatchCountPerPeople;
    }
}