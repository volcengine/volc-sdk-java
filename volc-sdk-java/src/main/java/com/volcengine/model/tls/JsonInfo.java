package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JsonInfo {

    /** 需要导出的字段列表. */
    @JSONField(name = "Keys")
    private String[] keys;

    /** 是否启用 JSON 导出. */
    @JSONField(name = "Enable")
    private boolean enable;

    /** 是否对 JSON 内容进行转义. */
    @JSONField(name = "Escape")
    private boolean escape;
}
