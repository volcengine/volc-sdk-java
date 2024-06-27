package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ReqRegion
 */
@lombok.Data
public final class ReqRegion  {

    /**
     * <p>The identifier for the major region in the regional information can be obtained by calling [DescribeLiveRegionData](https://docs.byteplus.com/en/docs/byteplus-media-live/describeliveregiondata).</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>The country identifier in the regional information can be obtained by calling [DescribeLiveRegionData](https://docs.byteplus.com/en/docs/byteplus-media-live/describeliveregiondata). When filtering by country, both 'Area' and 'Country' need to be passed in simultaneously.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>The province identifier in the regional information is currently not supported for countries or regions outside mainland China, Hong Kong, Macao, and Taiwan. You can obtain the identifier information by calling [DescribeLiveRegionData](https://docs.byteplus.com/en/docs/byteplus-media-live/describeliveregiondata). When filtering by province, you need to simultaneously pass in `Area`, `Country`, and `Province`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
