package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class EnableActivityMultiProductExplainResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    EnableActivityMultiProductExplainResponseBody result;

    @Data
    public static class EnableActivityMultiProductExplainResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
