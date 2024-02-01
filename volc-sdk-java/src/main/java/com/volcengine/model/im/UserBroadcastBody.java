package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * UserBroadcastBody
 */
@lombok.Data
public final class UserBroadcastBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>信箱，用做逻辑隔离。默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>发送方</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sender")
    private Long sender;

    /**
     * <p>消息过期时间，单位为秒，范围为[1,604800]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MsgTTL")
    private Long msgTTL;

    /**
     * <p>消息类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MsgType")
    private Integer msgType;

    /**
     * <p>消息内容。关于消息类型和消息内容，参看 [消息相关](https://www.volcengine.com/docs/6348/372181)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>筛选用户时，Tag 匹配关系。 </p>
     *
     * <p>0：或 </p>
     *
     * <p>1：且 </p>
     *
     * <p>默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagOp")
    private Integer tagOp;

    /**
     * <p>筛选标签。不填表示全员广播。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<String> tags;

    /**
     * <p>消息的扩展字段。`key` 的类型为 String，`value` 的类型为 String。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
