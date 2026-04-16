package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeForbiddenStreamGroupByPageBody
 */
@lombok.Data
public final class DescribeForbiddenStreamGroupByPageBody  {

    /**
     * <p>域名空间，即禁推流使用的域名所属的域名空间。默认为空，表示查询所有域名空间下的禁推流。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要查询的禁推流使用的域名所属的域名空间。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如果同时传入 `Vhost` 和 `Domain`，则 `Vhost` 优先级更高。</p>
     *
     * <p>- 如果 `Vhost` 和 `Domain` 均未传入，则查询所有域名空间下的禁推流。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与禁推流地址中 `AppName` 字段取值相同。默认为空，表示查询所有应用名称。长度为 1 到 30 个字符，支持以下字符：</p>
     *
     * <p>- 大写字母 A - Z</p>
     *
     * <p>- 小写字母 a - z</p>
     *
     * <p>- 数字（0 - 9）</p>
     *
     * <p>- 下划线（_）</p>
     *
     * <p>- 短横线（-）</p>
     *
     * <p>- 句点（.）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与禁推流地址中 `StreamName` 字段取值相同。长度为 1 到 100 个字符。支持以下字符：</p>
     *
     * <p>- 大写字母 A - Z</p>
     *
     * <p>- 小写字母 a - z</p>
     *
     * <p>- 数字（0 - 9）</p>
     *
     * <p>- 下划线（_）</p>
     *
     * <p>- 短横线（-）</p>
     *
     * <p>- 句点（.）</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如果同时传入 `Stream` 和 `StreamList`，则 `Stream` 优先级更高。</p>
     *
     * <p>- 如果 `Stream` 和 `StreamList` 均未传入，则查询所有流名称。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>排列方式，根据推流结束时间排序。默认值为 `desc`。取值如下：</p>
     *
     * <p>- `asc`：升序，即从时间最远到最近排序。</p>
     *
     * <p>- `desc`：降序，即从时间最近到最远排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sort")
    private String sort;

    /**
     * <p>禁推流使用的域名，表示查询所有当前域名所属域名空间的禁推流。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看禁推流使用的域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如果同时传入 `Vhost` 和 `Domain`，则 `Vhost` 优先级更高。</p>
     *
     * <p>- 如果 `Vhost` 和 `Domain` 均未传入，则查询所有域名空间下的禁推流。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>查询数据的页码，取值必须大于等于 `1`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>使用流名称进行查询的方式。默认值为 `strict`。取值如下：</p>
     *
     * <p>- `fuzzy`：模糊匹配，英文区分大小写。</p>
     *
     * <p>- `strict`：精准匹配。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果 `StreamList` 生效且包含 2 个及以上的流名称，则仅支持取值 `strict`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryType")
    private String queryType;

    /**
     * <p>流名称列表，最多可传入 50 个流名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如果同时传入 `Stream` 和 `StreamList`，则 `Stream` 优先级更高。</p>
     *
     * <p>- 如果 `Stream` 和 `StreamList` 均未传入，则查询所有流名称。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamList")
    private List<String> streamList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
