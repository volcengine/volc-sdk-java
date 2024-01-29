package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetAllImageServicesRes
 */
@lombok.Data
public final class GetAllImageServicesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetAllImageServicesResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetAllImageServicesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
