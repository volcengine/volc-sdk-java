package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeCertDetailSecretResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeCertDetailResp result;

    @Data
    public static class DescribeCertDetailResp {
        @JSONField(name = "ChainID")
        String chainID;
        @JSONField(name = "Domain")
        String certDomain;
        @JSONField(name = "UseWay")
        String useWay;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "Rsa")
        OpenAPICertData rsa;
    }

    @Data
    public static class OpenAPICertData {
        @JSONField(name = "PubKey")
        String pubKey;
        @JSONField(name = "PriKey")
        String priKey;
        @JSONField(name = "CertType")
        String certType;
        @JSONField(name = "PubName")
        String pubName;
        @JSONField(name = "PriName")
        String priName;
        @JSONField(name = "NotBefore")
        String notBefore;
        @JSONField(name = "NotAfter")
        String notAfter;
        @JSONField(name = "FingerPrint")
        String fingerPrint;
        @JSONField(name = "SerialNumber")
        String serialNumber;
    }
}
