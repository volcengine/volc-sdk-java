package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetQuizDataAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetQuizDataAPIResponseBody result;

    @Data
    public static class GetQuizDataAPIResponseBody {
        @JSONField(name = "RightCount")
        Long RightCount;
        @JSONField(name = "QuizOptions")
        List<QuizOptionAPI> QuizOptions;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class QuizOptionAPI {
        @JSONField(name = "OptionName")
        String OptionName;
        @JSONField(name = "OptionCount")
        Long OptionCount;
        @JSONField(name = "OptionPercent")
        String OptionPercent;
        @JSONField(name = "OptionSite")
        String OptionSite;
    }
}