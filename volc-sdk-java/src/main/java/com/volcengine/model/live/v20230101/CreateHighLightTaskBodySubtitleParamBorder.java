package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySubtitleParamBorder
 */
@lombok.Data
public final class CreateHighLightTaskBodySubtitleParamBorder  {

    /**
     * <p>字幕描边的宽度，单位为像素，默认值为 `2`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "W")
    private Integer w;

    /**
     * <p>定义字幕的描边颜色，支持以下几种方法进行定义。默认为黑色。</p>
     *
     * <p>- 以 `0x` 或 `#` 开头，后面跟着十六进制颜色 RGB 值，再跟着 `@+` 十六进制/百分比来表示的透明度值。</p>
     *
     * <p>- 使用前端框架 FFmpeg 规定的颜色关键字。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
