package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LogBackFlowShipperToAgentLoopInfo {
    @JSONField(name = "EvaluationSetShipperInfo")
    private EvaluationSetShipperInfo evaluationSetShipperInfo;
    @JSONField(name = "ContentInfo")
    private ContentInfo contentInfo;
}
