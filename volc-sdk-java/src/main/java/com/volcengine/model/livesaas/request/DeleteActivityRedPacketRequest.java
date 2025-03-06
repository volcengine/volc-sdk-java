package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteActivityRedPacketRequest {
    @JSONField(name = "ActivityID")
    Long ActivityID;
    @JSONField(name = "RedPacketID")
    Long RedPacketID;
}
