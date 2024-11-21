package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetActivityCouponPickDataRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
}