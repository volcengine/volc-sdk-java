package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleSubtitleOriginalBox
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSubtitleOriginalBox  {

    /**
     * <p>宽度。默认值为 `1.0`。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "W")
    private Float w;

    /**
     * <p>颜色。格式为`颜色的英文名称@透明度`。透明度取值范围为 `[0,1]`，支持 2 位小数。默认值为 `black@0.5`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
