package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * RegisterUsersResResultFailedInfosItem
 */
@lombok.Data
public final class RegisterUsersResResultFailedInfosItem  {

    /**
     * <p>失败用户的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private String userId;

    /**
     * <p>错误详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    /**
     * <p>错误码。参[错误码](412253)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
