package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateSubAccountResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateSubAccountResponseBody result;

    @Data
    public static class CreateSubAccountResponseBody {
        @JSONField(name = "Status")
        Boolean Status;

        @JSONField(name = "VolcLiveLarkUserUnionId")
        String VolcLiveLarkUserUnionId;
    }
}