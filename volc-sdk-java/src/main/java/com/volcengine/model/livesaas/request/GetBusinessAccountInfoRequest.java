package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetBusinessAccountInfoRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
}
