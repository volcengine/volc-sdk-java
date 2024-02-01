package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * ScanConversationParticipantListBody
 */
@lombok.Data
public final class ScanConversationParticipantListBody  {

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
     * <p>查询起始位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cursor")
    private Long cursor;

    /**
     * <p>查询人数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>按照进群的时间正序或逆序查询。</p>
     *
     *
     *
     * <p>- `false`：正序。</p>
     *
     * <p>- `true`：逆序。</p>
     *
     *
     *
     * <p>默认值为：`fasle`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Reverse")
    private Boolean reverse;

    /**
     * <p>是否只查询群成员 `UserId`。</p>
     *
     *
     *
     * <p>- `true`：是。</p>
     *
     * <p>- `false`：否。</p>
     *
     *
     *
     * <p>默认值为 `false`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlyUserIds")
    private Boolean onlyUserIds;

    /**
     * <p>直播群专用字段。是否需要获得直播群在线成员列表。</p>
     *
     *
     *
     * <p>- `true`：是。</p>
     *
     * <p>- `false`：否。</p>
     *
     *
     *
     * <p>默认值为 `false`。<br></p>
     *
     * <p>当此字段设置 `true` 时，`Reverse` 和 `OnlyUserIds` 字段均会失效，该接口按成员进入直播群时间逆序返回在线成员列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ScanOnlineParticipant")
    private Boolean scanOnlineParticipant;

    /**
     * <p>标记类型。仅支持查询具有该标记的在线成员。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MarkType")
    private String markType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
