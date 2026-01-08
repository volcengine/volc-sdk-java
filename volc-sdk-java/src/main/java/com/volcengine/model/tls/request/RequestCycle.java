package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class RequestCycle {
    @JSONField(name = TIME)
    private Integer time;

    @JSONField(name = TYPE)
    private String type;

    @JSONField(name = CRON_TAB)
    private String cronTab;

    @JSONField(name = CRON_TIME_ZONE)
    private String cronTimeZone;
}