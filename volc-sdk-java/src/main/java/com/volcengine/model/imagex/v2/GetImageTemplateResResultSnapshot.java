package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTemplateResResultSnapshot
 */
@lombok.Data
public final class GetImageTemplateResResultSnapshot  {

    /**
     * <p>截图类型，可选"default"/"offset"，智能截图和指定时间戳截图</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>截图的时间戳(ms)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeOffsetMs")
    private String timeOffsetMs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
