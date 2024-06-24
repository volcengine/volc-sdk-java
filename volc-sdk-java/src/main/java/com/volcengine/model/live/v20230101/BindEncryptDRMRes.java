package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * BindEncryptDRMRes
 */
@lombok.Data
public final class BindEncryptDRMRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private BindEncryptDRMResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Map<String, Object> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
