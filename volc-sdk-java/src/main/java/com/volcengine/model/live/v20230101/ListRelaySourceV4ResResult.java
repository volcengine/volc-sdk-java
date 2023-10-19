package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListRelaySourceV4ResResult
 */
@lombok.Data
public final class ListRelaySourceV4ResResult  {

    /**
     * <p>配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListRelaySourceV4ResResultListItem> list;

    /**
     * <p>页码信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private ListRelaySourceV4ResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
