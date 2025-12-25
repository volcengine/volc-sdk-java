package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListWatermarkPresetDetailResResultWatermarkPresetListItem
 */
@lombok.Data
public final class ListWatermarkPresetDetailResResultWatermarkPresetListItem  {

    /**
     * <p>水印模板的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>水印模板的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>水印图片编码字符串。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Picture")
    private String picture;

    /**
     * <p>水印图片的文件名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PictureKey")
    private String pictureKey;

    /**
     * <p>水印图片对应的 HTTP 地址。与水印图片字符串字段二选一传入，同时传入时，以水印图片字符串参数为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PictureURL")
    private String pictureURL;

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
     * <p>水印图片预览背景高度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewHeight")
    private Integer previewHeight;

    /**
     * <p>水印图片预览背景宽度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewWidth")
    private Integer previewWidth;

    /**
     * <p>水印相对高度，水印高度占直播转码流画面高度的比例，取值范围为 [0,1]，水印宽度会随高度等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeHeight")
    private Float relativeHeight;

    /**
     * <p>水印相对宽度，水印宽度占直播转码流画面宽度的比例，取值范围为 [0,1]，水印高度会随宽度等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeWidth")
    private Float relativeWidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
