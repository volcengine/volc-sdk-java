package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCDNSnapshotHistoryResResultDataItem
 */
@lombok.Data
public final class DescribeCDNSnapshotHistoryResResultDataItem  {

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

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
     * <p>截图文件保存的路径。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Path")
    private String path;

    /**
     * <p>截图时间戳，精度为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>截图宽度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>截图高度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
