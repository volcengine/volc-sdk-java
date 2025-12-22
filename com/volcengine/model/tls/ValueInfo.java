package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
public class ValueInfo {
    @JSONField(name = VALUE_TYPE)
    String valueType;
    @JSONField(name = DELIMITER)
    String delimiter;
    @JSONField(name = CASE_SENSITIVE)
    boolean caseSensitive;
    @JSONField(name = INCLUDE_CHINESE)
    boolean includeChinese;
    @JSONField(name = SQL_FLAG)
    boolean sqlFlag;
    @JSONField(name = JSON_KEYS)
    List<KeyValueInfo> jsonKeys;
    @JSONField(name = INDEX_ALL)
    boolean indexAll;
    @JSONField(name = AUTO_INDEX_FLAG)
    boolean autoIndexFlag;

    /**
     * @return 字段类型：long、double、text 和 json
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * @param valueType 字段类型：long、double、text 和 json
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * @return 字段的分词符。默认为空（""）
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * @param delimiter 字段的分词符。默认为空（""）
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * @return 是否区分大小写。默认为 false
     */
    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * @param caseSensitive 是否区分大小写。默认为 false
     */
    public void setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * @return 是否包含中文。默认为 false
     */
    public boolean isIncludeChinese() {
        return includeChinese;
    }

    /**
     * @param includeChinese 是否包含中文。默认为 false
     */
    public void setIncludeChinese(boolean includeChinese) {
        this.includeChinese = includeChinese;
    }

    /**
     * @return 字段是否开启分析功能。默认为 false
     */
    public boolean isSqlFlag() {
        return sqlFlag;
    }

    /**
     * @param sqlFlag 字段是否开启分析功能。默认为 false
     */
    public void setSqlFlag(boolean sqlFlag) {
        this.sqlFlag = sqlFlag;
    }

    /**
     * @return JSON子字段键值索引
     */
    public List<KeyValueInfo> getJsonKeys() {
        return jsonKeys;
    }

    /**
     * @param jsonKeys JSON子字段键值索引
     */
    public void setJsonKeys(List<KeyValueInfo> jsonKeys) {
        this.jsonKeys = jsonKeys;
    }

    /**
     * @return 是否为JSON字段中所有值为文本的字段创建索引
     */
    public boolean isIndexAll() {
        return indexAll;
    }

    /**
     * @param indexAll 是否为JSON字段中所有值为文本的字段创建索引
     */
    public void setIndexAll(boolean indexAll) {
        this.indexAll = indexAll;
    }

    /**
     * @return 该索引是否是自动索引添加
     */
    public boolean isAutoIndexFlag() {
        return autoIndexFlag;
    }

    /**
     * @param autoIndexFlag 该索引是否是自动索引添加
     */
    public void setAutoIndexFlag(boolean autoIndexFlag) {
        this.autoIndexFlag = autoIndexFlag;
    }
}