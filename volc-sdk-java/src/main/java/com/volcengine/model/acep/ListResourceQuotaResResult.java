package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListResourceQuotaResResult
 */
@lombok.Data
public final class ListResourceQuotaResResult  {

    /**
     * <p>业务维度实例数据分区存储总上限，单位 GB。超过上限后无法再创建实例，需联系技术支持调整上限。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageQuota")
    private Integer storageQuota;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
