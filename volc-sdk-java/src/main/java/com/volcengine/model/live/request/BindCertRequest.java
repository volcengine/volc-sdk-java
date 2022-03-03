package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BindCertRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "CertDomain")
    String certDomain;
    @JSONField(name = "ChainID")
    String chainID;
    @JSONField(name = "HTTPS")
    Boolean HTTPS;
}
