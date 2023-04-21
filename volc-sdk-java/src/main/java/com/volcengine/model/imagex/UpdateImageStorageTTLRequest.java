package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateImageStorageTTLRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "TTL")
    Integer ttl;
}
