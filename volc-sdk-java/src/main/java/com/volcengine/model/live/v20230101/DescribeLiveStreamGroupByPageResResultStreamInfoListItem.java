package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamGroupByPageResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeLiveStreamGroupByPageResResultStreamInfoListItem  {

    /**
     * <p>在线流的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>在线流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>在线流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>在线流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>在线流使用的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>在线流的主流和备流详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoDetails")
    private List<DescribeLiveStreamGroupByPageResResultStreamInfoListItemStreamInfoDetailsItem> streamInfoDetails;

    /**
     * <p>在线流开始推流的时间。遵循 RFC3339 格式的 UTC 时间，精度为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionStartTime")
    private String sessionStartTime;

    /**
     * <p>是否为回源流。取值如下：</p>
     *
     * <p>- `true`：是。</p>
     *
     * <p>- `false`：否，即直播推流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsRelay")
    private Boolean isRelay;

    /**
     * <p>流类型。取值如下：</p>
     *
     * <p>- `origin`：原始流。</p>
     *
     * <p>- `trans`：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private String streamType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
