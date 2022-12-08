package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetCustomActMsgAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "NeedActMsg")
    Integer NeedActMsg;
    @JSONField(name = "NeedActBasicMsg")
    Integer NeedActBasicMsg;
    @JSONField(name = "NeedActStreamMsg")
    Integer NeedActStreamMsg;
    @JSONField(name = "NeedRealTimeOnlineNumber")
    Integer NeedRealTimeOnlineNumber;
}