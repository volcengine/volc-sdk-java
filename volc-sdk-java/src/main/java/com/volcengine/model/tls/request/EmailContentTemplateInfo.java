package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class EmailContentTemplateInfo {
    @JSONField(name = LOCALE)
    private String locale;

    @JSONField(name = CONTENT)
    private String content;

    @JSONField(name = SUBJECT)
    private String subject;
}
