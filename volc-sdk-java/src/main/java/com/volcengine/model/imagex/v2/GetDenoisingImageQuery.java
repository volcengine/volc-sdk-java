package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDenoisingImageQuery
 */
@lombok.Data
public final class GetDenoisingImageQuery  {

    /**
     * <p>服务 ID。</p>
     *
     *
     *
     * <p>您可以在 veImageX 控制台 服务管理页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考获取所有服务信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
