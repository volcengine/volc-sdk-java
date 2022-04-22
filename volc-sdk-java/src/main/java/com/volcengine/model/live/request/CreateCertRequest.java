package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CertRSAData;
import lombok.Data;

@Data
public class CreateCertRequest {

    @JSONField(name = "useway")
    String useWay;
    @JSONField(name = "AccountID")
    String AccountID;
    @JSONField(name = "CertName")
    String CertName;
    @JSONField(name = "rsa")
    CertRSAData rsa;

}
