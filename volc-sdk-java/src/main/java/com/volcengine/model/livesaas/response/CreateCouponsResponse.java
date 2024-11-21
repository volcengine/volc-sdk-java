package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class CreateCouponsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateCouponsResponseBody result;

    @Data
    public static class CreateCouponsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
        @JSONField(name = "Ids")
        List<Long> Ids;
    }
}