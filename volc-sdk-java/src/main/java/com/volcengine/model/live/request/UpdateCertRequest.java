package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateCertRequest {

    @JSONField(name = "useway")
    String useWay;
    @JSONField(name = "chainid")
    String chainID;
    @JSONField(name = "AccountID")
    String accountID;
    @JSONField(name = "CertName")
    String certName;
    @JSONField(name = "rsa")
    CertRSAData rsa;

    @Data
    private static class CertRSAData {
        @JSONField(name = "pubkey")
        String pubKey;
        @JSONField(name = "prikey")
        String priKey;
    }
}
