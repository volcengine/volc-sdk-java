package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * UserBroadcastRes
 */
@lombok.Data
public final class UserBroadcastRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>空，此接口可忽略此字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Map<String, Object> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
