package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SendActivityCouponRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}