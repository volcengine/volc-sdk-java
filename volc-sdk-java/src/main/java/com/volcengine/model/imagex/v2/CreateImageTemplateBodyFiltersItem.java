package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateImageTemplateBodyFiltersItem
 */
@lombok.Data
public final class CreateImageTemplateBodyFiltersItem  {

    /**
     * <p>操作名称，具体详情请见[图片编辑数据结构](https://www.volcengine.com/docs/508/127820)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>操作参数配置内容，Key 为 参数名称，Value 为 参数配置。具体详情请见[图片编辑数据结构](https://www.volcengine.com/docs/508/127820)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Param")
    private Map<String, Object> param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
