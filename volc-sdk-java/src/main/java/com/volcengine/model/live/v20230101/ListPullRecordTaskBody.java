package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullRecordTaskBody
 */
@lombok.Data
public final class ListPullRecordTaskBody  {

    /**
     * <p>查询数据的页码，默认为 `1`，表示查询第一页的数据，取值范围为正整数。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，默认为 `20`，最大值为 500。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
