package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.APP_INSTANCE_ID;

@Data
@NoArgsConstructor
public class DeleteAppInstanceRequest {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;

    public DeleteAppInstanceRequest(String instanceId) {
        this.instanceId = instanceId;
    }

    public boolean CheckValidation() {
        return this.instanceId != null && !this.instanceId.isEmpty();
    }
}
