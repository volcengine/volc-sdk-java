package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveEdgeStatDataResResultUserRegionListItem
 */
@lombok.Data
public final class DescribeLiveEdgeStatDataResResultUserRegionListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
