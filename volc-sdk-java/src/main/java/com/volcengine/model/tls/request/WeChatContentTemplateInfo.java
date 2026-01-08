package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class WeChatContentTemplateInfo {
    @JSONField(name = TITLE)
    private String title;

    @JSONField(name = LOCALE)
    private String locale;

    @JSONField(name = CONTENT)
    private String content;
}
