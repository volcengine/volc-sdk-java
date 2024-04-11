package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordTaskFileHistoryResResultPagination
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryResResultPagination  {

    /**
     * <p>当前所在分页的页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageCur")
    private Integer pageCur;

    /**
     * <p>每页显示的数据条数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>查询结果的数据总页数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageTotal")
    private Integer pageTotal;

    /**
     * <p>查询结果的数据总条数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
