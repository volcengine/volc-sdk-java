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
public class CreateAXGGroupRequest {
    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;
    @JSONField(name = "GroupName")
    private String groupName;
    @JSONField(name = "Numbers")
    private List<String> numbers;
    @JSONField(name = "ExpireTime")
    private long expireTime;
}
