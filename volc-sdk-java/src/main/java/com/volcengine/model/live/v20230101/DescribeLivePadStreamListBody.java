package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadStreamListBody
 */
@lombok.Data
public final class DescribeLivePadStreamListBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要录制的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>待查询的直播流所属的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>查询数据的页码，默认为 1，表示查询第一页的数据，取值范围为 `[1,10000]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Long pageNum;

    /**
     * <p>每页显示的数据条数，默认为 100，表示每页最多展示 100 条数据，取值范围为 `[1,1000]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Long pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
