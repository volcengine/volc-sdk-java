package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TYPE;
import static com.volcengine.model.tls.Const.VALUE;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcludePath {
    @JSONField(name=TYPE)
    String type;
    @JSONField(name=VALUE)
    String value;
}
