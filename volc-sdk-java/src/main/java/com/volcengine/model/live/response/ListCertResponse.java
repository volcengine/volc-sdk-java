package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ListCertResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListCertResp Result;

    @Data
    public static class ListCertResp {
        @JSONField(name = "CertList")
        SimpleCertInfo[] certList;
    }

    @Data
    public static class SimpleCertInfo {
        @JSONField(name = "CertDomain")
        String CertDomain;
        @JSONField(name = "ChainID")
        String ChainID;
        @JSONField(name = "NotBefore")
        String NotBefore;
        @JSONField(name = "NotAfter")
        String NotAfter;
        @JSONField(name = "Status")
        String Status;
        @JSONField(name = "statuscode")
        Integer StatusCode;
        @JSONField(name = "CertName")
        String certName;
    }
}
