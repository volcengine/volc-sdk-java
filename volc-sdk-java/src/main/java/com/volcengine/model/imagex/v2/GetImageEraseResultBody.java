package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageEraseResultBody
 */
@lombok.Data
public final class GetImageEraseResultBody  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>待修复原图的存储 URI 或 URL（公网可访问的 URL）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>修复模型，支持取值如下所示：</p>
     *
     * <p>- 自动检测并擦除类型模型：eraser_model_imagex_0.1.0</p>
     *
     * <p>- 指定区域擦除模型：</p>
     *
     * <p>	- eraser_model_imagex_0.1.0 （推荐）</p>
     *
     * <p>	- eraser_model_aliab</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Model")
    private String model;

    /**
     * <p>指定区域擦除时图片待修复区域。<br>不填表示自动检测内容并修复，若所选模型不支持自动检测，则直接返回原图。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BBox")
    private List<GetImageEraseResultBodyBBoxItem> bBox;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
