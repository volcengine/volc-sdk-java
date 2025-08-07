package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * DeleteImageAIProcessDetailRes
 */
@lombok.Data
public final class DeleteImageAIProcessDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageAIProcessDetailResResponseMetadata responseMetadata;

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
