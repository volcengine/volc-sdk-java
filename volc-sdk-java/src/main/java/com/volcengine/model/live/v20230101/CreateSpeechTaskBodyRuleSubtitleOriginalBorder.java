package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleSubtitleOriginalBorder
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSubtitleOriginalBorder  {

    /**
     * <p>宽度。单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "W")
    private Float w;

    /**
     * <p>颜色。格式为`颜色的英文名称@透明度`。透明度取值范围为 `[0,1]`，支持 2 位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
