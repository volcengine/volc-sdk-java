package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultStorageRulesV2ItemTransitionsItem
 */
@lombok.Data
public final class GetImageServiceResResultStorageRulesV2ItemTransitionsItem  {

    /**
     * <p>存储类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private String storageClass;

    /**
     * <p>天数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Days")
    private Integer days;

    /**
     * <p>日期字符串。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Date")
    private String date;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
