package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthRequestHeaderHeaderItem
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthRequestHeaderHeaderItem  {

    /**
     * <p>您需要设置的请求头。请求头不能是 host，长度不能超过 1,024 个字符，并且不区分大小写。请求头可以包含除了以下字符的可打印 ASCII 字符： 下划线（_）、双引号（"）、空格、Delete（ASCII code 127）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>请求头的类型。取值如下所示： </p>
     *
     * <p>- `constant`：表示请求头的值是一个常量。您需要在 `Value` 参数中指定该常量的值。 </p>
     *
     * <p>- `variable`：表示请求头的值来自一个变量。参见 `Value` 的说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value_type")
    private String valueType;

    /**
     * <p>表示请求头的值。取值如下所示： </p>
     *
     * <p>- 当 `ValueType` 是 `constant` 时，您需要指定一个常量值。该常量值的长度不能超过 1,024 个字符，并且区分大小写。同时，该常量值不能以美元符号（$）开头，可以包含除了以下字符的可打印 ASCII 字符： 双引号（"）、Delete（ASCII code 127） </p>
     *
     * <p>- 当 `ValueType` 是 `variable` 时，表示请求头的值来自一个变量。您可以指定该变量列表中的变量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
