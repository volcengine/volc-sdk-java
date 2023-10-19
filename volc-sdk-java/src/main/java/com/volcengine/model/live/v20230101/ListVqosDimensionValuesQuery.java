package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVqosDimensionValuesQuery
 */
@lombok.Data
public final class ListVqosDimensionValuesQuery  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VqosService")
    private String vqosService;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppQueryType")
    private Float appQueryType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
