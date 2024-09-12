package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateLLMTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateLLMTaskResponseBody result;

    @Data
    public static class CreateLLMTaskResponseBody {
        @JSONField(name = "Code")
        Integer Code;
        @JSONField(name = "Message")
        String Message;
        @JSONField(name = "TaskId")
        String TaskId;
    }
}
