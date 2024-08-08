package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageXQueryValsResResult
 */
@lombok.Data
public final class GetImageXQueryValsResResult  {

    /**
     * <p>90 天内上报数据中出现的维度值列表，按上报次数降序排列，仅返回前1000条数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DimVal")
    private List<String> dimVal;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
