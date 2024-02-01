package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * IsFriendResResult
 */
@lombok.Data
public final class IsFriendResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Infos")
    private List<IsFriendResResultInfosItem> infos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
