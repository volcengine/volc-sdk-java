package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStorageRulesV2BodyStorageRulesItemTransitionsItem
 */
@lombok.Data
public final class UpdateStorageRulesV2BodyStorageRulesItemTransitionsItem  {

    /**
     * <p>沉降存储类别。</p>
     *
     * <p>- IA，转为低频存储</p>
     *
     * <p>- ARCHIVE_FR，转为归档闪回存储</p>
     *
     * <p>- COLD_ARCHIVE，转为冷归档存储</p>
     *
     * <p>- ARCHIVE，转为归档存储</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private String storageClass;

    /**
     * <p>天数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Days")
    private Integer days;

    /**
     * <p>日期。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Date")
    private String date;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
