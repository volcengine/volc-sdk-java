package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullRecordTaskResResult
 */
@lombok.Data
public final class ListPullRecordTaskResResult  {

    /**
     * <p>直播录制列表记录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListPullRecordTaskResResultListItem> list;

    /**
     * <p>分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private ListPullRecordTaskResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
