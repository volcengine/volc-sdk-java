package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityCommentConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityCommentConfigResponseBody result;

    @Data
    public static class UpdateActivityCommentConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}