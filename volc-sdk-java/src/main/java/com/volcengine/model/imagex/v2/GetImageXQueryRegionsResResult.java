package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageXQueryRegionsResResult
 */
@lombok.Data
public final class GetImageXQueryRegionsResResult  {

    /**
     * <p>60 天内上报数据中出现的国内省份，按出现次数降序排列。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private List<String> province;

    /**
     * <p>60 天内上报数据中出现的海外国家，按出现次数降序排列。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private List<String> country;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
