package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetVQUserDataAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetVQUserDataAPIResponseBody result;

    @Data
    public static class GetVQUserDataAPIResponseBody {
        @JSONField(name = "Status")
        Integer Status;
    }
}