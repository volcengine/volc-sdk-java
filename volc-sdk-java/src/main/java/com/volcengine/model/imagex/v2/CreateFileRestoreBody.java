package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateFileRestoreBody
 */
@lombok.Data
public final class CreateFileRestoreBody  {

    /**
     * <p>文件存储 URI。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [资源管理](https://console.volcengine.com/imagex/resource_manage/)页面，在已上传文件的名称列获取资源 URI。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取 URI，具体请参考[获取服务下全部上传文件](https://www.volcengine.com/docs/508/9393)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>恢复时长，取值范围为[1,365]，单位为天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>取回方式： Expedited：快速取回 Standard：标准取回 Bulk：批量取回；不设置默认standard</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tier")
    private String tier;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
