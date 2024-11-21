package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRemoteAuthMatchRuleItem
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthMatchRuleItem  {

    /**
     * <p>匹配方式，取值如下所示： </p>
     *
     * <p>- `match`：（默认）表示 object 匹配 Value。 </p>
     *
     * <p>- `not_match`：表示 object 不匹配 Value。 </p>
     *
     * <p>:::tip</p>
     *
     * <p>如果您创建了多个生效对象配置，每个配置中该参数的值必须相同。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "match_operator")
    private String matchOperator;

    /**
     * <p>表示 veImageX 对哪些对象类型进行规则匹配。取值如下所示： </p>
     *
     * <p>- `filetype`：表示特定后缀的文件。 </p>
     *
     * <p>- `directory`：表示特定文件目录下的所有文件。 </p>
     *
     * <p>- `path`：表示特定的文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "object")
    private String object;

    /**
     * <p>表示 Object 对应的具体对象，并且是大小写敏感的。参数值的长度不能超过 1,024 个字符。您可以指定一个或者多个对象。多个对象之间使用英文分号（;）分隔。该参数有以下说明： </p>
     *
     * <p>- 如果 `Object` 是 `filetype`，您需要指定一个或者多个文件后缀。文件后缀可以包含英文字母和数字。多个文件后缀使用分号（;）分隔。例如 xlsx 或者 png;txt。 </p>
     *
     * <p>- 如果 `Object` 是 `directory`，您需要指定一个或者多个目录路径。多个目录路径使用分号（;）分隔。每个目录路径必须以斜杠（/）开头和结尾，</p>
     *
     * <p>:::tip</p>
     *
     * <p>例如 /www/img/volc/;/www/doc/。您可以使用 / 表示域名下的所有目录。同时，目录路径可以包含除了以下字符的可打印 ASCII 字符： 连续斜杠（//）、百分号（%）、美元符号（$）、空格、问号（?）、Delete（ASCII code 127） </p>
     *
     * <p>:::</p>
     *
     * <p>- 如果 `Object` 是 `path`，您需要指定一个或者多个文件路径。文件路径支持使用通配符（*）表示一个或者多个字符。多个文件路径使用分号（;）分隔。</p>
     *
     * <p>:::tip</p>
     *
     * <p>例如 /www/img/volcano.png;/doc/study.docx。文件路径必须以 / 开头。同时，文件路径可以包含除了以下字符的可打印 ASCII 字符： 连续斜杠（//）、百分号（%）、美元符号（$）、空格、问号（?）、Delete（ASCII code 127）</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
