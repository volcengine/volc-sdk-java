package com.volcengine.model.live;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CertRSAData {
    @JSONField(name = "pubkey")
    String pubKey;
    @JSONField(name = "prikey")
    String priKey;
}
