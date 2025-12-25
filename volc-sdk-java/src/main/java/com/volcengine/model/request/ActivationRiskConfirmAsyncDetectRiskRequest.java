package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivationRiskConfirmAsyncDetectRiskRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "ResultId")
    Integer resultId;
    @JSONField(name = "Status")
    Integer status;
}
