package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdatePullToPushTaskBodyWatermark
 */
@lombok.Data
public final class UpdatePullToPushTaskBodyWatermark  {

    /**
     * <p>水印图片字符串，图片最大 2MB，最小 100Bytes，最大分辨率为 1080×1080。图片 Data URL 格式为：`data:image/<mediatype>;base64,<data>`。</p>
     *
     *
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
     * <p>水平偏移，表示水印左侧边与转码流画面左侧边之间的距离，使用相对比率，取值范围为 [0,1)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativePosX")
    private Float relativePosX;

    /**
     * <p>垂直偏移，表示水印顶部边与转码流画面顶部边之间的距离，使用相对比率，取值范围为 [0,1)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativePosY")
    private Float relativePosY;

    /**
     * <p>水印宽度占直播原始画面宽度百分比，支持精度为小数点后两位。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ratio")
    private Float ratio;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
