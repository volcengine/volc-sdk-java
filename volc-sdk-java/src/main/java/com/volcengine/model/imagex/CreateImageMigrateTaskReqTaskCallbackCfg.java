package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageMigrateTaskReqTaskCallbackCfg {
    @JSONField(name = "Method")
    private String method;

    @JSONField(name = "Addr")
    private String addr;
}

