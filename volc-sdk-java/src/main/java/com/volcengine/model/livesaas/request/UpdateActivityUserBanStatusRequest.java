package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityUserBanStatusRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "BanStatus")
    Integer BanStatus;
    @JSONField(name = "BanType")
    Integer BanType;
    @JSONField(name = "UserIds")
    List<Long> UserIds;
    @JSONField(name = "Cookies")
    List<String> Cookies;
    @JSONField(name = "ExternalUserIds")
    List<String> ExternalUserIds;
}
