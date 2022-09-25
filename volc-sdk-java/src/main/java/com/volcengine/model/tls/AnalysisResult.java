package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class AnalysisResult {
    @JSONField(name = SCHEMA)
    List<String> schema;
    @JSONField(name = TYPE)
    Map<String, String> type;
    @JSONField(name = DATA)
    List<Map<String, String>> data;
}
