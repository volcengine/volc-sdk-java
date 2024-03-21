package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeForbiddenStreamInfoByPageQuery
 */
@lombok.Data
public final class DescribeForbiddenStreamInfoByPageQuery  {

    /**
     * <p>查询数据的页码，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>域名空间，取值与禁推直播流时设置的域名空间相同，默认为空，表示查询所有域名空间（`Vhost`）下的禁推流。您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的禁推流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播流使用的域名，取值与禁推直播流时设置的应用名称相同，默认为空，表示查询所有当前域名空间（`Vhost`）下的禁推直播流。您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的禁推直播流使用的域名。 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与禁推直播流时设置的应用名称相同，默认为空，表示查询当前域名空间（`Vhost`）下所有的禁推流。支持由大小写字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与禁推直播流时设置的流名称相同，默认查询所有流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成，如果指定 `Stream`，必须同时指定 `App` 的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>排列方式，根据推流结束时间排序，默认值为 `desc`，支持的取值及含义如下所示。</p>
     *
     * <p>- `asc`：从时间最远到最近排序；</p>
     *
     * <p>- `desc`：从时间最近到最远排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sort")
    private String sort;

    /**
     * <p>指定是否模糊匹配流名称。缺省情况为精准匹配，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `fuzzy`：模糊匹配；</p>
     *
     * <p>- `strict`：精准匹配。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryType")
    private String queryType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
