package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadPresetDetailRes
 */
@lombok.Data
public final class DescribeLivePadPresetDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLivePadPresetDetailResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLivePadPresetDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
