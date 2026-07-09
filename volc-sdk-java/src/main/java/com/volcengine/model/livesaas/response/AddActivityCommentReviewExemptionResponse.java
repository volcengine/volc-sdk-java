package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class AddActivityCommentReviewExemptionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddActivityCommentReviewExemptionResult result;

    @Data
    public static class AddActivityCommentReviewExemptionResult {
        @JSONField(name = "Status")
        Boolean Status;
        @JSONField(name = "First100WordList")
        List<String> First100WordList;
    }
}
