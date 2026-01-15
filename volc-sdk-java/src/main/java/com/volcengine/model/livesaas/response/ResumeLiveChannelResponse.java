package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ResumeLiveChannelResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ResumeLiveChannelResponseBody result;

    @Data
    public static class ResumeLiveChannelResponseBody {
        @JSONField(name = "Status")
        Integer Status;
    }
}
