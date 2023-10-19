package com.volcengine.service.live.v20230101;

import com.volcengine.model.ServiceInfo;

/**
 * LiveService
 */
 public class LiveService extends LiveTrait {
    private LiveService() {
        super();
    }

    private LiveService(ServiceInfo serviceInfo) {
        super(serviceInfo);
    }

    static public LiveService getInstance() {
        return new LiveService();
    }

    static public LiveService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LiveConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Live not support region " + region);
        }
        return new LiveService(serviceInfo);
    }
}
