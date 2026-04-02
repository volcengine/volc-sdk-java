package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DrawActivityRedPacketRequest {
    @JSONField(name = "ActivityID")
    Long activityID;
    @JSONField(name = "RedPacketID")
    Long redPacketID;
}
