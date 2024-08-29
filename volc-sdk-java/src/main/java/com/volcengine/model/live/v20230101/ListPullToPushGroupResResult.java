package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushGroupResResult
 */
@lombok.Data
public final class ListPullToPushGroupResResult  {

    /**
     * <p>拉流转推群组列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListPullToPushGroupResResultListItem> list;

    /**
     * <p>查询结果的数据条数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
