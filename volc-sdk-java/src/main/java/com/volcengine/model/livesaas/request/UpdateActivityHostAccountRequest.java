package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateActivityHostAccountRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "HostAccountId")
    Long HostAccountId;
    @JSONField(name = "IsBusinessAccountEnable")
    Integer IsBusinessAccountEnable;
}
