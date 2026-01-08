package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContentInfo {

    /** 内容格式类型. */
    @JSONField(name = "Format")
    private String format;

    /** CSV 内容配置. */
    @JSONField(name = "CsvInfo")
    private CsvInfo csvInfo;

    /** JSON 内容配置. */
    @JSONField(name = "JsonInfo")
    private JsonInfo jsonInfo;
}
