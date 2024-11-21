package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthRequestHeader
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthRequestHeader  {

    /**
     * <p>鉴权请求中 HOST 头部的值。该参数的默认值是 `default`，表示 HOST 头部的值与您的加速域名相同。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "host")
    private String host;

    /**
     * <p>鉴权请求头是否包含用户请求头。取值如下所示： </p>
     *
     * <p>- `exclude`：表示鉴权请求头中不包含任何用户请求头。 </p>
     *
     * <p>- `include`：表示鉴权请求头中包含所有用户请求头。 </p>
     *
     * <p>- `includePart`：表示鉴权请求头包含指定的用户请求头。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    /**
     * <p>表示 Action 参数所对应的参数值，长度不能超过 1,024 个字符。该参数有以下说明： </p>
     *
     * <p>- 如果 `Action` 是 `exclude` 或 `include`，`Value` 必须是 `*`。 </p>
     *
     * <p>- 如果 `Action` 是 `includePart`，`Value` 参数的取值是用户请求中的一个或者多个头部。多个头部使用英文分号（;）分隔。其取值不能只是 *，可以包含除了以下字符的可打印 ASCII 字符： 下划线（_）、空格、双引号（"），Delete（ASCII code 127） 该参数的默认值是 *。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    /**
     * <p>表示鉴权请求中额外的请求头设置。您最多可以设置 50 个请求头。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "header")
    private List<UpdateImageDomainConfigBodyRemoteAuthAuthRequestHeaderHeaderItem> header;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
