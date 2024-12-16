package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePlayStatusCodeDataBodyUserRegionListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataBodyUserRegionListItem  {

    /**
     * <p>大区，映射关系请参见区域映射</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>国家，映射关系请参见区域映射。如果按国家筛选，需要同时传入 Area 和 Country。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>国内为省，国外暂不支持该参数，映射关系请参见区域映射。如果按省筛选，需要同时传入 Area、Country 和 Province。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
