package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateAccessKeyResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "AccessKey")
        AccessKey accessKey;
    }

    @Data
    public static class AccessKey {
        @JSONField(name = "AccessKeyId")
        String accessKeyId;
        @JSONField(name = "SecretAccessKey")
        String secretAccessKey;
        @JSONField(name = "AccountId")
        Long accountID;
        @JSONField(name = "UserName")
        String userName;
        @JSONField(name = "CreateDate")
        String createDate;
        @JSONField(name = "UpdateDate")
        String updateDate;
        @JSONField(name = "Status")
        String status;
    }
}
