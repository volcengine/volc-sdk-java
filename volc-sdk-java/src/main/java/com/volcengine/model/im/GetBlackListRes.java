package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetBlackListRes
 */
@lombok.Data
public final class GetBlackListRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetBlackListResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
