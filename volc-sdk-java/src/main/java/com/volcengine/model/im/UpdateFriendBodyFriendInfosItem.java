package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * UpdateFriendBodyFriendInfosItem
 */
@lombok.Data
public final class UpdateFriendBodyFriendInfosItem  {

    /**
     * <p>好友 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendUserId")
    private Long friendUserId;

    /**
     * <p>好友扩展字段。Ext 与 Alias 为非必填字段，但是至少需要填一个，否则服务端会报错。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>好友备注</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Alias")
    private String alias;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
