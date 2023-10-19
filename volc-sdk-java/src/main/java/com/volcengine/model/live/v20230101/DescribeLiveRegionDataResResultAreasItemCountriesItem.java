package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRegionDataResResultAreasItemCountriesItem
 */
@lombok.Data
public final class DescribeLiveRegionDataResResultAreasItemCountriesItem  {

    /**
     * <p>国家标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>国家名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>省份信息，国外暂不支持该参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Provinces")
    private List<DescribeLiveRegionDataResResultAreasItemCountriesItemProvincesItem> provinces;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
