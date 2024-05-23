package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * BatchSendMessageResResult
 */
@lombok.Data
public final class BatchSendMessageResResult  {

    /**
     * <p>消息Id列表，key是String类型为用户UserId，value是Long类型为消息Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserMessageId")
    private Map<String, Long> userMessageId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
