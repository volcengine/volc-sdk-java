package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListHighLightTaskRes
 */
@lombok.Data
public final class ListHighLightTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListHighLightTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListHighLightTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
