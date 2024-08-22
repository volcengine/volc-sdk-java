package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetImagePreheatingResResult
 */
@lombok.Data
public final class GetImagePreheatingResResult  {

    /**
     * <p>镜像预热数据。参看 [ImagePreheating](#imagepreheating) 数据结构。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultImagePreheating> row;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
