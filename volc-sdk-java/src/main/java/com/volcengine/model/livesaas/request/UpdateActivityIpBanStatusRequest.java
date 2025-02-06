package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityIpBanStatusRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "BanStatus")
    Integer BanStatus;
    @JSONField(name = "Ips")
    List<String> Ips;
}
