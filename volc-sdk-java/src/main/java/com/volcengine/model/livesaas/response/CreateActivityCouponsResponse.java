package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class CreateActivityCouponsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateActivityCouponsResponseBody result;

    @Data
    public static class CreateActivityCouponsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
        @JSONField(name = "Ids")
        List<Long> Ids;
    }
}