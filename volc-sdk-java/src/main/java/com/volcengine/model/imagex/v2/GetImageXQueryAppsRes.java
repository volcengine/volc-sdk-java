package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageXQueryAppsRes
 */
@lombok.Data
public final class GetImageXQueryAppsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageXQueryAppsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageXQueryAppsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
