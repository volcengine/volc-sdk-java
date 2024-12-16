package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTopPlayDataResResultPagination
 */
@lombok.Data
public final class DescribeLiveTopPlayDataResResultPagination  {

    /**
     * <p>每页显示的数据条数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private String pageSize;

    /**
     * <p>当前所在分页的页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private String pageNum;

    /**
     * <p>查询结果的数据总条数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private String totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
