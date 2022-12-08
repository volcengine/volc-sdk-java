package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AnalysisUserBehaviorPeopleResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AnalysisUserBehaviorPeopleBody result;

    @Data
    public static class AnalysisUserBehaviorPeopleBody {
        @JSONField(name = "AnalysisPeople")
        Long AnalysisPeople;
        @JSONField(name = "TotalPeople")
        Long TotalPeople;
        @JSONField(name = "TotalTime")
        Long TotalTime;
    }
}