package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DomainConfig {
    @JSONField(name = "Domain")
    String Domain;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "CreateTime")
    Long CreateTime;
    @JSONField(name = "UpdateTime")
    Long UpdateTime;
}