package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageStyleResResult
 */
@lombok.Data
public final class CreateImageStyleResResult  {

    /**
     * <p>创建好的样式 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StyleId")
    private String styleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
