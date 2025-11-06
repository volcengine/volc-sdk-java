package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BindAXGRequest {
    @JSONField(name = "PhoneNoA")
    private String phoneNoA;
    @JSONField(name = "PhoneNoB")
    private String phoneNoB;
    @JSONField(name = "PhoneNoX")
    private String phoneNoX;
    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;
    @JSONField(name = "ExpireTime")
    private long expireTime;
    @JSONField(name = "AudioRecordFlag")
    private int audioRecordFlag;
    @JSONField(name = "UserData")
    private String userData;
    @JSONField(name = "OutId")
    private String outId;
    @JSONField(name = "OrderId")
    private String orderId;
    @JSONField(name = "IndustrialId")
    private String industrialId;
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "GroupName")
    private String groupName;
    @JSONField(name = "GroupNumbers")
    private List<String> groupNumbers;
    @JSONField(name = "IdempotentId")
    private String idempotentId;
    @JSONField(name = "CityCode")
    private String cityCode;
    @JSONField(name = "CityCodeByPhoneNo")
    private String cityCodeByPhoneNo;
    @JSONField(name = "DegradeCityList")
    private List<String> degradeCityList;
    @JSONField(name = "RandomFlag")
    private Integer randomFlag;
}
