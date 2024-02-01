package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * UpdateBlackListRes
 */
@lombok.Data
public final class UpdateBlackListRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateBlackListResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
