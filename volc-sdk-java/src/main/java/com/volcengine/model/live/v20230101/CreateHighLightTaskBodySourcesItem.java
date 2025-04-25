package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySourcesItem
 */
@lombok.Data
public final class CreateHighLightTaskBodySourcesItem  {

    /**
     * <p>视频源地址，需为有效的直播流 URL 或点播视频 URL。</p>
     *
     * <p>- 直播流 URL：支持 FLV、HLS、RTMP 、RTM 协议拉流地址。</p>
     *
     * <p>- 点播视频 URL：支持 MP4、HLS、FLV 格式点播地址。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>需确保地址在任务执行期间始终有效，并且能够被公网访问。</p>
     *
     * <p>:::</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Path")
    private String path;

    /**
     * <p>视频源类型。目前仅支持 `0`，表示在线流媒体源，即直接使用 HTTP/HTTPS/FLV/HLS/RTMP 等协议的视频流地址作为数据源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceType")
    private Integer sourceType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
