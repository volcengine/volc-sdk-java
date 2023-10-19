package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListTimeShiftPresetV2Res
 */
@lombok.Data
public final class ListTimeShiftPresetV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListTimeShiftPresetV2ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListTimeShiftPresetV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
