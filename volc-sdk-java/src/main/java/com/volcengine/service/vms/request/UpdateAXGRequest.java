package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAXGRequest {
    @JSONField(name = "UpdateType")
    private String updateType;
    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;
    @JSONField(name = "SubId")
    private String subId;
    @JSONField(name = "PhoneNoA")
    private String phoneNoA;
    @JSONField(name = "PhoneNoB")
    private String phoneNoB;
    @JSONField(name = "PhoneNoX")
    private String phoneNoX;
    @JSONField(name = "ExpireTime")
    private long expireTime;
    @JSONField(name = "UserData")
    private String userData;
    @JSONField(name = "OutId")
    private String outId;
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "IdempotentId")
    private String idempotentId;
    @JSONField(name = "OrderId")
    private String orderId;
    @JSONField(name = "IndustrialId")
    private String industrialId;
}
