package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthRequestQueryQueryItem
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthRequestQueryQueryItem  {

    /**
     * <p>您需要设置的鉴权请求参数，长度不能超过 1,024 个字符。鉴权请求参数可以包含除了以下字符的可打印 ASCII 字符： 双引号（"）、空格、Delete（ASCII code 127）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "key")
    private String key;

    /**
     * <p>您在 Key 中设置的鉴权请求参数的类型。ValueType 有以下取值： </p>
     *
     * <p>- `constant`：表示鉴权请求参数是一个常量。此时，您需要在 `Value` 中指定该常量的值。 </p>
     *
     * <p>- `variable`：表示鉴权请求参数的值来自一个变量。参见 `Value` 的说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value_type")
    private String valueType;

    /**
     * <p>鉴权请求参数的值，长度不能超过 1,024 个字符，并且区分大小写。Value 有以下取值： </p>
     *
     * <p>- 当 `ValueType` 是 `constant` 时，表示鉴权请求参数的值是一个常量。您需要指定该常量值。常量值不能以美元符号（$）开头，可以包含除了以下字符的可打印 ASCII 字符： 双引号（"）、Delete（ASCII code 127） </p>
     *
     * <p>- 当 `ValueType` 是 `variable` 时，表示鉴权请求参数的值来自一个变量。您可以指定该变量列表中的变量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
