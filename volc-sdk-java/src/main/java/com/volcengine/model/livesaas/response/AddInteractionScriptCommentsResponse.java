package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class AddInteractionScriptCommentsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddInteractionScriptCommentsResponseBody result;

    @Data
    public static class AddInteractionScriptCommentsResponseBody {
        @JSONField(name = "FailList")
        List<FailResult> FailList;
        @JSONField(name = "LatestCommentId")
        Integer LatestCommentId;
        @JSONField(name = "SuccessAmount")
        Integer SuccessAmount;
    }

    @Data
    public static class FailResult {
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "FailType")
        Integer FailType;        
    }
}
