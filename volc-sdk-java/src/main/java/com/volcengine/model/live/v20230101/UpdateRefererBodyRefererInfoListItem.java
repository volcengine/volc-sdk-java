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
     * <p>指定域名的优先级。默认值为 0，取值范围为 [0,100]，数值越大，优先级越高。如果优先级相同，则越早加入列表的域名优先级越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Integer priority;

    /**
     * <p>防盗链类型，支持如下取值。</p>
     *
     * <p>- deny：黑名单；</p>
     *
     * <p>- allow：白名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>防盗链规则，即设置的黑名单或白名单的域名，最大长度限制 300 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
