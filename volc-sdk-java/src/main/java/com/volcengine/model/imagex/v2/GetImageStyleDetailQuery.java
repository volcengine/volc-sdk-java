package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailQuery
 */
@lombok.Data
public final class GetImageStyleDetailQuery  {

    /**
     * <p>样式 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StyleId")
    private String styleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
