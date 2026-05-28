package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.ALIAS;
import static com.volcengine.model.tls.Const.COLUMN;

@Data
@NoArgsConstructor
public class LogBackFlowQueryField {
    @JSONField(name = ALIAS)
    private String alias;
    @JSONField(name = COLUMN)
    private String column;
}
