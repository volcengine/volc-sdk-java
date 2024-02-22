package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * UnRegisterUsersResResultFailedInfosItem
 */
@lombok.Data
public final class UnRegisterUsersResResultFailedInfosItem  {

    /**
     * <p>失败的uid</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>错误信息。参考：[错误码](https://www.volcengine.com/docs/6348/412253)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    /**
     * <p>错误码。参考:https://www.volcengine.com/docs/6348/412253</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
