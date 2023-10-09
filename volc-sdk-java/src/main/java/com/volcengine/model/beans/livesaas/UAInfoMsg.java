package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UAInfoMsg {
    @JSONField(name = "UAName")
    String UAName;
    @JSONField(name = "UAAddress")
    String UAAddress;
}
