package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddActivityPartnerRebroadcastResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddActivityPartnerRebroadcastResponseBody result;

    @Data
    public static class AddActivityPartnerRebroadcastResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}