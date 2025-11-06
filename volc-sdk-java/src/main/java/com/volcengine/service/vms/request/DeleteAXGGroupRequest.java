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
public class DeleteAXGGroupRequest {
    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;
    @JSONField(name = "GroupId")
    private String groupId;
}
