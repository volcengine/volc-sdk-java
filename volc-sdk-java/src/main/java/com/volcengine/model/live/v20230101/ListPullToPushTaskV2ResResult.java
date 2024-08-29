package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushTaskV2ResResult
 */
@lombok.Data
public final class ListPullToPushTaskV2ResResult  {

    /**
     * <p>任务列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListPullToPushTaskV2ResResultListItem> list;

    /**
     * <p>分页数量信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private ListPullToPushTaskV2ResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
