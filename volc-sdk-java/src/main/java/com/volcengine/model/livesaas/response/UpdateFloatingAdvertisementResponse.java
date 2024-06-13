package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateFloatingAdvertisementResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateFloatingAdvertisementResponseBody result;

    @Data
    public static class UpdateFloatingAdvertisementResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
