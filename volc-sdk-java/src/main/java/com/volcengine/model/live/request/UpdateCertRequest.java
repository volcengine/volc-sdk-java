package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CertRSAData;
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

}
