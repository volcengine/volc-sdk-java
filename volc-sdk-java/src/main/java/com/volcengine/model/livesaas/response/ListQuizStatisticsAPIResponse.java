package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListQuizStatisticsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListQuizStatisticsAPIResponseBody result;

    @Data
    public static class ListQuizStatisticsAPIResponseBody {
        @JSONField(name = "PageTotalcount")
        Integer PageTotalcount;
        @JSONField(name = "QuizStatisticsList")
        List<QuizStatisticsAPI> QuizStatisticsList;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
    }

    @Data
    public static class QuizStatisticsAPI {
        @JSONField(name = "QuizTitleType")
        Integer QuizTitleType;
        @JSONField(name = "SendTime")
        Long SendTime;
        @JSONField(name = "Deadline")
        Long Deadline;
        @JSONField(name = "RightCount")
        Long RightCount;
        @JSONField(name = "QuizID")
        Long QuizID;
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "QuizTitle")
        String QuizTitle;
        @JSONField(name = "QuizType")
        Long QuizType;
    }
}