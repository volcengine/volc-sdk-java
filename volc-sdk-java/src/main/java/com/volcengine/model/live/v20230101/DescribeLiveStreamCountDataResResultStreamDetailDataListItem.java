package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamCountDataResResultStreamDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamCountDataResResultStreamDetailDataListItem  {

    /**
     * <p>按域名维度进行数据拆分时的域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>按维度进行数据拆分后，当前维度下的所有时间粒度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalStreamDataList")
    private List<DescribeLiveStreamCountDataResResultStreamDetailDataListItemTotalStreamDataListItem> totalStreamDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
