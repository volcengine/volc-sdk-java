package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * RecallMessageRes
 */
@lombok.Data
public final class RecallMessageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>空，此接口可忽略此字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private RecallMessageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
