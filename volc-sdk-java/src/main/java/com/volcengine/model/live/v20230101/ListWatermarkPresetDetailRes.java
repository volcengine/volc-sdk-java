package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListWatermarkPresetDetailRes
 */
@lombok.Data
public final class ListWatermarkPresetDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListWatermarkPresetDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListWatermarkPresetDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
