package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SecurityControlCommonConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;


@Data
public class GetSecurityControlConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetSecurityControlConfigResponseBody result;

    @Data
    public static class GetSecurityControlConfigResponseBody {
        @JSONField(name = "SecurityControlCommonConfig")
        SecurityControlCommonConfig SecurityControlCommonConfig;
    }
}
