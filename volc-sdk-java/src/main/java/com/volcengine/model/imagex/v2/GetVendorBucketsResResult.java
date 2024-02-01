package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetVendorBucketsResResult
 */
@lombok.Data
public final class GetVendorBucketsResResult  {

    /**
     * <p>bucket 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Buckets")
    private List<String> buckets;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
