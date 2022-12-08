package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateLoopVideoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateLoopVideoResponseBody result;

    @Data
    public static class UpdateLoopVideoResponseBody {
        @JSONField(name = "Id")
        Long Id;
    }
}