package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * DeleteImageServiceRes
 */
@lombok.Data
public final class DeleteImageServiceRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageServiceResResponseMetadata responseMetadata;

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
