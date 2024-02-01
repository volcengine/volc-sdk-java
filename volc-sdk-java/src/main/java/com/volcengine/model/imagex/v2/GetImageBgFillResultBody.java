package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageBgFillResultBody
 */
@lombok.Data
public final class GetImageBgFillResultBody  {

    /**
     * <p>服务`ID`。</p>
     *
     * <p>* 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>* 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>待填充原图的存储 URI 和 URL（公网可访问的 URL）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>填充模型，取值如下所示：</p>
     *
     * <p>* 0：国漫风格模型；</p>
     *
     * <p>* 1：通用模型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Model")
    private Integer model;

    /**
     * <p>向上填充比例，取值范围为 [0, 0.4]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Top")
    private Double top;

    /**
     * <p>向下填充比例，取值范围为 [0, 0.4]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bottom")
    private Double bottom;

    /**
     * <p>向左填充比例，取值范围为 [0, 0.4]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Left")
    private Double left;

    /**
     * <p>向右填充比例，取值范围为 [0, 0.4]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Right")
    private Double right;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
