package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddImageElementsRes
 */
@lombok.Data
public final class AddImageElementsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private AddImageElementsResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private AddImageElementsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
