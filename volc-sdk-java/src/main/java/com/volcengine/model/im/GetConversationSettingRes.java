package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationSettingRes
 */
@lombok.Data
public final class GetConversationSettingRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetConversationSettingResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
