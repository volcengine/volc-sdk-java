package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ResultUnsubscribeResourceException
 */
@lombok.Data
public final class ResultUnsubscribeResourceException  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Err")
    private String err;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostIdList")
    private List<String> hostIdList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceSetIdList")
    private List<String> resourceSetIdList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
