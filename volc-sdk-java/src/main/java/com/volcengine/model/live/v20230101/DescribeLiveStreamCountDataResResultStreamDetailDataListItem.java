package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamCountDataResResultStreamDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamCountDataResResultStreamDetailDataListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>当前数据拆分维维度下的峰值流数数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStreamDataList")
    private List<DescribeLiveStreamCountDataResResultStreamDetailDataListItemTotalStreamDataListItem> totalStreamDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
