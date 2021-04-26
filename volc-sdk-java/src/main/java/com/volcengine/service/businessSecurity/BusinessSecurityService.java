package com.volcengine.service.businessSecurity;

import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.AsyncRiskDetectionRequest;

import com.volcengine.model.request.RiskResultRequest;

import com.volcengine.model.response.RiskDetectionResponse;
import com.volcengine.model.response.AsyncRiskDetectionResponse;
import com.volcengine.model.response.RiskResultResponse;

import com.volcengine.service.IBaseService;

/**
 * The interface business security service.
 */
public interface BusinessSecurityService extends IBaseService {
    /**
     * Risk Detection.
     *
     * @param riskDetectionRequest risk detection request
     * @return risk detection response
     * @throws Exception the exception
     */
    RiskDetectionResponse RiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Async Risk Detection.
     *
     * @param  asyncRiskDetectionRequest async risk detection request
     * @return async risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncRiskDetection(AsyncRiskDetectionRequest asyncRiskDetectionRequest) throws Exception;

    /**
     * Risk Detection.
     *
     * @param riskResultRequest risk result request
     * @return risk result response
     * @throws Exception the exception
     */
    RiskResultResponse RiskResult(RiskResultRequest riskResultRequest) throws Exception;
}
