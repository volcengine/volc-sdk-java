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
public class UpdateAXGGroupRequest {
    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "SubId")
    private String subId;
    @JSONField(name = "UpdateType")
    private String updateType;
    @JSONField(name = "OverflowStrategy")
    private String overflowStrategy;
    @JSONField(name = "ExpireTime")
    private long expireTime;
    @JSONField(name = "GroupName")
    private String groupName;
    @JSONField(name = "Numbers")
    private List<String> numbers;
}
