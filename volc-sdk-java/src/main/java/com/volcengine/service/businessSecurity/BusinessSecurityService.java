package com.volcengine.service.businessSecurity;

import com.volcengine.model.request.*;
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
     * @param riskDetectionRequest data report request v2
     * @return mobile status response
     * @throws Exception the exception
     */
    MobileStatusResponseV2 MobileStatusV2(RiskDetectionRequest riskDetectionRequest) throws Exception;

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



    RiskVConsoleResponse.GetUploadIdResult GetUploadId(GetUploadIdRequest request)throws Exception;

    RiskVConsoleResponse.UploadFileResult UploadFile(UploadFileRequest request) throws Exception;

    RiskVConsoleResponse.CompleteUploadFileResult CompleteUploadFile(CompleteUploadFileRequest request)throws Exception;

    RiskVConsoleResponse.GetUploadedPartListResult GetUploadedPartList(GetUploadedPartListRequest request) throws Exception;


    PushTrafficRiskDataResponse PushTrafficRiskData(PushTrafficRiskDataRequest request)throws  Exception;

    /**
     * Create App.
     *
     * @param createAppRequest CreateApp request
     * @return CreateApp response
     * @throws Exception the exception
     */
    CreateAppResponse.CommonCreateAppResponse CreateApp(CreateAppRequest createAppRequest)throws Exception;
    /**
     * List Apps.
     *
     * @param listAppsRequest ListApps request
     * @return ListApps response
     * @throws Exception the exception
     */
    ListAppsResponse.CommonListAppsResponse ListApps(ListAppsRequest listAppsRequest)throws Exception;

    GetDailyMarketingPackageResponse  GetDailyMarketingPackage(GetDailyMarketingPackageRequest request)throws Exception;

    ActivateRiskResultResponse ActivateRiskResult(ActivateRiskResultRequest request)throws Exception;

    CancelActivateRiskResultResponse CancelActivateRiskResult(CancelActivateRiskResultRequest request)throws Exception;

    ActivateRiskSampleDataResponse ActivateRiskSampleData(ActivateRiskSampleDataRequest request)throws Exception;

    ActivateRiskBasePackageResponse ActivateRiskBasePackage(ActivateRiskBasePackageRequest request)throws Exception;

    DeviceIdResponse DeviceId(RiskDetectionRequest request)throws Exception;
}
