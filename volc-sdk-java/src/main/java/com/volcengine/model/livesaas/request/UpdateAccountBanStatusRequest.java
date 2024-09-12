package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateAccountBanStatusRequest {
    @JSONField(name = "BanStatus")
    Integer BanStatus;
    @JSONField(name = "UserIds")
    List<Long> UserIds;
}
