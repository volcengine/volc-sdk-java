package com.volcengine.service.im;

import com.volcengine.model.ServiceInfo;

/**
 * ImService
 */
 public class ImService extends ImTrait {
    private ImService() {
        super();
    }

    private ImService(ServiceInfo serviceInfo) {
        super(serviceInfo);
    }

    static public ImService getInstance() {
        return new ImService();
    }

    static public ImService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = ImConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Im not support region " + region);
        }
        return new ImService(serviceInfo);
    }
}
