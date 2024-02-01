package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateResponseHeaderBodyRespHdrsItem
 */
@lombok.Data
public final class UpdateResponseHeaderBodyRespHdrsItem  {

    /**
     * <p>Header Key，请见[支持配置的响应头](https://www.volcengine.com/docs/508/196704#%E6%94%AF%E6%8C%81%E9%85%8D%E7%BD%AE%E7%9A%84%E5%93%8D%E5%BA%94%E5%A4%B4)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>Header Value，设置该响应头字段的值。字段值不能超过 1,024 个字符，可以包含除`美元符号（$），Delete（ASCII code 127）`外的可打印 ASCII 字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    /**
     * <p>在 veImageX 响应用户请求时，是否校验请求头中的 Origin 字段。仅对响应头部`Access-Control-Allow-Origin`有效，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启校验，veImageX 会校验 Origin 字段。</p>
     *
     * <p>	- 如果校验成功，响应头中会包含 Access-Control-Allow-Origin 字段。字段值与 Origin 字段值相同。</p>
     *
     * <p>	- 如果校验失败，响应头中不会包含 Access-Control-Allow-Origin 字段。</p>
     *
     * <p>- `false`：关闭校验，veImageX 不会校验 Origin 字段。响应头中将始终包含 Access-Control-Allow-Origin 头部和您配置的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "access_origin_control")
    private Boolean accessOriginControl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
