package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * IsInBlackListRes
 */
@lombok.Data
public final class IsInBlackListRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private IsInBlackListResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
