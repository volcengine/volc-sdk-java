package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateImageAnalyzeTaskStatusRes
 */
@lombok.Data
public final class UpdateImageAnalyzeTaskStatusRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageAnalyzeTaskStatusResResponseMetadata responseMetadata;

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
