package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetVqosRawDataBodyFilterFiltersItem
 */
@lombok.Data
public final class GetVqosRawDataBodyFilterFiltersItem  {

    /**
     * <p>筛选项名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Field")
    private String field;

    /**
     * <p>操作符号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Op")
    private String op;

    /**
     * <p>筛选项取值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
