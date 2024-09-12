package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageUpdateFilesQuery
 */
@lombok.Data
public final class GetImageUpdateFilesQuery  {

    /**
     * <p>需要查询的服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>获取类型，取值如下所示：</p>
     *
     * <p>- `0`：获取刷新 URL 列表</p>
     *
     * <p>- `1`：获取禁用 URL 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>URL 格式，若指定 URL 格式则仅返回 URL 中包含该字符串的 URL 列表。默认为空，缺省情况下返回所有 URL 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UrlPattern")
    private String urlPattern;

    /**
     * <p>分页偏移量，用于控制分页查询返回结果的起始位置，以便对数据进行分页展示和浏览。默认值为 0。</p>
     *
     * <p>:::tip</p>
     *
     * <p>例如，指定分页条数 Limit = 10，分页偏移量 Offset = 10，表示从查询结果的第 11 条记录开始返回数据，共展示 10 条数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    /**
     * <p>分页查询时，显示的每页数据的最大条数。最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
