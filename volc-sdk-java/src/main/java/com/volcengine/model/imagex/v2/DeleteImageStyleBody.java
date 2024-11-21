package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageStyleBody
 */
@lombok.Data
public final class DeleteImageStyleBody  {

    /**
     * <p>待删除的样式 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StyleId")
    private String styleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
