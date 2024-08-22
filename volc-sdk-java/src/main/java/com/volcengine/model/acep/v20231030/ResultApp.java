package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ResultApp
 */
@lombok.Data
public final class ResultApp  {

    /**
     * <p>应用全局唯一 ID，标识本业务的应用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>应用描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppDesc")
    private String appDesc;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>应用类型：</p>
     *
     * <p>- `0`：其他</p>
     *
     * <p>- `1`：视频</p>
     *
     * <p>- `2`：游戏</p>
     *
     * <p>- `3`：效率</p>
     *
     * <p>- `4`：办公</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppType")
    private Integer appType;

    /**
     * <p>应用图标地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IconUrl")
    private String iconUrl;

    /**
     * <p>应用部署数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyNum")
    private Long applyNum;

    /**
     * <p>应用安装就绪数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadyNum")
    private Long readyNum;

    /**
     * <p>应用横竖屏设置：</p>
     *
     * <p>- `0`：0 度</p>
     *
     * <p>- `90`：90 度</p>
     *
     * <p>- `180`：180 度</p>
     *
     * <p>- `270`：270 度</p>
     *
     * <p>- `-1`：跟随系统</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rotation")
    private Integer rotation;

    /**
     * <p>应用上下架状态：</p>
     *
     * <p>- 1：上架</p>
     *
     * <p>- 2：下架</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppStatus")
    private Integer appStatus;

    /**
     * <p>业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>应用包名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>应用版本列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionList")
    private List<ResultAppVersion> versionList;

    /**
     * <p>应用部署状态：</p>
     *
     * <p>- `1`：未上架</p>
     *
     * <p>- `2`：上架中</p>
     *
     * <p>- `3`：已上架</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeployStatus")
    private Integer deployStatus;

    /**
     * <p>应用最新的版本信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LatestVersion")
    private ResultAppVersion latestVersion;

    /**
     * <p>应用部署的版本数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeployVersionNum")
    private Long deployVersionNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
