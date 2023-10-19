package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCommonTransPresetDetailRes
 */
@lombok.Data
public final class ListCommonTransPresetDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListCommonTransPresetDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListCommonTransPresetDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
