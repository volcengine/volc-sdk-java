package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetMessagesResResult
 */
@lombok.Data
public final class GetMessagesResResult  {

    /**
     * <p>消息详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Messages")
    private List<GetMessagesResResultMessagesItem> messages;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
