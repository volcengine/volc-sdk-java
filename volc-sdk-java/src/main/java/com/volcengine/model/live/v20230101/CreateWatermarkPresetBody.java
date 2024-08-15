package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateWatermarkPresetBody
 */
@lombok.Data
public final class CreateWatermarkPresetBody  {

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>需要添加水印的直播画面方向，支持 2 种取值。</p>
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
     * <p>水印图片编码字符串，图片最大 2MB，最小 100Bytes，最大分辨率为 1080×1080。图片 Data URL 格式为：`data:[<mediatype>];[base64],<data>`。</p>
     *
     * <p>- `mediatype`：图片类型，支持 png、jpg、jpeg 格式；</p>
     *
     * <p>- `data`：base64 编码的图片字符串。</p>
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
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>水印图片对应的 HTTP 地址。与水印图片编码字符串字段二选一传入，同时传入时，以水印图片编码字符串参数为准。</p>
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

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 默认为空，表示对指定的 AppName 下所有转码流均使用当前水印配置。</p>
     *
     * <p>- 指定流名称时，表示仅对 AppName 下指定流名称的转码流使用当前水印配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
