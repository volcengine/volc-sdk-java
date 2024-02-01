package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * BatchAddConversationParticipantBodyParticipantInfosItem
 */
@lombok.Data
public final class BatchAddConversationParticipantBodyParticipantInfosItem  {

    /**
     * <p>添加成员所属 UserId，UserId 必须大于 `0`。</p>
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
     * <p>- `1`：群主。添加群主时，需确保会话中的 `ownerUid` 与群主的 `UserId` 相同。</p>
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
     * <p>成员扩展字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>成员已读位置点</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadIndex")
    private Long readIndex;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
