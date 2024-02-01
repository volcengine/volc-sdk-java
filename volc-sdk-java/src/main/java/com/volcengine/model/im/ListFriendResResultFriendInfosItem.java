package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * ListFriendResResultFriendInfosItem
 */
@lombok.Data
public final class ListFriendResResultFriendInfosItem  {

    /**
     * <p>好友 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendUserId")
    private Long friendUserId;

    /**
     * <p>好友扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>成为好友的时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>好友更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModifyTime")
    private Long modifyTime;

    /**
     * <p>发起好友申请时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyTime")
    private Long applyTime;

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
