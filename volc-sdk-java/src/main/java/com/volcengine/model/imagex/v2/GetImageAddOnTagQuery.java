package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAddOnTagQuery
 */
@lombok.Data
public final class GetImageAddOnTagQuery  {

    /**
     * <p>组件标签 key。取值固定为`功能属性`，返回相关标签值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>组件类型，默认获取所有类型的标签信息。取值如下所示：</p>
     *
     * <p>- `AI`：智能处理类型</p>
     *
     * <p>- `Other`：其他增值类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
