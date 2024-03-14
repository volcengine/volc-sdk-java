package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteActivityCustomEmojiSetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteActivityCustomEmojiSetResponseBody result;

    @Data
    public static class DeleteActivityCustomEmojiSetResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}