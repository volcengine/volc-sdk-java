package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * StopLivePadStreamBody
 */
@lombok.Data
public final class StopLivePadStreamBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与直播流地址的 `AppName` 字段取值相同，由 1 到 30 位数字（0 - 9）、大写小字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，默认为空。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- `App` 取值为空时，`Stream` 取值也需为空，表示垫片配置为 `Vhost` 级别的全局配置。</p>
     *
     * <p>- `App` 取值不为空时，`Stream` 取值含义请参见 `Stream` 参数说明。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址的 StreamName 字段取值相同，由 1 到 100 位数字（0 - 9）、大写小字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- `App` 取值不为空、`Stream` 取值为空时，表示垫片配置为 `Vhost` + `App` 级别的配置。</p>
     *
     * <p>- `App` 取值不为空、`Stream` 取值不为空时，表示垫片配置为 `Vhost` + `App` + `Stream` 级别的配置</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
