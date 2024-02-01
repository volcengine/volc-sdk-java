package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTranscodeCallbackBody
 */
@lombok.Data
public final class CreateImageTranscodeCallbackBody  {

    /**
     * <p>任务条目 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EntryId")
    private String entryId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
