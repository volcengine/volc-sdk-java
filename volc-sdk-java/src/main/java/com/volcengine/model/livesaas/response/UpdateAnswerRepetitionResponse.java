package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateAnswerRepetitionResponse {
    @JSONField(name="ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name="Result")
    UpdateAnswerRepetitionResponseBody result;

    @Data
    public static class UpdateAnswerRepetitionResponseBody {
        @JSONField(name="Status")
        Integer Status;
    }
}
