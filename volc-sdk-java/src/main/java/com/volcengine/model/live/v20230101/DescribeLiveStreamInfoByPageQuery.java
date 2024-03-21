package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamInfoByPageQuery
 */
@lombok.Data
public final class DescribeLiveStreamInfoByPageQuery  {

    /**
     * <p>查询数据的页码，取值为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>域名空间，即直播流地址的域名（`Domain`）所属的域名空间（`Vhost`），默认为空，表示查询所有域名空间（`Vhost`）下的在线流。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播流使用的域名，默认为空，表示查询所有当前域名空间（Vhost）下的在线流。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同，默认为空，表示查询所有应用名称。支持由大小写字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同，默认为空表示查询所有流名称。支持由大小写字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>在线流的流类型，默认为空，表示查询所有类型，支持的取值即含义如下所示。</p>
     *
     * <p>- `origin`：原始流；</p>
     *
     * <p>- `trans`：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private String streamType;

    /**
     * <p>在线流的来源类型，默认为空，表示查询所有来源类型，支持的取值即含义如下所示。</p>
     *
     *
     *
     * <p>- `push`：直推流；</p>
     *
     * <p>- `relay`：回源流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceType")
    private String sourceType;

    /**
     * <p>使用流名称进行查询的方式，默认值为 `strict`，支持的取值即含义如下所示。</p>
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
