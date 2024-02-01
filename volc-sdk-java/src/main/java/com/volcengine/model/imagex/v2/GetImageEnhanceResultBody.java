package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageEnhanceResultBody
 */
@lombok.Data
public final class GetImageEnhanceResultBody  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>* 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>* 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>待增强的原图地址的存储 URI 和 URL（公网可访问的 URL）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>增强模型，取值如下所示：</p>
     *
     * <p>* `0`：通用模型</p>
     *
     * <p>* `1`：低质专清模型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Model")
    private Integer model;

    /**
     * <p>是否不去压缩失真。`Model`取值为`0`时选填，支持以下取值：</p>
     *
     * <p>* `true`：不进行去压缩失真处理 </p>
     *
     * <p>* `false`：（默认）进行去压缩失真处理</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisableAr")
    private Boolean disableAr;

    /**
     * <p>是否不自适应锐化。`Model`取值为`0`时选填，支持以下取值：</p>
     *
     * <p>* `true`：不进行锐化处理 </p>
     *
     * <p>* `false`：（默认）进行锐化处理</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisableSharp")
    private Boolean disableSharp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
