package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * AddBlackListRes
 */
@lombok.Data
public final class AddBlackListRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private AddBlackListResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
