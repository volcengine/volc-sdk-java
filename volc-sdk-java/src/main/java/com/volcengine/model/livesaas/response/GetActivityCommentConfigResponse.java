package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CommentConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityCommentConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityCommentConfigResponseBody result;

    @Data
    public static class GetActivityCommentConfigResponseBody {
        @JSONField(name = "CommentConfig")
        CommentConfig CommentConfig;
    }
}