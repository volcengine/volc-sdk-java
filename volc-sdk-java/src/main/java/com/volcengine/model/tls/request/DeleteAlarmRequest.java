package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.volcengine.model.tls.Const.ALARM_ID;

@Data
@AllArgsConstructor
public class DeleteAlarmRequest {
    @JSONField(name = ALARM_ID)
    private String alarmId;

}
