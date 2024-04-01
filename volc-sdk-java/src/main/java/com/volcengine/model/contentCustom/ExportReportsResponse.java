package com.volcengine.model.contentCustom;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPoV2;
import lombok.Data;

@Data
public class ExportReportsResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPoV2.ResponseMetadata responseMetadata;
    @JSONField(name = "ReportData")
    byte[] reportData;
}
