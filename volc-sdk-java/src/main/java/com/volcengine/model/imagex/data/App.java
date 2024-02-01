package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class App {
    @JSONField(name = "AppId")
    private String appId;
    @JSONField(name = "AppName")
    private String appName;
    @JSONField(name = "AppRegion")
    private String appRegion;
    @JSONField(name = "PackageName")
    private String packageName;
    @JSONField(name = "BundleId")
    private String bundleId;
}
