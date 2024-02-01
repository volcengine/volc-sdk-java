package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * BatchModifyConversationParticipantBodyParticipantInfosItem
 */
@lombok.Data
public final class BatchModifyConversationParticipantBodyParticipantInfosItem  {

    /**
     * <p>进行修改的群成员的 UserId，UserId 必须大于 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParticipantUserId")
    private Long participantUserId;

    /**
     * <p>成员等级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Level")
    private Integer level;

    /**
     * <p>成员昵称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    /**
     * <p>成员身份，可取值为：`0`，`1`，`2`。</p>
     *
     *
     *
     * <p>- `0`：普通成员。</p>
     *
     * <p>- `1`：群主。</p>
     *
     * <p>- `2`：群管理员。</p>
     *
     *
     *
     * <p>默认值为`0`，值不合法时自动调整为默认值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Role")
    private Integer role;

    /**
     * <p>禁言时间戳，表示禁言到何时，单位为秒。`0`表示未禁言。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockTime")
    private Long blockTime;

    /**
     * <p>成员扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
