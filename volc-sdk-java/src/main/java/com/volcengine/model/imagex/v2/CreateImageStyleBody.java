package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageStyleBody
 */
@lombok.Data
public final class CreateImageStyleBody  {

    /**
     * <p>样式名称，当前对字符长度及支持字符暂无限制。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>样式画布的宽度，取值范围为[0,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>样式画布的高度，取值范围为[0,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>尺寸单位。即样式画布宽度/高度的像素单位，取值为`px`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Unit")
    private String unit;

    /**
     * <p>绑定的服务 ID，用于计量计费和样式渲染结果图的存储。</p>
     *
     * <p>* 您可以在veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>* 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
