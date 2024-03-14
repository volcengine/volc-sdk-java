package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityCustomEmojiSetStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityCustomEmojiSetStatusResponseBody result;

    @Data
    public static class UpdateActivityCustomEmojiSetStatusResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}