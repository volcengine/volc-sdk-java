package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySubtitleParam
 */
@lombok.Data
public final class CreateHighLightTaskBodySubtitleParam  {

    /**
     * <p>字幕描边的配置，包括描边的宽度和颜色。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Border")
    private CreateHighLightTaskBodySubtitleParamBorder border;

    /**
     * <p>用于设置字幕的位置，通过调整字幕距离画面底部的边距和左右两侧的边距来指定。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Position")
    private CreateHighLightTaskBodySubtitleParamPosition position;

    /**
     * <p>用于设置字幕的字体样式，包括字体类型、字号和字体颜色。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Font")
    private CreateHighLightTaskBodySubtitleParamFont font;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
