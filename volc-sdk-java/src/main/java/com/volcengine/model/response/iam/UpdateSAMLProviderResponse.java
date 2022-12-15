package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateSAMLProviderResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "Trn")
        String trn;

        @JSONField(name = "SAMLProviderName")
        String SAMLProviderName;

        @JSONField(name = "SSOType")
        Integer SSOType;

        @JSONField(name = "Status")
        Integer status;

        @JSONField(name = "Description")
        String description;

        @JSONField(name = "CreateDate")
        String createDate;

        @JSONField(name = "UpdateDate")
        String updateDate;
    }
}
