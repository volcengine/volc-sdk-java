package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRecordTaskFileHistoryResResult
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryResResult  {

    /**
     * <p>录制文件列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeRecordTaskFileHistoryResResultDataItem> data;

    /**
     * <p>查询结果的分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeRecordTaskFileHistoryResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
