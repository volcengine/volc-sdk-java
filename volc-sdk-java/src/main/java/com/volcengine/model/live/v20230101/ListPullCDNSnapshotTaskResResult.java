package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullCDNSnapshotTaskResResult
 */
@lombok.Data
public final class ListPullCDNSnapshotTaskResResult  {

    /**
     * <p>直播截图列表记录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListPullCDNSnapshotTaskResResultListItem> list;

    /**
     * <p>分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private ListPullCDNSnapshotTaskResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
