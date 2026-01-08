package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CsvInfo {

    /** 导出字段列表. */
    @JSONField(name = "Keys")
    private String[] keys;

    /** CSV 分隔符. */
    @JSONField(name = "Delimiter")
    private String delimiter;

    /** 转义字符. */
    @JSONField(name = "EscapeChar")
    private String escapeChar;

    /** 是否输出表头. */
    @JSONField(name = "PrintHeader")
    private boolean printHeader;

    /** 非字段内容. */
    @JSONField(name = "NonFieldContent")
    private String nonFieldContent;
}
