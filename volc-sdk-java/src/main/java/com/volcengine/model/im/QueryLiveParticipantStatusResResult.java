package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * QueryLiveParticipantStatusResResult
 */
@lombok.Data
public final class QueryLiveParticipantStatusResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private List<QueryLiveParticipantStatusResResultStatusItem> status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
