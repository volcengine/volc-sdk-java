package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageContentBlockListResResult
 */
@lombok.Data
public final class GetImageContentBlockListResResult  {

    /**
     * <p>当前页码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页最大记录数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>符合查询条件的总记录数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<GetImageContentBlockListResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
