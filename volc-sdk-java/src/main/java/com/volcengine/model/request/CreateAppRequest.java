package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
@Data
public class CreateAppRequest {
    @JSONField(name = "AppName")
    String appName;
    @JSONField(name = "AppNameZh")
    String appNameZh;
    @JSONField(name = "AppType")
    String appType;
    @JSONField(name = "Description")
    String description;
}
