package com.volcengine.service.acep;

import com.volcengine.model.ServiceInfo;

/**
 * ACEPService
 */
 public class ACEPService extends ACEPTrait {
    private ACEPService() {
        super();
    }

    private ACEPService(ServiceInfo serviceInfo) {
        super(serviceInfo);
    }

    static public ACEPService getInstance() {
        return new ACEPService();
    }

    static public ACEPService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = ACEPConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("ACEP not support region " + region);
        }
        return new ACEPService(serviceInfo);
    }
}
