package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * ListFriendBody
 */
@lombok.Data
public final class ListFriendBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>查询用户 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>信箱，用做逻辑隔离。默认值为 `0`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>查询起始位置，默认值为 `0`，即第一个添加的好友。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cursor")
    private Long cursor;

    /**
     * <p>查询条数，每次最多查询 20 位好友。默认值为 `20`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    /**
     * <p>是否需要好友总数。</p>
     *
     *
     *
     * <p>- `false`：不需要。</p>
     *
     * <p>- `true`：需要。</p>
     *
     *
     *
     * <p>默认值为 `false`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedTotal")
    private Boolean needTotal;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
