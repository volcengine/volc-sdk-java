package com.volcengine.service.cloudtrail;

import com.volcengine.model.request.cloudtrail.LookupEventsRequest;
import com.volcengine.model.response.cloudtrail.LookupEventsResponse;
import com.volcengine.service.IBaseService;

/**
 * The interface CloudTrail service.
 */
public interface ICloudTrailService extends IBaseService {
    /**
     * Lookup Events.
     *
     * @param lookupEventsRequest the lookup events request
     * @return the lookup events response
     * @throws Exception the exception
     */
    LookupEventsResponse lookupEvents(LookupEventsRequest lookupEventsRequest) throws Exception;
}
