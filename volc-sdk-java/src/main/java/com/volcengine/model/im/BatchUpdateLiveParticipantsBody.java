package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchUpdateLiveParticipantsBody
 */
@lombok.Data
public final class BatchUpdateLiveParticipantsBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>需要更新的成员资料。一次最多支持 10 个成员。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantInfos")
    private List<BatchUpdateLiveParticipantsBodyParticipantInfosItem> participantInfos;

    /**
     * <p>更新群成员标记。默认值为 `1`。</p>
     *
     * <p>`1`：添加 </p>
     *
     * <p>`2`：删除</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarkAction")
    private Integer markAction;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
