package com.volcengine.model.ipaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DetailInstanceRequest {
    @JSONField(name = "instance_id")
    String InstanceID;

    @JSONField(name = "sn")
    String SN;
}
