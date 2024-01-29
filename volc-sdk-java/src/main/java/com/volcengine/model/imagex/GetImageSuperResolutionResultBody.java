package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSuperResolutionResultBody
 */
@lombok.Data
public final class GetImageSuperResolutionResultBody  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>* 您可以在veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>* 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>待处理原图的存储 URI 和 URL（公网可访问的 URL）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>超分倍率，默认为`2`，取值范围为 [2-8]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Multiple")
    private Double multiple;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
