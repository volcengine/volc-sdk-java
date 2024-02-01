package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * RegisterUsersBodyUsersItem
 */
@lombok.Data
public final class RegisterUsersBodyUsersItem  {

    /**
     * <p>注册用户的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p> 注册用户昵称。长度不能超过 100 字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    /**
     * <p>头像url。长度不能超过500字符</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Portrait")
    private String portrait;

    /**
     * <p>扩展字段。`key` 的类型为 String，`value` 的类型为 String。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>用户标签。用于全员广播</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<String> tags;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
