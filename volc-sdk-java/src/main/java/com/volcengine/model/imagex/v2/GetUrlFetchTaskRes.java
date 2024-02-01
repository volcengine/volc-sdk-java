package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetUrlFetchTaskRes
 */
@lombok.Data
public final class GetUrlFetchTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetUrlFetchTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetUrlFetchTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
