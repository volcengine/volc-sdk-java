package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeForbiddenStreamInfoByPageResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeForbiddenStreamInfoByPageResResultStreamInfoListItem  {

    /**
     * <p>禁推流的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>禁推流的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>禁推流的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>禁推流的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>禁推流被禁推的开始时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>禁推流结束禁推的时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>当前流的禁推配置是否启用。</p>
     *
     * <p>- `true`：启用；</p>
     *
     * <p>- `false`：禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Boolean status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
