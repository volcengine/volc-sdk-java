package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationUserCountResResult
 */
@lombok.Data
public final class GetConversationUserCountResResult  {

    /**
     * <p>会话成员数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
