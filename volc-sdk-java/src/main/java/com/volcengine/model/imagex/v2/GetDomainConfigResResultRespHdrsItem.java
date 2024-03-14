package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultRespHdrsItem
 */
@lombok.Data
public final class GetDomainConfigResResultRespHdrsItem  {

    /**
     * <p>header key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>header value</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "access_origin_control")
    private Boolean accessOriginControl;

    /**
     * <p>头部操作动作，取值如下所示：</p>
     *
     * <p>- `set`：设置。</p>
     *
     * <p>- `delete`：删除。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
