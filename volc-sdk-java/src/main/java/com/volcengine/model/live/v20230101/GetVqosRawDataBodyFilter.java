package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetVqosRawDataBodyFilter
 */
@lombok.Data
public final class GetVqosRawDataBodyFilter  {

    /**
     * <p>Filters中各元素的关系</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Logic")
    private String logic;

    /**
     * <p>子筛选项，嵌套结构</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Filters")
    private List<GetVqosRawDataBodyFilterFiltersItem> filters;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
