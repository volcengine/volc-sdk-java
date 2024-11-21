package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSuperResolutionResultBody
 */
@lombok.Data
public final class GetImageSuperResolutionResultBody  {

    /**
     * <p>用于存储结果图和计量计费的服务 ID。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>待处理原图的存储 URI 或访问 URL（可公网访问）。您可在控制台资源管理获取图片的[存储 URI](https://www.volcengine.com/docs/508/1205057) 以及[访问 URL](https://www.volcengine.com/docs/508/1205054)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>超分倍率，默认值为`2`，支持取值为：`2`、`3`、`4`、`5`、`6`、`7`、`8`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Multiple")
    private Double multiple;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
