package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class HostInfo {
    @JSONField(name = IP)
    String ip;
    @JSONField(name = LOG_COLLECTOR_VERSION)
    String logCollectorVersion;
    @JSONField(name = HEARTBEAT_STATUS)
    int heartbeatStatus;
}
