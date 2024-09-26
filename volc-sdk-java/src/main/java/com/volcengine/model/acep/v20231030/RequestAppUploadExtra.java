package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * RequestAppUploadExtra
 */
@lombok.Data
public final class RequestAppUploadExtra  {

    /**
     * <p>文件 md5 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Md5")
    private String md5;

    /**
     * <p>应用包名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>应用版本号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionCode")
    private Integer versionCode;

    /**
     * <p>应用版本名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionName")
    private String versionName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
