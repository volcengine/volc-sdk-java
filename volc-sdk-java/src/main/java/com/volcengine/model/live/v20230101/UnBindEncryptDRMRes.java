package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UnBindEncryptDRMRes
 */
@lombok.Data
public final class UnBindEncryptDRMRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UnBindEncryptDRMResResponseMetadata responseMetadata;

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
