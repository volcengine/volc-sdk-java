package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeForbiddenStreamInfoByPageResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeForbiddenStreamInfoByPageResResultStreamInfoListItem  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>直播流开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>直播流结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>是否禁用。</p>
     *
     * <p><li>true：禁用；</p>
     *
     * <p><li>false：启用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Boolean status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
