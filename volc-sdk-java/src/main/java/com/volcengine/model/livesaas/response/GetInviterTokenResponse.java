package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetInviterTokenResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetInviterTokenResponse.GetInviterTokenBody result;

    @Data
    public static class GetInviterTokenBody {
        @JSONField(name = "InviterToken")
        String InviterToken;
    }
}
