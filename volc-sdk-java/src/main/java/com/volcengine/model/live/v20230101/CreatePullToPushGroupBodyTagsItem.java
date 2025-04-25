package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullToPushGroupBodyTagsItem
 */
@lombok.Data
public final class CreatePullToPushGroupBodyTagsItem  {

    /**
     * <p>标签 Key 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>标签 Value 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
