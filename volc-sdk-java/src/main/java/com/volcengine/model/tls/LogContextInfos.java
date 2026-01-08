package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogContextInfos {

    @JSONField(name = SOURCE)
    private String source;

    @JSONField(name = CONTEXT_FLOW)
    private String contextFlow;

    @JSONField(name = PACKAGE_OFFSET)
    private Long packageOffset;
}
