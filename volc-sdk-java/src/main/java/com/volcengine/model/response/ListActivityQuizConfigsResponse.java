package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QuizOption;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityQuizConfigsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityQuizConfigsResponseBody result;

    @Data
    public static class ListActivityQuizConfigsResponseBody {
        @JSONField(name = "QuizConfigs")
        List<QuizConfig> QuizConfigs;
    }

    @Data
    public static class QuizConfig {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "QuizTitle")
        String QuizTitle;
        @JSONField(name = "QuizResultType")
        Integer QuizResultType;
        @JSONField(name = "QuizOptions")
        List<QuizOption> QuizOptions;
        @JSONField(name = "RightOptions")
        List<String> RightOptions;
        @JSONField(name = "Deadline")
        Long Deadline;
        @JSONField(name = "SendTime")
        Long SendTime;
        @JSONField(name = "QuizStatus")
        Integer QuizStatus;
        @JSONField(name = "QuizTitleType")
        Integer QuizTitleType;
        @JSONField(name = "QuizAnalysis")
        String QuizAnalysis;
    }

}
