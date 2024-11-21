package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRespHdrsItem
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRespHdrsItem  {

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
     * <p>开启跨域校验，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "access_origin_control")
    private Boolean accessOriginControl;

    /**
     * <p>表示对响应头的操作。该参数有以下取值： </p>
     *
     * <p>- `set`：表示设置一个头部。设置操作包括添加与修改。如果源站响应中已包含该头部，该头部的值会被覆盖。如果源站响应中没有包含该头部，该头部会被添加。 </p>
     *
     * <p>- `delete`：表示删除一个头部。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
