package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleSubtitlePosition
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSubtitlePosition  {

    /**
     * <p>字幕在画面中的位置。默认值为 `bottom`。取值如下：</p>
     *
     * <p>- `top`：字幕展示在画面顶部。</p>
     *
     * <p>- `bottom`：字幕展示在画面底部。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Relative")
    private String relative;

    /**
     * <p>字幕的上下边距，即字幕距离画面顶部或底部的距离。取值为画面高度的百分比，取值范围为 `(0, 0.5]`。</p>
     *
     * <p>- 当 `Relative` 取值为 `top` 时，表示上边距。</p>
     *
     * <p>- 当 `Relative` 取值为 `bottom` 时，表示下边距。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarginTb")
    private Float marginTb;

    /**
     * <p>字幕的左右边距，即字幕距离画面左右边缘的距离。取值为画面宽度的百分比，取值范围为 `[0, 0.3]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarginLr")
    private Float marginLr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
