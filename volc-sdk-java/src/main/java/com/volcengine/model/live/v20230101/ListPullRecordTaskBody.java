package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullRecordTaskBody
 */
@lombok.Data
public final class ListPullRecordTaskBody  {

    /**
     * <p>查询数据的页码，默认为 `1`，表示查询第一页的数据，取值范围为正整数。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，默认为 `20`，取值范围为 `[1,500]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>应用名称，取值与直播流地址的 `AppName` 字段取值相同，用来指定待更新的录制配置，默认为空。您可以调用 [ListVhostRecordPresetV2](https://www.volcengine.com/docs/6469/1126858) 接口获取 `App` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播流使用的推流域名或拉流域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>流名称，取值与直播流地址的 `StreamName` 字段取值相应，用来指定待查询的录制任务，默认为空。您可以调用 [ListVhostRecordPresetV2](https://www.volcengine.com/docs/6469/1126858) 接口获取 `Stream` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要录制的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
