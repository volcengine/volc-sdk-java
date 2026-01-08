package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ContentInfo {
    @JSONField(name = FORMAT)
    private String format;

    @JSONField(name = CSV_INFO)
    private CsvInfo csvInfo;

    @JSONField(name = JSON_INFO)
    private JsonInfo jsonInfo;
}