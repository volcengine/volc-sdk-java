package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCloudMixTaskRes
 */
@lombok.Data
public final class ListCloudMixTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListCloudMixTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListCloudMixTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
