package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetTemplatesFromBinQuery
 */
@lombok.Data
public final class GetTemplatesFromBinQuery  {

    /**
     * <p>服务 ID</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>仅返回模板名称包含该字符串的图片模板，不填或者为空则返回所有模板。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateNamePattern")
    private String templateNamePattern;

    /**
     * <p>分页偏移。默认 0。取值为1，表示跳过第一条数据，从第二条数据开始取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    /**
     * <p>分页获取条数，默认 10。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>是否按照模板创建时间升序查询，支持取值：`true、false`，默认为`false`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Asc")
    private String asc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
