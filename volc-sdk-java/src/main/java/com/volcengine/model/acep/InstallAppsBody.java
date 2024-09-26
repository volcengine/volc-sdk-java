package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * InstallAppsBody
 */
@lombok.Data
public final class InstallAppsBody  {

    /**
     * <p>业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>指定实例 ID 进行应用安装。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>待安装的应用列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppList")
    private List<com.volcengine.model.acep.v20231030.RequestAppInfo> appList;

    /**
     * <p>应用安装类型：</p>
     *
     *
     *
     * <p>- `0`：（默认）机身存储独立安装（非共享）</p>
     *
     * <p>- `1`：共享安装</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstallType")
    private Integer installType;

    /**
     * <p>用于标记应用是否为预安装应用：</p>
     *
     * <p>- true：是；</p>
     *
     * <p>- false：否。</p>
     *
     *
     *
     * <p>当标记某应用为预安装应用后，重置实例时可选择是否保留该应用及相关数据。具体参看 [ResetPod](https://www.volcengine.com/docs/6394/1221459) 接口的 `PreInstallAppPersistedType` 字段说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsPreinstall")
    private Boolean isPreinstall;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
