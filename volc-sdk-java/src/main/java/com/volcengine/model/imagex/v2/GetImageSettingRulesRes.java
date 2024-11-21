package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSettingRulesRes
 */
@lombok.Data
public final class GetImageSettingRulesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageSettingRulesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageSettingRulesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
