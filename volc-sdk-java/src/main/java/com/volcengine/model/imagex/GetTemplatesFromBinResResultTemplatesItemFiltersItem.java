package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetTemplatesFromBinResResultTemplatesItemFiltersItem
 */
@lombok.Data
public final class GetTemplatesFromBinResResultTemplatesItemFiltersItem  {

    /**
     * <p>编辑操作的名称，具体详情请见[图片编辑数据结构](https://www.volcengine.com/docs/508/127820)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>编辑操作的参数，具体详情请见[图片编辑数据结构](https://www.volcengine.com/docs/508/127820)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Param")
    private Map<String, Object> param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
