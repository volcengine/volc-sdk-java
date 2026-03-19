package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateCheckInConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateCheckInConfigResponseBody result;

    @Data
    public static class UpdateCheckInConfigResponseBody {
        @JSONField(name = "CheckInId")
        String CheckInId;
    }
}
