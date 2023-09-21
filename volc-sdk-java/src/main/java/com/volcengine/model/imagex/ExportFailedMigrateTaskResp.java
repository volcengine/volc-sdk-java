package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ExportFailedMigrateTaskResp {
    @JSONField(name = "Entries")
    List<ExportFailedMigrateTaskRespEntry> entries;
}

