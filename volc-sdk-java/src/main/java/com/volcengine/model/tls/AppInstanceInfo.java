package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class AppInstanceInfo {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = APP_INSTANCE_NAME)
    private String instanceName;
    @JSONField(name = APP_INSTANCE_TYPE)
    private String instanceType;
    @JSONField(name = DESCRIPTION)
    private String description;
    @JSONField(name = CREATE_TIME)
    private String createTime;
    @JSONField(name = UPDATE_TIME)
    private String updateTime;
}
