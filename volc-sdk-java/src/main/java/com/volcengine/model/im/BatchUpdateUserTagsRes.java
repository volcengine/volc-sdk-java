package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchUpdateUserTagsRes
 */
@lombok.Data
public final class BatchUpdateUserTagsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchUpdateUserTagsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
