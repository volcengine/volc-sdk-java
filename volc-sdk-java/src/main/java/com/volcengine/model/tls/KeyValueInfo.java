package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.KEY;
import static com.volcengine.model.tls.Const.VALUE;

@Data
@NoArgsConstructor
public class KeyValueInfo {
    @JSONField(name=KEY)
    String key;
    @JSONField(name=VALUE)
    ValueInfo value;
}
