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
public class RegisterIndustrialIdRequest {
    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;

    @JSONField(name = "OrderId")
    private String orderId;
}
