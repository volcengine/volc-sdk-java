package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ModifyActivityCustomEmojiSetsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ModifyActivityCustomEmojiSetsResponseBody result;

    @Data
    public static class ModifyActivityCustomEmojiSetsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}