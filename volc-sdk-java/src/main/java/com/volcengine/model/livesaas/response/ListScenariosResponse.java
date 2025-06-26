package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListScenariosResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListScenariosResponseBody result;

    @Data
    public static class ListScenariosResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "Scenarios")
        List<Scenario> Scenarios;
    }

    @Data
    public static class Scenario {
        @JSONField(name = "ScenarioId")
        Long ScenarioId;
        @JSONField(name = "ScenarioName")
        String ScenarioName;
        @JSONField(name = "ScenarioType")
        Integer ScenarioType;
        @JSONField(name = "ScenarioDesc")
        String ScenarioDesc;
        @JSONField(name = "CreatedTime")
        Long CreatedTime;
        @JSONField(name = "UpdatedTime")
        Long UpdatedTime;
        @JSONField(name = "RuleCount")
        Long RuleCount;
        @JSONField(name = "TaskCount")
        Long TaskCount;
    }
}