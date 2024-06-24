package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeClosedStreamInfoByPageQuery
 */
@lombok.Data
public final class DescribeClosedStreamInfoByPageQuery  {

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
     * <p>域名空间，即直播流地址的域名所属的域名空间，默认为空，表示查询所有域名空间下的历史直播流。您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要查询的历史直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播流使用的域名，默认为空，表示查询所有当前域名空间下的历史直播流。您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要查询的历史直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同，默认为空，表示查询所有应用名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同，默认为空表示查询所有流名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>排列方式，根据直播流结束时间排序，默认值为 `desc`，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `asc`：从时间最远到最近排序；</p>
     *
     * <p>- `desc`：从时间最近到最远排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sort")
    private String sort;

    /**
     * <p>查询的起始时间，RFC3339 格式的时间戳，精度为秒。筛选直播流结束时间符合查询条件的历史流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTimeFrom")
    private String endTimeFrom;

    /**
     * <p>查询的结束时间，RFC3339 格式表示的时间戳，精度为秒。筛选直播流结束时间符合查询条件的历史流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTimeTo")
    private String endTimeTo;

    /**
     * <p>历史直播流的来源类型，默认为空，表示查询所有来源类型，支持的取值及含义如下所示。</p>
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
