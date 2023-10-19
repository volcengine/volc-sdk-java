package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateVerifyContentRes
 */
@lombok.Data
public final class CreateVerifyContentRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateVerifyContentResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateVerifyContentResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
