package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListStatisticsQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListStatisticsQuestionnaireResponseBody result;

    @Data
    public static class ListStatisticsQuestionnaireResponseBody {
        @JSONField(name = "TotalItemCount")
        Long TotalItemCount;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "StatisticsQuestionnaires")
        List<StatisticsQuestionnaire> StatisticsQuestionnaires;
    }

    @Data
    public static class StatisticsQuestionnaire {
        @JSONField(name = "QuestionnaireId")
        Long QuestionnaireId;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "PublishTime")
        Long PublishTime;
        @JSONField(name = "UserCount")
        Integer UserCount;
    }
}