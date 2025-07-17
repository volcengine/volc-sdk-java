package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetPageWatchDataAPIV2Request {
    @JSONField(name = "Channel")
    String Channel;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PlayStatus")
    Integer PlayStatus;
    @JSONField(name = "LineId")
    Long LineId;
}