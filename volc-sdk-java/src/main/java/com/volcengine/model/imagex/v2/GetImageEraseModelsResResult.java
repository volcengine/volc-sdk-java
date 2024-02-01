package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageEraseModelsResResult
 */
@lombok.Data
public final class GetImageEraseModelsResResult  {

    /**
     * <p>模型列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Models")
    private List<String> models;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
