package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.CONTENT;
import static com.volcengine.model.tls.Const.LOCALE;

@Data
@NoArgsConstructor
public class SmsContentTemplateInfo {

    /**
     * Locale.
     */
    @JSONField(name = LOCALE)
    private String locale;

    /**
     * Content.
     */
    @JSONField(name = CONTENT)
    private String content;
}
