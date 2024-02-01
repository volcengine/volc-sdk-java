package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetParticipantReadIndexResResult
 */
@lombok.Data
public final class GetParticipantReadIndexResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadIndexes")
    private List<GetParticipantReadIndexResResultReadIndexesItem> readIndexes;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
