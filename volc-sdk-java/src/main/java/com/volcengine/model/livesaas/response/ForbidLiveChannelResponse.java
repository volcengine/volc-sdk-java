package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ForbidLiveChannelResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ForbidLiveChannelResponseBody result;

    @Data
    public static class ForbidLiveChannelResponseBody {
        @JSONField(name = "Status")
        Integer Status;
    }
}
