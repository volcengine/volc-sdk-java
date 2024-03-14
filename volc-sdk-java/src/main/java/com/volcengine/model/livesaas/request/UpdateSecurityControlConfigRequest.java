package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SecurityControlCommonConfig;
import lombok.Data;

@Data
public class UpdateSecurityControlConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "SecurityControlCommonConfig")
    SecurityControlCommonConfig SecurityControlCommonConfig;
}
