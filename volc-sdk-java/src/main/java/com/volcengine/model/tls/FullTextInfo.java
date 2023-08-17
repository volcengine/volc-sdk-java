package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class FullTextInfo {
    @JSONField(name = CASE_SENSITIVE)
    boolean caseSensitive;
    @JSONField(name = DELIMITER)
    String delimiter;
    @JSONField(name = INCLUDE_CHINESE)
    boolean includeChinese;

    /**
     * @param caseSensitive  是否大小写敏感
     * @param delimiter      全文索引的分词符
     * @param includeChinese 是否包含中文
     */
    public FullTextInfo(boolean caseSensitive, String delimiter, boolean includeChinese) {
        this.caseSensitive = caseSensitive;
        this.delimiter = delimiter;
        this.includeChinese = includeChinese;
    }

    /**
     * @return 是否大小写敏感
     */
    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * @param caseSensitive 是否大小写敏感
     */
    public void setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * @return 全文索引的分词符
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * @param delimiter 全文索引的分词符
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * @return 是否包含中文
     */
    public boolean isIncludeChinese() {
        return includeChinese;
    }

    /**
     * @param includeChinese 是否包含中文
     */
    public void setIncludeChinese(boolean includeChinese) {
        this.includeChinese = includeChinese;
    }
}
