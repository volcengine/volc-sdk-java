package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListRelaySourceV4Body
 */
@lombok.Data
public final class ListRelaySourceV4Body  {

    /**
     * <p>域名空间。</p>
     *
     * <p>通过以下任一方式，获取域名空间：</p>
     *
     *
     *
     * <p>- 调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口，通过返回参数 `Vhost` 获取。</p>
     *
     * <p>- 在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，通过**域名空间**字段获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>查询数据的页码，默认值为 `1`，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>每页显示的数据条数，默认值为 `20`，最大值为 `500`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
