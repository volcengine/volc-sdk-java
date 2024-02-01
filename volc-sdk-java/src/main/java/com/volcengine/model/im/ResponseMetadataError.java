package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * AddBlackListResResponseMetadataError
 */
@lombok.Data
public final class ResponseMetadataError {

    /**
     * <p>错误码。参考:https://www.volcengine.com/docs/6348/412253</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>错误信息。参考：https://www.volcengine.com/docs/6348/412253</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
