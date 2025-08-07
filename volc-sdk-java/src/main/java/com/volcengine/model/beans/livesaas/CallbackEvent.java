package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CallbackEvent {
    @JSONField(name = "CallbackType")
    Integer CallbackType;

    @JSONField(name = "EventName")
    String EventName;

    @JSONField(name = "Count")
    Integer Count;
}