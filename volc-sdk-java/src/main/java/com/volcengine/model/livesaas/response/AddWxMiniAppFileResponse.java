package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddWxMiniAppFileResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddWxMiniAppFileResponseBody result;

    @Data
    public static class AddWxMiniAppFileResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}

