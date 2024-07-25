package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultAppVersion
 */
@lombok.Data
public final class ResultAppVersion  {

    /**
     * <p>应用安装包 MD5。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MD5")
    private String mD5;

    /**
     * <p>应用全局唯一 ID，标识本业务的应用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>版本 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionId")
    private String versionId;

    /**
     * <p>应用安装包下载地址，有效期为 1 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    /**
     * <p>应用包名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当应用类型为安卓 apk 时，此字段为包名；其他类型根据需求自定义。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>应用版本号，仅作为标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionCode")
    private Long versionCode;

    /**
     * <p>应用版本名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionName")
    private String versionName;

    /**
     * <p>应用版本描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVersionDesc")
    private String appVersionDesc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
