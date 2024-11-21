package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteCouponsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteCouponsResponseBody result;

    @Data
    public static class DeleteCouponsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}