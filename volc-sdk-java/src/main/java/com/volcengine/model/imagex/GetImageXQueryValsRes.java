package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageXQueryValsRes
 */
@lombok.Data
public final class GetImageXQueryValsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageXQueryValsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageXQueryValsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
