package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * AddBlackListBodyBlackListInfosItem
 */
@lombok.Data
public final class AddBlackListBodyBlackListInfosItem  {

    /**
     * <p>加入黑名单的用户 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListUserId")
    private Long blackListUserId;

    /**
     * <p>黑名单用户扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListUserExt")
    private Map<String, String> blackListUserExt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
