package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetApplyResult {
    @JSONField(name = "status")
    private int status;
    @JSONField(name = "reason")
    private String reason;
    @JSONField(name = "carrier")
    private String carrier;
}
