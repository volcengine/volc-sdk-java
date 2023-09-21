package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ExportFailedMigrateTaskRespEntry {
    @JSONField(name = "Key")
    String key;

    @JSONField(name = "ErrCode")
    Integer errCode;

    @JSONField(name = "ErrMsg")
    String errMsg;
}

