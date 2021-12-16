package com.volcengine.service.businessSecurity;

import com.volcengine.model.request.DataReportRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.AsyncRiskDetectionRequest;

import com.volcengine.model.request.RiskResultRequest;

import com.volcengine.model.response.*;

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

    /**
     * Data Report.
     *
     * @param  dataReportRequest data report request
     * @return data report response
     * @throws Exception the exception
     */
    DataReportResponse DataReport(DataReportRequest dataReportRequest) throws Exception;

    /**
     * Account Risk
     *
     * @param   riskDetectionRequest account risk request
     * @return account risk response
     * @throws Exception the exception
     */
   RiskDetectionResponse AccountRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Mobile Status.
     *
     * @param  riskDetectionRequest data report request
     * @return mobile status response
     * @throws Exception the exception
     */
    MobileStatusResponse MobileStatus(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Element Verify.
     *
     * @param  riskDetectionRequest element verify request
     * @return element verify response
     * @throws Exception the exception
     */
    ElementVerifyResponse ElementVerify(RiskDetectionRequest riskDetectionRequest) throws Exception;
}
