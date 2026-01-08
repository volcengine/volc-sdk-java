package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.CONTENT;

@Data
@NoArgsConstructor
public class WebhookContentTemplateInfo {

    /** Webhook 内容模板. */
    @JSONField(name = CONTENT)
    private String content;
}
