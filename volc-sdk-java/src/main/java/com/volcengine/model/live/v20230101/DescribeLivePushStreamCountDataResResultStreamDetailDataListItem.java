package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePushStreamCountDataResResultStreamDetailDataListItem
 */
@lombok.Data
public final class DescribeLivePushStreamCountDataResResultStreamDetailDataListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>当前数据拆分维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStreamDataList")
    private List<DescribeLivePushStreamCountDataResResultStreamDetailDataListItemTotalStreamDataListItem> totalStreamDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
