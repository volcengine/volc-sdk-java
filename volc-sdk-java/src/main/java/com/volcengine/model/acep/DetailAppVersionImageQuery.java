package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailAppVersionImageQuery
 */
@lombok.Data
public final class DetailAppVersionImageQuery  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>应用ID，可选。如填写，则会严格校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>版本ID，可选。如填写，则会严格校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVersionId")
    private String appVersionId;

    /**
     * <p>应用镜像ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVersionImageId")
    private String appVersionImageId;

    /**
     * <p>下载链接有效期，单位为小时。默认24小时，最长7*24小时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Expire")
    private Integer expire;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
