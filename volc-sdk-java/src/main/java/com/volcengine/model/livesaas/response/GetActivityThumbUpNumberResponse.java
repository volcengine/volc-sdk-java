package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityThumbUpNumberResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetActivityThumbUpNumberResponseBody result;

    @Data
    public static class GetActivityThumbUpNumberResponseBody {
        @JSONField(name = "ActualThumbUpNumber")
        Long ActualThumbUpNumber;
    }
}