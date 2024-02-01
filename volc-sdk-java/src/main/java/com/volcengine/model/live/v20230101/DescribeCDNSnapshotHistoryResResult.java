package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCDNSnapshotHistoryResResult
 */
@lombok.Data
public final class DescribeCDNSnapshotHistoryResResult  {

    /**
     * <p>分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeCDNSnapshotHistoryResResultPagination pagination;

    /**
     * <p>截图文件信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeCDNSnapshotHistoryResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
