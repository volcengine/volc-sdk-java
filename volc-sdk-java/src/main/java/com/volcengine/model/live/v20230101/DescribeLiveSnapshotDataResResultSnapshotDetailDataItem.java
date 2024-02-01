package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSnapshotDataResResultSnapshotDetailDataItem
 */
@lombok.Data
public final class DescribeLiveSnapshotDataResResultSnapshotDetailDataItem  {

    /**
     * <p>按域名维度进行数据拆分时的域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>按维度进行数据拆分后，当前维度的截图总张数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotDataList")
    private List<DescribeLiveSnapshotDataResResultSnapshotDetailDataItemSnapshotDataListItem> snapshotDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
