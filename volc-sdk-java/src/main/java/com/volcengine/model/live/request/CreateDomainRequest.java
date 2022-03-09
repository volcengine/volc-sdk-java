package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateDomainRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "Type")
    String type;
    @JSONField(name = "Region")
    String region;
    @JSONField(name = "AutoNext")
    Boolean autoNext;
}
