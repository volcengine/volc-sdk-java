package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * SellPointsRes
 */
@lombok.Data
public final class SellPointsRes  {

    /**
     * <p>卖点添加的状态，取值如下所示。</p>
     *
     * <p>- `ok`：卖点添加成功；</p>
     *
     * <p>- `fail`：卖点添加失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>卖点相对于混剪结果的结束时间，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>卖点添加过程中的错误信息，用于描述添加卖点失败的具体原因。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    /**
     * <p>卖点相对于混剪结果的开始时间，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>使用的卖点效果模版，当前仅支持 `default` 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EffectType")
    private String effectType;

    /**
     * <p>视频卖点信息，用于描述高光剪辑片段中的关键亮点内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellPoints")
    private String sellPoints;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
