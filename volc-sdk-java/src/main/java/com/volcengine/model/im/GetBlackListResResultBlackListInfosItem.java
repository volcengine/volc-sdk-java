package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * GetBlackListResResultBlackListInfosItem
 */
@lombok.Data
public final class GetBlackListResResultBlackListInfosItem  {

    /**
     * <p>黑名单用户 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListUserId")
    private Long blackListUserId;

    /**
     * <p>黑名单用户扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListUserExt")
    private Map<String, String> blackListUserExt;

    /**
     * <p>加入黑名单的时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>黑名单更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModifyTime")
    private Long modifyTime;

    /**
     * <p>好友信息。若黑名单用户并不是查询用户好友则不返回此字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendUserInfo")
    private GetBlackListResResultBlackListInfosItemFriendUserInfo friendUserInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
