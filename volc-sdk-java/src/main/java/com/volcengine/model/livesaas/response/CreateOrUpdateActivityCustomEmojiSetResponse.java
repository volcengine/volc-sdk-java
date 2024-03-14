package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateOrUpdateActivityCustomEmojiSetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateOrUpdateActivityCustomEmojiSetResponseBody result;

    @Data
    public static class CreateOrUpdateActivityCustomEmojiSetResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}