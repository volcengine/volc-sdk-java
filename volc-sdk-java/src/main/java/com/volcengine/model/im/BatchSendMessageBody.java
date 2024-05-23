package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * BatchSendMessageBody
 */
@lombok.Data
public final class BatchSendMessageBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>消息发送人 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sender")
    private Integer sender;

    /**
     * <p>消息接收人 UserId 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Receiver")
    private List<Integer> receiver;

    /**
     * <p>信箱，用做逻辑隔离 默认值为 `0`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InboxType")
    private Integer inboxType;

    /**
     * <p>消息类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MsgType")
    private Integer msgType;

    /**
     * <p>消息内容。当你给客户端发消息时，Content 内容需符合客户端格式，详细信息请参看消息格式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>消息的扩展字段，key 的数据类型为 String，value 的数据类型为 String</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
