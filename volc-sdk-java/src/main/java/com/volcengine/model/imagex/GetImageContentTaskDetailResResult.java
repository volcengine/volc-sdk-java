package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageContentTaskDetailResResult
 */
@lombok.Data
public final class GetImageContentTaskDetailResResult  {

    /**
     * <p>总记录数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

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
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<GetImageContentTaskDetailResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
