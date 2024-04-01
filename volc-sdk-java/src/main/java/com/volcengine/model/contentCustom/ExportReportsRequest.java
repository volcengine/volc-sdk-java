package com.volcengine.model.contentCustom;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ExportReportsRequest {
    @JSONField(name = "UtmSource")
    String utmSource;
    @JSONField(name = "ReportType")
    String reportType;
    @JSONField(name = "UserDurationExport")
    UserDurationExport userDurationExport;
}
