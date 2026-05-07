package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateQuickCommentContentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateQuickCommentContentResponseBody result;

    @Data
    public static class UpdateQuickCommentContentResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
