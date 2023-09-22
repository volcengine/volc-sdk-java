package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSnapshotDataResResultSnapshotDetailDataItem
 */
@lombok.Data
public final class DescribeLiveSnapshotDataResResultSnapshotDetailDataItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>所选域名的截图总张数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>每个聚合时间片的截图张数详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotDataList")
    private List<DescribeLiveSnapshotDataResResultSnapshotDetailDataItemSnapshotDataListItem> snapshotDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
