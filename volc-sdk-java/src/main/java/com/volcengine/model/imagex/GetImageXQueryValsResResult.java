package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageXQueryValsResResult
 */
@lombok.Data
public final class GetImageXQueryValsResResult  {

    /**
     * <p>60 天内上报数据中出现的维度值信息，按出现次数降序排列。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DimVal")
    private List<String> dimVal;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
