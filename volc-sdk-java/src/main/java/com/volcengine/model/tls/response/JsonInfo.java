package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class JsonInfo {
    @JSONField(name = KEYS)
    private List<String> keys;

    @JSONField(name = ENABLE)
    private Boolean enable;

    @JSONField(name = ESCAPE)
    private Boolean escape;
}