package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListRelaySourceV4ResResultPagination
 */
@lombok.Data
public final class ListRelaySourceV4ResResultPagination  {

    /**
     * <p>当前页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageCur")
    private Integer pageCur;

    /**
     * <p>单页数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>总页数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageTotal")
    private Integer pageTotal;

    /**
     * <p>总数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
