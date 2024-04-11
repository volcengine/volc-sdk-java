package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListTimeShiftPresetV2ResResultListItem
 */
@lombok.Data
public final class ListTimeShiftPresetV2ResResultListItem  {

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TOS 存储对应的 Bucket。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>最大时移时长，即允许用户回看的最长时间，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    /**
     * <p>时移配置名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>直播时移配置启用状态。</p>
     *
     * <p>- `0`：配置中；</p>
     *
     * <p>- `1`：已启用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>类型。默认类型为 `vod`。</p>
     *
     * <p>- `vod`：录制类型为录制时移时，录制配置中存储位置为 VOD。</p>
     *
     * <p>- `tos`：录制类型为录制时移时，录制配置中存储喂食为 TOS。</p>
     *
     * <p>- `fcdn-toS`：独立时移。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>视频点播（VOD）空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VODNamespace")
    private String vODNamespace;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
