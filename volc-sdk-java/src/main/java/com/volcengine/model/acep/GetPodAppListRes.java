package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetPodAppListRes
 */
@lombok.Data
public final class GetPodAppListRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetPodAppListResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
