package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * UpdateBlackListResResultFailedInfosItem
 */
@lombok.Data
public final class UpdateBlackListResResultFailedInfosItem  {

    /**
     * <p>更新失败的黑名单用户的 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>[错误码](https://www.volcengine.com/docs/6348/412253)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>[错误信息](https://www.volcengine.com/docs/6348/412253)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
