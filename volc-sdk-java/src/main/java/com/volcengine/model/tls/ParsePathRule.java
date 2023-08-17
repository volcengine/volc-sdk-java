package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ParsePathRule {
    @JSONField(name = PATH_SAMPLE)
    String pathSample;
    @JSONField(name = REGEX)
    String regex;
    @JSONField(name = KEYS)
    List<String> keys;

    /**
     * @param pathSample 实际场景的采集路径样例
     * @param regex      用于提取路径字段的正则表达式
     * @param keys       字段名称列表
     */
    public ParsePathRule(String pathSample, String regex, List<String> keys) {
        this.pathSample = pathSample;
        this.regex = regex;
        this.keys = keys;
    }

    /**
     * @return 实际场景的采集路径样例
     */
    public String getPathSample() {
        return pathSample;
    }

    /**
     * @param pathSample 实际场景的采集路径样例
     */
    public void setPathSample(String pathSample) {
        this.pathSample = pathSample;
    }

    /**
     * @return 用于提取路径字段的正则表达式
     */
    public String getRegex() {
        return regex;
    }

    /**
     * @param regex 用于提取路径字段的正则表达式
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * @return 字段名称列表
     */
    public List<String> getKeys() {
        return keys;
    }

    /**
     * @param keys 字段名称列表
     */
    public void setKeys(List<String> keys) {
        this.keys = keys;
    }
}
