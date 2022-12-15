package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListSAMLProvidersResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "SAMLProviders")
        List<SAMLProvider> SAMLProviders;

        @JSONField(name = "Limit")
        int limit;

        @JSONField(name = "Offset")
        int offset;

        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class SAMLProvider{

        @JSONField(name = "Trn")
        String trn;

        @JSONField(name = "SAMLProviderName")
        String SAMLProviderName;

        @JSONField(name = "SSOType")
        Integer SSOType;

        @JSONField(name = "Status")
        int status;

        @JSONField(name = "Description")
        String description;

        @JSONField(name = "CreateDate")
        String createDate;

        @JSONField(name = "UpdateDate")
        String updateDate;
    }
}
