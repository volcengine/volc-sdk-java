package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetSegmentImageRes
 */
@lombok.Data
public final class GetSegmentImageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetSegmentImageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetSegmentImageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
