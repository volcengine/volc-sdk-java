package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * BatchGetUserResResultUsersItem
 */
@lombok.Data
public final class BatchGetUserResResultUsersItem  {

    /**
     * <p>用户所属应用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>用户 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>用户头像</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Portrait")
    private String portrait;

    /**
     * <p>用户扩展字段。`key` 的类型为`String`，`value` 的类型为 `String`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>用户昵称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    /**
     * <p>用户标签</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<String> tags;

    /**
     * <p>用户注册时间戳，单位为毫秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>更新时间戳，单位为毫秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModifyTime")
    private Long modifyTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
