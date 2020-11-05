package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ModifyVideoInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ModifyVideoInfoResult result;

    @Data
    public static class ModifyVideoInfoResult {
        @JSONField(name = "BaseResp")
        BaseResp baseResp;
    }

    @Data
    public static class BaseResp {
        @JSONField(name = "StatusMessage")
        String statusMessage;
        @JSONField(name = "StatusCode")
        Integer statusCode;
    }
}
