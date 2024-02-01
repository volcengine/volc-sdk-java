package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * BatchUpdateLiveParticipantsBodyParticipantInfosItem
 */
@lombok.Data
public final class BatchUpdateLiveParticipantsBodyParticipantInfosItem  {

    /**
     * <p>群成员用户 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>群成员头像。`AvatarUrl`、`NickName`和`Ext`均为非必填参数，但是至少需要填一个，否则服务端会报错。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvatarUrl")
    private String avatarUrl;

    /**
     * <p>群成员昵称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    /**
     * <p>群成员扩展字段。`key` 的类型为 `String`，`value` 的类型为 `String`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>群成员标记</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marks")
    private List<String> marks;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
