package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetCouponRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "ThirdPartyId")
    String ThirdPartyId;
}