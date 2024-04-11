package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRefererBodyRefererInfoListItem
 */
@lombok.Data
public final class UpdateRefererBodyRefererInfoListItem  {

    /**
     * <p>用于标识 referer 防盗链的关键词默认取值为 `referer`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>Referer 字段规则的匹配优先级，默认为 `0`，取值范围为 [0,100]，数值越大，优先级越高。如果优先级相同，则越早加入列表的域名优先级越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Integer priority;

    /**
     * <p>Referer 字段规则类型，取值即含义如下所示。</p>
     *
     * <p>- `deny`：拒绝，即黑名单；</p>
     *
     * <p>- `allow`：通过，即白名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>Referer 字段规则，即设置的黑名单或白名单的域名，最大长度限制 300 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
