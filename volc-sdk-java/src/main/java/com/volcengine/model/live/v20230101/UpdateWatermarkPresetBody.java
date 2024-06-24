package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateWatermarkPresetBody
 */
@lombok.Data
public final class UpdateWatermarkPresetBody  {

    /**
     * <p>应用名称，您可以调用 [ListVhostWatermarkPreset](https://www.volcengine.com/docs/6469/1126889) 接口，查看待更新水印配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播画面方向，支持 2 种取值。</p>
     *
     * <p>- `vertical`：竖屏；</p>
     *
     * <p>- `horizontal`：横屏。</p>
     *
     * <p>:::tip</p>
     *
     * <p>该参数属于历史版本参数，预计将于未来移除。建议使用预览背景高度（PreviewHeight）、预览背景宽度（PreviewWidth）参数代替。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Orientation")
    private String orientation;

    /**
     * <p>水印图片编码字符串，图片最大 2MB，最小 100Bytes，最大分辨率为 1080×1080。图片使用 data URI 协议，格式为：`data:[<mediatype>];[base64],<data>`。</p>
     *
     * <p>- `mediatype`：图片类型，支持 png、jpg、jpeg 格式；</p>
     *
     * <p>- `data`：base64 编码的图片字符串。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>如果水印图片不更新，请勿在更新配置时传入该参数，否则会造成水印无法显示。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Picture")
    private String picture;

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
     * <p>水印相对宽度，水印宽度占直播转码流画面宽度的比例，取值范围为 [0,1]，水印高度会随宽度等比缩放。与水印相对高度字段冲突，请选择其中一个传参。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeWidth")
    private Float relativeWidth;

    /**
     * <p>域名空间，您可以调用 [ListVhostWatermarkPreset](https://www.volcengine.com/docs/6469/1126889) 接口，查看待更新水印配置的 Vhost 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>水印图片对应的 HTTP 地址。与水印图片编码字符串字段二选一传入。同时传入时，以水印图片编码字符串参数为准。</p>
     *
     * <p>:::warning</p>
     *
     * <p>如果水印图片不更新，请勿在更新配置时传入该参数，否则会造成水印无法显示。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PictureUrl")
    private String pictureUrl;

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
     * <p>水印相对高度，水印高度占直播转码流画面高度的比例，取值范围为 [0,1]，水印宽度会随高度等比缩放。与水印相对宽度字段冲突，请选择其中一个传参。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeHeight")
    private Float relativeHeight;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
