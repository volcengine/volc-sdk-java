package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetParticipantReadIndexResResultReadIndexesItem
 */
@lombok.Data
public final class GetParticipantReadIndexResResultReadIndexesItem  {

    /**
     * <p>会话成员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>成员已读位置。若没有返回某个成员的 ReadIndex，则表示该成员的 ReadIndex 为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadIndex")
    private Long readIndex;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
