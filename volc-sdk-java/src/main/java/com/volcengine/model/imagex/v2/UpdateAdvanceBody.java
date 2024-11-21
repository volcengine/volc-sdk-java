package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateAdvanceBody
 */
@lombok.Data
public final class UpdateAdvanceBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>高级配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "advance")
    private UpdateAdvanceBodyAdvance advance;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
