package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * MarkConversationBody
 */
@lombok.Data
public final class MarkConversationBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>标记类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarkTypes")
    private List<String> markTypes;

    /**
     * <p>操作类型。默认值为 `1`。</p>
     *
     * <p>- `1`:新增 </p>
     *
     * <p>- `2`:删除。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarkAction")
    private Integer markAction;

    /**
     * <p>操作人UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Operator")
    private Long operator;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
