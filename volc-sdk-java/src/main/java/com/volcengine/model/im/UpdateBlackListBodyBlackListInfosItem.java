package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * UpdateBlackListBodyBlackListInfosItem
 */
@lombok.Data
public final class UpdateBlackListBodyBlackListInfosItem  {

    /**
     * <p>黑名单用户 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListUserId")
    private Long blackListUserId;

    /**
     * <p>黑名单用户的扩展字段，支持新增 key 和更新已有 key。更新已有 key 时，新 value 会覆盖旧 value。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListUserExt")
    private Map<String, String> blackListUserExt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
