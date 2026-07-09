package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DelActivityCommentReviewExemptionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DelActivityCommentReviewExemptionResult result;

    @Data
    public static class DelActivityCommentReviewExemptionResult {
        @JSONField(name = "Status")
        Boolean Status;
        @JSONField(name = "First100WordList")
        List<String> First100WordList;
    }
}
