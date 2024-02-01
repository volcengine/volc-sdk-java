package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchAddManagerBody
 */
@lombok.Data
public final class BatchAddManagerBody  {

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
     * <p>操作人 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Operator")
    private Long operator;

    /**
     * <p>要添加为管理员的群成员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ManagerUserIds")
    private List<Long> managerUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
