package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateImageTemplateBodyEvalsItem
 */
@lombok.Data
public final class CreateImageTemplateBodyEvalsItem  {

    /**
     * <p>评估名，画质评估固定取值为 `quality`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>画质评估参数配置内容，Key 为 参数名称，Value 为 参数配置。具体详情请见[图片编辑数据结构](https://www.volcengine.com/docs/508/127820)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Param")
    private Map<String, Object> param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
