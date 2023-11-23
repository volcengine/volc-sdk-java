package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullCDNSnapshotTaskBody
 */
@lombok.Data
public final class ListPullCDNSnapshotTaskBody  {

    /**
     * <p>分页查询页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private String pageNum;

    /**
     * <p>单个分页中，查询的结果数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private String pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
