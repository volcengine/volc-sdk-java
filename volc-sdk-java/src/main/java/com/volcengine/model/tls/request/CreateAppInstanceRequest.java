package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateAppInstanceRequest {
    @JSONField(name = APP_INSTANCE_TYPE)
    private String instanceType;
    @JSONField(name = APP_INSTANCE_NAME)
    private String instanceName;
    @JSONField(name = DESCRIPTION)
    private String description;

    public CreateAppInstanceRequest(String instanceType, String instanceName, String description) {
        this.instanceType = instanceType;
        this.instanceName = instanceName;
        this.description = description;
    }

    public boolean CheckValidation() {
        if (instanceType == null || instanceType.isEmpty()) {
            return false;
        }
        if (instanceName == null || instanceName.isEmpty()) {
            return false;
        }
        return true;
    }
}
