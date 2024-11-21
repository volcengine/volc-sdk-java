package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthRequestQuery
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthRequestQuery  {

    /**
     * <p>表示鉴权请求是否包含用户请求 URL 中的查询参数。取值如下所示： </p>
     *
     * <p>- `exclude`：表示鉴权请求不包含任何查询参数。 </p>
     *
     * <p>- `include`：表示鉴权请求包含所有查询参数。 </p>
     *
     * <p>- `includePart`：表示鉴权请求包含指定的查询参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    /**
     * <p>表示 Action 参数所对应的参数值，长度不能超过1,024 个字符。该参数有以下说明： </p>
     *
     * <p>- 如果 `Action` 是 `exclude` 或 `include`，`Value` 必须是 `*`。 </p>
     *
     * <p>- 如果 `Action` 是 `includePart`，您需要在 Value 参数中指定用户请求 URL 中的一个或者多个查询参数，多个查询参数使用英文分号（;）分隔。您不能指定 *。查询参数是区分大小写的，可以包含除了以下字符的可打印 ASCII 字符： 双引号（"）、空格、Delete（ASCII code 127） 该参数的默认值是 *。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    /**
     * <p>表示鉴权请求中额外的参数设置。您最多可以设置 50 个参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "query")
    private List<UpdateImageDomainConfigBodyRemoteAuthAuthRequestQueryQueryItem> query;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
