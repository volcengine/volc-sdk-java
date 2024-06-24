package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListBindEncryptDRMRes
 */
@lombok.Data
public final class ListBindEncryptDRMRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListBindEncryptDRMResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListBindEncryptDRMResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
