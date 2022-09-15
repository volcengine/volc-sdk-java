package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParsePathRule {
    @JSONField(name=PATH_SAMPLE)
    String pathSample;
    @JSONField(name=REGEX)
    String regex;
    @JSONField(name=KEYS)
    List<String> keys;
}
