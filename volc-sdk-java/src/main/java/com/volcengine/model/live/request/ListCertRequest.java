package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListCertRequest {

    @JSONField(name = "AccountID")
    String AccountID;
    @JSONField(name = "Available")
    Boolean Available;
    @JSONField(name = "Expiring")
    Boolean Expiring;
    @JSONField(name = "Domain")
    String Domain;
}
