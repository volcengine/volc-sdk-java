package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRegionDataResResultAreasItem
 */
@lombok.Data
public final class DescribeLiveRegionDataResResultAreasItem  {

    /**
     * <p>大区标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>大区名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>国家信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Countries")
    private List<DescribeLiveRegionDataResResultAreasItemCountriesItem> countries;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
