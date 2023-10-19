package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveRegionDataResResultAreasItemCountriesItemProvincesItem
 */
@lombok.Data
public final class DescribeLiveRegionDataResResultAreasItemCountriesItemProvincesItem  {

    /**
     * <p>省份标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>省份名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
