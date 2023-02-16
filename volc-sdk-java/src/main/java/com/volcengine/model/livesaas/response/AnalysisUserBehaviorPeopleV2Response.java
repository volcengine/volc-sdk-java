package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


@Data
public class AnalysisUserBehaviorPeopleV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AnalysisUserBehaviorPeopleV2Body result;

    @Data
    public static class AnalysisUserBehaviorPeopleV2Body {
        @JSONField(name = "TotalTime")
        Long TotalTime;
        @JSONField(name = "AnalysisPeople")
        Long AnalysisPeople;
        @JSONField(name = "TotalPeople")
        Long TotalPeople;
    }
}