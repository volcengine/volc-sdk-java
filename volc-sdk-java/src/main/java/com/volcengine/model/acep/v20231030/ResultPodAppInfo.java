package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPodAppInfo
 */
@lombok.Data
public final class ResultPodAppInfo  {

    /**
     * <p>应用安装 apk 包体大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Long size;

    /**
     * <p>应用 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>应用生效范围：</p>
     *
     * <p>- `Public`：多业务间的共享应用；</p>
     *
     * <p>- `Private`：单一业务的非共享应用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppMode")
    private String appMode;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>应用图标 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IconUrl")
    private String iconUrl;

    /**
     * <p>应用启动首页 Activity。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Activity")
    private String activity;

    /**
     * <p>应用的横竖屏模式：</p>
     *
     *
     *
     * <p>- `0`：竖屏</p>
     *
     * <p>- `270`：横屏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rotation")
    private Integer rotation;

    /**
     * <p>应用安装方式：</p>
     *
     *
     *
     * <p>- `0`：通过平台上传安装</p>
     *
     * <p>- `1`：非平台上传安装</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppSource")
    private Integer appSource;

    /**
     * <p>应用版本 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionId")
    private String versionId;

    /**
     * <p>应用安装类型：</p>
     *
     *
     *
     * <p>- `0`：机身存储安装</p>
     *
     * <p>- `1`：共享安装</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstallType")
    private Integer installType;

    /**
     * <p>应用包名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>应用版本号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionCode")
    private Long versionCode;

    /**
     * <p>应用版本名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionName")
    private String versionName;

    /**
     * <p>APP 运行状态，取值如下：</p>
     *
     *
     *
     * <p>- `0`：未运行</p>
     *
     * <p>- `1`：前台运行</p>
     *
     * <p>- `2`：后台运行</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RunningState")
    private Integer runningState;

    /**
     * <p>应用安装状态，取值如下：</p>
     *
     *
     *
     * <p>- `513(0x201)`：正在安装</p>
     *
     * <p>- `516(0x204)`：正在下载</p>
     *
     * <p>- `528(0x210)`：安装完成</p>
     *
     * <p>- `1024(0x400)`：安装失败</p>
     *
     * <p>- `1280(0x500)`：卸载中</p>
     *
     * <p>- `1281(0x501)`：已卸载</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstallStatus")
    private Integer installStatus;

    /**
     * <p>APP 版本描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVersionDesc")
    private String appVersionDesc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
