package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePullToPushDataResResultPullToPushDetailDataListItem
 */
@lombok.Data
public final class DescribeLivePullToPushDataResResultPullToPushDetailDataListItem  {

    /**
     * <p>按维度进行数据拆分后，当前维度的拉流转推总时长，单位分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDuration")
    private Float totalDuration;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullToPushDataList")
    private List<DescribeLivePullToPushDataResResultPullToPushDetailDataListItemPullToPushDataListItem> pullToPushDataList;

    /**
     * <p>按任务群组维度进行数据拆分时的群组信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
