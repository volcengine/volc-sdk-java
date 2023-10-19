package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateWatermarkPresetBody
 */
@lombok.Data
public final class CreateWatermarkPresetBody  {

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>需要添加水印的直播画面方向，支持 2 种取值。</p>
     *
     * <p>- vertical：竖屏；</p>
     *
     * <p>- horizontal：横屏。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Orientation")
    private String orientation;

    /**
     * <p>水印图片字符串，图片最大 2MB，最小 100Bytes，最大分辨率为 1080×1080。图片 Data URL 格式为：`data:[<mediatype>];[base64],<data>`。</p>
     *
     * <p>- `mediatype`：图片类型，支持 png、jpg、jpeg 格式；</p>
     *
     * <p>- `data`：base64 编码的图片字符串。</p>
     *
     *
     *
     * <p>例如，`data:image/png;base64,iVBORw0KGg****mCC`</p>
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
     * <p>水印相对宽度，水印宽度占直播转码流画面宽度的比例，取值范围为 [0,1]，水印高度会随宽度等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeWidth")
    private Float relativeWidth;

    /**
     * <p>域名空间名称。由 1 到 60 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
