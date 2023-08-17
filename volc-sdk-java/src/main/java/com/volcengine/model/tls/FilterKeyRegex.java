package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.KEY;
import static com.volcengine.model.tls.Const.REGEX;

@Data
@NoArgsConstructor
public class FilterKeyRegex {
    @JSONField(name = KEY)
    String key;
    @JSONField(name = REGEX)
    String regex;

    /**
     * @param key   过滤字段的名称
     * @param regex 过滤字段的日志内容需要匹配的正则表达式
     */
    public FilterKeyRegex(String key, String regex) {
        this.key = key;
        this.regex = regex;
    }

    /**
     * @return 过滤字段的名称
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key 过滤字段的名称
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return 过滤字段的日志内容需要匹配的正则表达式
     */
    public String getRegex() {
        return regex;
    }

    /**
     * @param regex 过滤字段的日志内容需要匹配的正则表达式
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }
}
