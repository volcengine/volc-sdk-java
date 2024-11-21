package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateImageStyleMetaRes
 */
@lombok.Data
public final class UpdateImageStyleMetaRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageStyleMetaResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Map<String, Object> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
