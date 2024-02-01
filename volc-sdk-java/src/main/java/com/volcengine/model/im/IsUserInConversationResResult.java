package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * IsUserInConversationResResult
 */
@lombok.Data
public final class IsUserInConversationResResult  {

    /**
     * <p>用户是否在会话中。 true：是。 false：否。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsUserInConversation")
    private Boolean isUserInConversation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
