package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostWatermarkPresetResResultWatermarkPresetListItem
 */
@lombok.Data
public final class ListVhostWatermarkPresetResResultWatermarkPresetListItem  {

    /**
     * <p>火山引擎账号 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>水印模版 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>直播画面方向。</p>
     *
     * <p>- vertical：竖屏；</p>
     *
     * <p>- horizontal：横屏。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Orientation")
    private String orientation;

    /**
     * <p>水印图片链接。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Picture")
    private String picture;

    /**
     * <p>水印图片文件名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PictureKey")
    private String pictureKey;

    /**
     * <p>水平偏移，表示水印左侧边与转码流画面左侧边之间的距离，使用相对比率，取值范围为 [0,1]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PosX")
    private Float posX;

    /**
     * <p>垂直偏移，表示水印顶部边与转码流画面顶部边之间的距离，使用相对比率，取值范围为 [0,1]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PosY")
    private Float posY;

    /**
     * <p>水印相对宽度，水印宽度占直播转码流画面宽度的比例，取值范围为 [0,1]，水印高度会随宽度等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeWidth")
    private Float relativeWidth;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>水印图片对应的 HTTP 地址。与水印图片字符串字段二选一传入，同时传入时，以水印图片字符串参数为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PictureURL")
    private String pictureURL;

    /**
     * <p>水印图片预览背景高度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewHeight")
    private Float previewHeight;

    /**
     * <p>水印图片预览背景宽度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewWidth")
    private Float previewWidth;

    /**
     * <p>水印相对高度，水印高度占直播转码流画面高度的比例，取值范围为 [0,1]，水印宽度会随高度等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeHeight")
    private Float relativeHeight;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
