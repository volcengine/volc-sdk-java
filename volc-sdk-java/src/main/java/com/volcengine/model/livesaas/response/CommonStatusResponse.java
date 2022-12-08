package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


import java.util.List;
import java.util.Map;

@Data
public class CommonStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CommonStatusResponseBody result;

    @Data
    public static class CommonStatusResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}