package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAIProcessCallbackBody
 */
@lombok.Data
public final class CreateImageAIProcessCallbackBody  {

    /**
     * <p>条目 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EntryId")
    private String entryId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
