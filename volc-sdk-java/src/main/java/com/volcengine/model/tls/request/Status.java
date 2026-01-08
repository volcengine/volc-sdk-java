package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Status {

    /**
     * Code.
     */
    @JSONField(name = "Code")
    private String code;

    /**
     * Message.
     */
    @JSONField(name = "Message")
    private String message;
}
