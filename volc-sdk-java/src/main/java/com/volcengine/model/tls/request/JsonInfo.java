package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class JsonInfo {
    @JSONField(name = KEYS)
    private String[] keys;

    @JSONField(name = ENABLE)
    private boolean enable;

    @JSONField(name = ESCAPE)
    private boolean escape;
}