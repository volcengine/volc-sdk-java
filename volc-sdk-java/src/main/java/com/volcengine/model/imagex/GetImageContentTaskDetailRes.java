package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageContentTaskDetailRes
 */
@lombok.Data
public final class GetImageContentTaskDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageContentTaskDetailResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageContentTaskDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
