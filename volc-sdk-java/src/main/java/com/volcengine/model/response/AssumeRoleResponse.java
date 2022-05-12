package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AssumeRoleResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Credentials")
        Credentials credentials;
        @JSONField(name = "AssumedRoleUser")
        AssumedRoleUser assumedRoleUser;
    }

    @Data
    public static class Credentials {
        @JSONField(name = "CurrentTime")
        String currentTime;
        @JSONField(name = "ExpiredTime")
        String expiredTime;
        @JSONField(name = "AccessKeyId")
        String accessKeyId;
        @JSONField(name = "SecretAccessKey")
        String secretAccessKey;
        @JSONField(name = "SessionToken")
        String sessionToken;
    }

    @Data
    public static class AssumedRoleUser {
        @JSONField(name = "Trn")
        String trn;
        @JSONField(name = "AssumedRoleId")
        String assumedRoleId;
    }

}
