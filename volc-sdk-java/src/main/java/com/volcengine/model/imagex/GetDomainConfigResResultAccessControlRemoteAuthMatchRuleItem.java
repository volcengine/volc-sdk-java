package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthMatchRuleItem
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthMatchRuleItem  {

    /**
     * <p>匹配方式，取值如下所示：</p>
     *
     *
     *
     * <p>- `match`：object 匹配 Value。</p>
     *
     * <p>- `not_match`：object 不匹配 Value。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "match_operator")
    private String matchOperator;

    /**
     * <p>对哪些对象类型进行规则匹配，取值如下所示：</p>
     *
     *
     *
     * <p>- `filetype`：表示特定后缀的文件。</p>
     *
     * <p>- `directory`：表示特定文件目录下的所有文件。</p>
     *
     * <p>- `path`：表示特定的文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "object")
    private String object;

    /**
     * <p>Object 对应的具体对象</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
