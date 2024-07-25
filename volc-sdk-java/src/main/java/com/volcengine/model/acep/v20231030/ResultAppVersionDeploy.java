package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultAppVersionDeploy
 */
@lombok.Data
public final class ResultAppVersionDeploy  {

    /**
     * <p>应用安装包 MD5</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MD5")
    private String mD5;

    /**
     * <p>应用安装就绪的数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadyNum")
    private Long readyNum;

    /**
     * <p>应用已下发的数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeployNum")
    private Long deployNum;

    /**
     * <p>应用包名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>应用版本号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionCode")
    private Long versionCode;

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
