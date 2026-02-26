package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateImageTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateTaskResponseBody result;

    @Data
    public static class CreateTaskResponseBody {
        @JSONField(name = "TaskId")
        Long taskId;
    }
}