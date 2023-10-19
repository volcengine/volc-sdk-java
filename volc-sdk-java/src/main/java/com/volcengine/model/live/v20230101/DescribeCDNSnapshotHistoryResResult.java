package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCDNSnapshotHistoryResResult
 */
@lombok.Data
public final class DescribeCDNSnapshotHistoryResResult  {

    /**
     * <p>截图历史列表记录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeCDNSnapshotHistoryResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeCDNSnapshotHistoryResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
