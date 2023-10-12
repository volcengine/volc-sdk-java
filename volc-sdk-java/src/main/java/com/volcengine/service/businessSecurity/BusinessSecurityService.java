package com.volcengine.service.businessSecurity;

import com.volcengine.model.request.AsyncRiskDetectionRequest;
import com.volcengine.model.request.DataReportRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.RiskResultRequest;
import com.volcengine.model.request.RiskStatRequest;
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
     * @param asyncRiskDetectionRequest async risk detection request
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
     * @param dataReportRequest data report request
     * @return data report response
     * @throws Exception the exception
     */
    DataReportResponse DataReport(DataReportRequest dataReportRequest) throws Exception;

    /**
     * Account Risk
     *
     * @param riskDetectionRequest account risk request
     * @return account risk response
     * @throws Exception the exception
     */
    RiskDetectionResponse AccountRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Mobile Status.
     *
     * @deprecated 已经废弃请使用MobileStatusV2
     */
    @Deprecated
    MobileStatusResponse MobileStatus(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Mobile Status.
     *
     * @param riskDetectionRequest data report request v2
     * @return mobile status response
     * @throws Exception the exception
     */
    MobileStatusResponseV2 MobileStatusV2(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Element Verify.
     *
     * @deprecated 已经废弃请使用ElementVerifyV2
     */
    @Deprecated
    ElementVerifyResponse ElementVerify(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Element Verify.
     *
     * @param riskDetectionRequest element verify request v2
     * @return element verify response
     * @throws Exception the exception
     */
    ElementVerifyResponseV2 ElementVerifyV2(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Element Verify Encrypted.
     *
     * @param riskDetectionRequest element verify request v2
     * @param key                  private key
     * @param encryptedType        example: {@link com.volcengine.helper.Const#AES}
     * @return element verify response
     * @throws Exception the exception
     */
    ElementVerifyResponseV2 ElementVerifyEncrypted(String key, String encryptedType, RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Simple Risk Stat.
     *
     * @param commonProductStatisticsReq risk stat req
     * @return SimpleRiskStatResponse
     * @throws Exception the exception
     */
    RiskStatResponse.CommonRiskStatResponse SimpleRiskStat(RiskStatRequest.CommonProductStatisticsReq commonProductStatisticsReq) throws Exception;

    /**
     * Content Risk Stat.
     *
     * @param commonProductStatisticsReq risk stat req
     * @return ContentRiskStatResponse
     * @throws Exception the exception
     */
    RiskStatResponse.CommonRiskStatResponse ContentRiskStat(RiskStatRequest.CommonProductStatisticsReq commonProductStatisticsReq) throws Exception;
}
