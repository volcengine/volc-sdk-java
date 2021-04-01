package com.volcengine.service.adblocker;

import com.volcengine.model.request.AdBlockerRequest;
import com.volcengine.model.response.AdBlockerResponse;
import com.volcengine.service.IBaseService;

/**
 * The interface business security service.
 */
public interface AdBlockerService extends IBaseService {
    /**
     * Risk Detection.
     *
     * @param adBlockerRequest risk detection request
     * @return risk detection response
     * @throws Exception the exception
     */
    AdBlockerResponse AdBlock(AdBlockerRequest adBlockerRequest) throws Exception;
}
