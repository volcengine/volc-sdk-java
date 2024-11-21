package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageStylesResResult
 */
@lombok.Data
public final class GetImageStylesResResult  {

    /**
     * <p>总样式个数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>当前分页样式数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Styles")
    private List<GetImageStylesResResultStylesItem> styles;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
