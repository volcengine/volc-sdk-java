package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class GeneralWebhookHeaderKV {
    @JSONField(name = KEY)
    private String key;

    @JSONField(name = VALUE)
    private String value;

    public GeneralWebhookHeaderKV(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
