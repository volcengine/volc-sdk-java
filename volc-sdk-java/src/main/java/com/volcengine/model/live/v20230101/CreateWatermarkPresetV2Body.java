package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateWatermarkPresetV2Body
 */
@lombok.Data
public final class CreateWatermarkPresetV2Body  {

    /**
     * <p>水印图片对应的 HTTP 地址。</p>
     *
     * <p>:::tip</p>
     *
     * <p>Picture 与 PictureUrl 字段二选一必传，同时传入时，以 Picture 参数为准。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PictureUrl")
    private String pictureUrl;

    /**
     * <p>水印图片预览背景宽度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewWidth")
    private Float previewWidth;

    /**
     * <p>水印图片预览背景高度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewHeight")
    private Float previewHeight;

    /**
     * <p>水印相对高度，水印高度占直播转码流画面高度的比例，取值范围为 [0,1]，水印宽度会随高度等比缩放。</p>
     *
     * <p>:::tip</p>
     *
     * <p>RelativeWidth 与 RelativeHeight 二选一必传。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeHeight")
    private Float relativeHeight;

    /**
     * <p>水印图片字符串，图片最大 2MB，最小 100Bytes，最大分辨率为 1080×1080。图片 Data URL 格式为：`data:image/[<mediatype>];[base64],<data>`。</p>
     *
     * <p>- `mediatype`：图片类型，支持 png、jpg、jpeg 格式；</p>
     *
     * <p>- `data`：base64 编码的图片字符串。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>Picture 与 PictureUrl 字段二选一必传，同时传入时，以 Picture 参数为准。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Picture")
    private String picture;

    /**
     * <p>水平偏移，表示水印左侧边与转码流画面左侧边之间的距离，使用相对比率，取值范围为 [0,1]，默认为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PosX")
    private Float posX;

    /**
     * <p>垂直偏移，表示水印顶部边与转码流画面顶部边之间的距离，使用相对比率，取值范围为 [0,1]，默认为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PosY")
    private Float posY;

    /**
     * <p>水印相对宽度，水印宽度占直播转码流画面宽度的比例，取值范围为 [0,1]，水印高度会随宽度等比缩放。</p>
     *
     * <p>:::tip</p>
     *
     * <p>RelativeWidth 与 RelativeHeight 二选一必传。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeWidth")
    private Float relativeWidth;

    /**
     * <p>水印模板的名称标识，不可重复，默认传空将由系统为您自动生成。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_） 和短横线（-）组成，长度为 1 到 20 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
