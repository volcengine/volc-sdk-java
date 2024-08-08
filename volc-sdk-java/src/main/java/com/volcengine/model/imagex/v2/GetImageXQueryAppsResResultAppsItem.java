package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageXQueryAppsResResultAppsItem
 */
@lombok.Data
public final class GetImageXQueryAppsResResultAppsItem  {

    /**
     * <p>应用 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>App 所属地区，取值如下所示：</p>
     *
     * <p>* `cn`：国内。</p>
     *
     * <p>* `sg`：新加坡。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppRegion")
    private String appRegion;

    /**
     * <p>App 绑定的安卓包名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>App 绑定的 iOS 包名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BundleId")
    private String bundleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
