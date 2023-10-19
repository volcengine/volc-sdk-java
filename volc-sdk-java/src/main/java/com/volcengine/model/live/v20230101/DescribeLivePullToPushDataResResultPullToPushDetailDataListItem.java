package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePullToPushDataResResultPullToPushDetailDataListItem
 */
@lombok.Data
public final class DescribeLivePullToPushDataResResultPullToPushDetailDataListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>查询范围内拉流转推总时长，单位分钟，保留小数点后 2 位。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDuration")
    private Float totalDuration;

    /**
     * <p>各时间片详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullToPushDataList")
    private List<DescribeLivePullToPushDataResResultPullToPushDetailDataListItemPullToPushDataListItem> pullToPushDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
