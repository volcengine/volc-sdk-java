package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListActivityCouponsRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "IsSent")
    Boolean IsSent;
    @JSONField(name = "IsDeleted")
    Boolean IsDeleted;
}