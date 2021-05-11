package com.volcengine.service.adblocker;

import com.volcengine.model.request.AdBlockerRequest;
import com.volcengine.model.response.AdBlockerResponse;
import com.volcengine.service.IBaseService;

/**
 * The interface ad blocker service.
 */
public interface AdBlockerService extends IBaseService {
    /**
     * Ad Blocker.
     *
     * @param adBlockerRequest ad block request
     * @return ad block response
     * @throws Exception the exception
     */
    AdBlockerResponse AdBlock(AdBlockerRequest adBlockerRequest) throws Exception;
}
