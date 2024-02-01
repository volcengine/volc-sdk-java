package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageEraseModelsRes
 */
@lombok.Data
public final class GetImageEraseModelsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageEraseModelsResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageEraseModelsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
