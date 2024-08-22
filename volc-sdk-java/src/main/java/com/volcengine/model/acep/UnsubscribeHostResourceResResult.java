package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UnsubscribeHostResourceResResult
 */
@lombok.Data
public final class UnsubscribeHostResourceResResult  {

    /**
     * <p>退订失败列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExceptionList")
    private List<com.volcengine.model.acep.v20231030.ResultUnsubscribeResourceException> exceptionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
