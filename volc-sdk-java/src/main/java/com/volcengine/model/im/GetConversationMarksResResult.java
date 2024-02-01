package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetConversationMarksResResult
 */
@lombok.Data
public final class GetConversationMarksResResult  {

    /**
     * <p>标记类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarkTypes")
    private List<String> markTypes;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
