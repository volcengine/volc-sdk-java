package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * UpdateAppBody
 */
@lombok.Data
public final class UpdateAppBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>应用 ID，可通过调用 `ListApp` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>应用横竖屏设置：</p>
     *
     *
     *
     * <p>- 0：竖屏</p>
     *
     * <p>	</p>
     *
     * <p>- 270：横屏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rotation")
    private Integer rotation;

    /**
     * <p>应用图标地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IconUrl")
    private String iconUrl;

    /**
     * <p>应用描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppDesc")
    private String appDesc;

    /**
     * <p>修改应用生效范围。调用 [UploadApp](https://www.volcengine.com/docs/6394/1262199) 时设置的应用可安装范围可通过该参数进行修改。</p>
     *
     * <p>当前仅支持将 Private 应用修改为 Public 应用，即将非共享应用修改为账号下多业务可共享的应用。若无需修改，则该参数可置空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppMode")
    private String appMode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
