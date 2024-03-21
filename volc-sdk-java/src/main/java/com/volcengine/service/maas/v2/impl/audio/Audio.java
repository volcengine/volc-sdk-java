package com.volcengine.service.maas.v2.impl.audio;

import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

public class Audio {
    public Speech speech;

    public Audio(MaasServiceImpl service) {
        this.speech = new Speech(service);
    }
}
