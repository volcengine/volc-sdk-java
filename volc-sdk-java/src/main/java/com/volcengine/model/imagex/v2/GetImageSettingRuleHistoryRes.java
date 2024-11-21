package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSettingRuleHistoryRes
 */
@lombok.Data
public final class GetImageSettingRuleHistoryRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageSettingRuleHistoryResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageSettingRuleHistoryResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
