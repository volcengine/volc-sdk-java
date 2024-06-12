package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateProgramResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateProgramResponseResponseBody result;

    @Data
    public static class UpdateProgramResponseResponseBody {
        @JSONField(name = "Id")
        Long Id;
    }
}
