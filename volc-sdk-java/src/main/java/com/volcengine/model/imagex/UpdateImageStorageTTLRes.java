package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateImageStorageTTLRes
 */
@lombok.Data
public final class UpdateImageStorageTTLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageStorageTTLResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Map<String, Object> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
