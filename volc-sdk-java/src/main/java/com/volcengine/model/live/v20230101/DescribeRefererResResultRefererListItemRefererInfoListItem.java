package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRefererResResultRefererListItemRefererInfoListItem
 */
@lombok.Data
public final class DescribeRefererResResultRefererListItemRefererInfoListItem  {

    /**
     * <p>用于标识 referer 防盗链的关键词，返回值为 `referer`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>优先级，当前默认返回值为 0。当多域名返回值一致时，按照域名输入顺序区分，越早加入列表的域名优先级越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Integer priority;

    /**
     * <p>referer 防盗链黑白名单类型，取值即含义如下所示。</p>
     *
     * <p>- `deny`：黑名单；</p>
     *
     * <p>- `allow`：白名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>Referer 字段规则，即设置的黑名单或白名单的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
