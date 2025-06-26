package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySubtitleParamPosition
 */
@lombok.Data
public final class CreateHighLightTaskBodySubtitleParamPosition  {

    /**
     * <p>字幕距离画面底部的边距与画面高度的占比，使用归一化百分表示，取值范围为 [0,0.5]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarginTb")
    private Float marginTb;

    /**
     * <p>字幕距离画面两侧的边距与画面宽度的占比，使用归一化百分表示，取值范围为 [0,0.2]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarginLr")
    private Float marginLr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
