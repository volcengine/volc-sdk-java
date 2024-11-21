package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateActivityCouponRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "CouponId")
    Long CouponId;
    @JSONField(name = "AllowCloseIcon")
    Boolean AllowCloseIcon;
    @JSONField(name = "Count")
    Long Count;
    @JSONField(name = "Rule")
    Integer Rule;
    @JSONField(name = "Duration")
    Integer Duration;
    @JSONField(name = "CutOffTime")
    Long CutOffTime;
}