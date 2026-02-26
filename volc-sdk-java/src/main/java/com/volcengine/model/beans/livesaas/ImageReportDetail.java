package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ImageReportDetail {
    @JSONField(name = "DataId")
    String dataId;

    @JSONField(name = "URL")
    String url;

    @JSONField(name = "Status")
    String status;

    @JSONField(name = "FailedReason")
    String failedReason;

    @JSONField(name = "RuleResults")
    List<RuleResult> ruleResults;
}