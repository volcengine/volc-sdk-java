package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteActivityPartnerRebroadcastResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteActivityPartnerRebroadcastResponseBody result;

    @Data
    public static class DeleteActivityPartnerRebroadcastResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}