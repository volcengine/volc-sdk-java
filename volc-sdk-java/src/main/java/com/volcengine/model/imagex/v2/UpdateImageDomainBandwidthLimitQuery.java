package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainBandwidthLimitQuery
 */
@lombok.Data
public final class UpdateImageDomainBandwidthLimitQuery  {

    /**
     * <p>服务 ID。您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。您也可以通过调用 [GetAllImageServices](https://www.volcengine.com/docs/508/9360) 接口方式获取服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
