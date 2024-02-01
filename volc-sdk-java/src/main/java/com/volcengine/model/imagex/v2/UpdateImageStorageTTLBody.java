package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageStorageTTLBody
 */
@lombok.Data
public final class UpdateImageStorageTTLBody  {

    /**
     * <p>服务 ID 。</p>
     *
     * <p>* 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>* 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>更新后的有效期时间。单位为秒，取值范围为 [86400, 7776000]。</p>
     *
     * <p>若取值超过整天，则默认向上取整，例如当`TTL`取值为`86401`时，实际有效期被设置为 2 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TTL")
    private Integer tTL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
