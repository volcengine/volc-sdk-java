package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * BatchAddBlockParticipantsBody
 */
@lombok.Data
public final class BatchAddBlockParticipantsBody  {

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
     * <p>操作行为</p>
     *
     *
     *
     * <p>- `0`：禁言。用户无法在直播群中发言。</p>
     *
     * <p>- `1`：拉黑。用户无法加入直播群。</p>
     *
     *
     *
     * <p>默认值为 `0`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockAction")
    private Integer blockAction;

    /**
     * <p>`key` 为群成员 ID，类型：String，只能传userId，`value` 为禁言或者拉黑时长，类型：int，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantBlockInfos")
    private Map<String, Long> participantBlockInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
