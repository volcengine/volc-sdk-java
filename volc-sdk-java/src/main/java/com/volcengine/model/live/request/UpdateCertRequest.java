package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateCertRequest {

    @JSONField(name = "useway")
    String UseWay;
    @JSONField(name = "chainid")
    String ChainID;
    @JSONField(name = "AccountID")
    String AccountID;
    @JSONField(name = "CertName")
    String CertName;
    @JSONField(name = "rsa")
    CertRSAData Rsa;

    @Data
    private static class CertRSAData {
        @JSONField(name = "pubkey")
        String pubKey;
        @JSONField(name = "prikey")
        String priKey;
    }
}
