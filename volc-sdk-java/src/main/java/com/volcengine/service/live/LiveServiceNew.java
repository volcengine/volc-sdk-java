package com.volcengine.service.live;

import com.volcengine.model.ServiceInfo;

/**
 * LiveService
 */
 public class LiveServiceNew extends LiveTrait {
    private LiveServiceNew() {
        super();
    }

    private LiveServiceNew(ServiceInfo serviceInfo) {
        super(serviceInfo);
    }

    static public LiveServiceNew getInstance() {
        return new LiveServiceNew();
    }

    static public LiveServiceNew getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LiveConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Live not support region " + region);
        }
        return new LiveServiceNew(serviceInfo);
    }
}
