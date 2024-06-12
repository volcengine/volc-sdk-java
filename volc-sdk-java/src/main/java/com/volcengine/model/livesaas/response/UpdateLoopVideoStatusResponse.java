package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class UpdateLoopVideoStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateLoopVideoStatusResponseBody result;

    @Data
    public static class UpdateLoopVideoStatusResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
        @JSONField(name = "FailLineIds")
        List<Integer> FailLineIds;
    }
}
