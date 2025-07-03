package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CommitImageUploadQuery
 */
@lombok.Data
public final class CommitImageUploadQuery  {

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
     * <p>是否返回图片 meta 信息。</p>
     *
     *
     *
     * <p>- `true`：不返回图片 meta 信息。</p>
     *
     * <p>- `false`：（默认）获取图片 meta 信息并返回对应 meta 信息。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 其中若 meta 获取超时或失败，接口返回成功，但对应 meta 信息将为空。</p>
     *
     * <p>- 如果您的业务要求必须获取 meta 信息，请您参考[图片Meta信息](https://www.volcengine.com/docs/508/64085)获取。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipMeta")
    private Boolean skipMeta;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
