package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageSettingRuleRes
 */
@lombok.Data
public final class CreateImageSettingRuleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageSettingRuleResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageSettingRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
