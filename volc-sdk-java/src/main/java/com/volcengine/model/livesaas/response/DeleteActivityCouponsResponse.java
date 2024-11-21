package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteActivityCouponsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteActivityCouponsResponseBody result;

    @Data
    public static class DeleteActivityCouponsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}