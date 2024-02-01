package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * RecallMessageResResult
 */
@lombok.Data
public final class RecallMessageResResult  {

    /**
     * <p>异动列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Items")
    private List<Object> items;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
