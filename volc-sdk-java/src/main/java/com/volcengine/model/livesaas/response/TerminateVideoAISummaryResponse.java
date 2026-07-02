package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class TerminateVideoAISummaryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    TerminateVideoAISummaryResponseBody result;

    @Data
    public static class TerminateVideoAISummaryResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
