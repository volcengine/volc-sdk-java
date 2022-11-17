package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StartVoiceTalkRequest {
    enum Transport {
        UDP, TCP;
    }

    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "Transport")
    Transport transport; // 可选参数, 默认TCP

    public String transportToString() {
        if (transport == Transport.UDP) {
            return "udp";
        } else {
            return "tcp";
        }
    }
}
