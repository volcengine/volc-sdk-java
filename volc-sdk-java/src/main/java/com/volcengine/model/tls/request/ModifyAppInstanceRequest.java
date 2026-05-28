package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyAppInstanceRequest {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = APP_INSTANCE_TYPE)
    private String instanceType;
    @JSONField(name = APP_INSTANCE_NAME)
    private String instanceName;
    @JSONField(name = DESCRIPTION)
    private String description;

    public ModifyAppInstanceRequest(String instanceId, String instanceType,
                                    String instanceName, String description) {
        this.instanceId = instanceId;
        this.instanceType = instanceType;
        this.instanceName = instanceName;
        this.description = description;
    }

    public boolean CheckValidation() {
        return this.instanceId != null && !this.instanceId.isEmpty();
    }
}
