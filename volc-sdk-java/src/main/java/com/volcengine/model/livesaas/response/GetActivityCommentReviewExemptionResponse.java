package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityCommentReviewExemptionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityCommentReviewExemptionResult result;

    @Data
    public static class GetActivityCommentReviewExemptionResult {
        @JSONField(name = "WordList")
        List<String> WordList;
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
    }
}
