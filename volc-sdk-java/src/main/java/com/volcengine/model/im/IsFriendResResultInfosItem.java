package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * IsFriendResResultInfosItem
 */
@lombok.Data
public final class IsFriendResResultInfosItem  {

    /**
     * <p>校验好友的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendUserId")
    private Long friendUserId;

    /**
     * <p>是否是好友。</p>
     *
     *
     *
     * <p>- `true`：是。</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsFriend")
    private Boolean isFriend;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
