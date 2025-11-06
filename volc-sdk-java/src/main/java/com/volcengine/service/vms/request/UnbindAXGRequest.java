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
public class UnbindAXGRequest {
    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;
    @JSONField(name = "SubId")
    private String subId;
    @JSONField(name = "DelGroup")
    private Boolean delGroup;
}
