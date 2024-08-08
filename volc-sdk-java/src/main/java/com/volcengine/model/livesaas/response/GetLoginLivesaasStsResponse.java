package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetLoginLivesaasStsResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetLoginLivesaasStsResponseBody result;

    @Data
    public static class GetLoginLivesaasStsResponseBody {
        @JSONField(name = "StsMsg")
        StsMsg StsMsg;
        @JSONField(name = "LoginLivesaasToken")
        String LoginLivesaasToken;
    }

    @Data
    public static class StsMsg {
        @JSONField(name = "AccessKeyId")
        String AccessKeyId;
        @JSONField(name = "SecretAccessKey")
        String SecretAccessKey;
        @JSONField(name = "SessionToken")
        String SessionToken;
        @JSONField(name = "ExpiredTime")
        String ExpiredTime;
    }
}
