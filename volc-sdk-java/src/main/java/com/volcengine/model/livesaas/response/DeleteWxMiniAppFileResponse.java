package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteWxMiniAppFileResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteWxMiniAppFileResponseBody result;

    @Data
    public static class DeleteWxMiniAppFileResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}

