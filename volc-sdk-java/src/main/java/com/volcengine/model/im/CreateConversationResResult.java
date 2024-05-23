package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * CreateConversationResResult
 */
@lombok.Data
public final class CreateConversationResResult  {

    /**
     * <p>会话id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>会话Id，字符串类型，含义跟`ConversationShortId`一样，用来定位唯一的一个会话，历史原因，目前大部分接口都在使用`ConversationShortId`，但是仍然有比较比较老的接口会使用到`ConversationId`，如果目前您接入的功能没有使用到`ConversationId`直接忽略即可</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationId")
    private String conversationId;

    /**
     * <p>会话是否存在</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Exist")
    private Boolean exist;

    /**
     * <p>会话详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationInfo")
    private CreateConversationResResultConversationInfo conversationInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
