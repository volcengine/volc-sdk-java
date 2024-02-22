package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetAppTokenRes
 */
@lombok.Data
public final class GetAppTokenRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetAppTokenResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
