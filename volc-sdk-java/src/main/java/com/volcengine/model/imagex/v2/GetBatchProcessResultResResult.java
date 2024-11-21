package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetBatchProcessResultResResult
 */
@lombok.Data
public final class GetBatchProcessResultResResult  {

    /**
     * <p>批处理结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<GetBatchProcessResultResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
