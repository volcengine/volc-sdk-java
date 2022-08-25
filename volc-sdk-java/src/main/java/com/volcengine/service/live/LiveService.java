package com.volcengine.service.live;

import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.IBaseService;

public interface LiveService extends IBaseService {


    /**
     * @param listCommonTransPresetDetailRequest
     * @return ListCommonTransPresetDetailResponse
     * @throws Exception
     */
    ListCommonTransPresetDetailResponse listCommonTransPresetDetail(ListCommonTransPresetDetailRequest listCommonTransPresetDetailRequest) throws Exception;

    /**
     * @param updateCallbackRequest
     * @return UpdateCallbackResponse
     * @throws Exception
     */
    UpdateCallbackResponse updateCallback(UpdateCallbackRequest updateCallbackRequest) throws Exception;

    /**
     * @param describeCallbackRequest
     * @return DescribeCallbackResponse
     * @throws Exception
     */
    DescribeCallbackResponse describeCallback(DescribeCallbackRequest describeCallbackRequest) throws Exception;

    /**
     * @param deleteCallbackRequest
     * @return
     * @throws Exception
     */
    DeleteCallbackRespose deleteCallback(DeleteCallbackRequest deleteCallbackRequest) throws Exception;

    /**
     * @param createDomainRequest
     * @return
     * @throws Exception
     */
    CreateDomainResponse createDomain(CreateDomainRequest createDomainRequest) throws Exception;

    /**
     * @param deleteDomainRequest
     * @return
     * @throws Exception
     */
    DeleteDomainResponse deleteDomain(DeleteDomainRequest deleteDomainRequest) throws Exception;

    /**
     * @param listDomainDetailRequest
     * @return
     * @throws Exception
     */
    ListDomainDetailResponse listDomainDetail(ListDomainDetailRequest listDomainDetailRequest) throws Exception;

    /**
     * @param describeDomainRequest
     * @return
     * @throws Exception
     */
    DescribeDomainResponse describeDomain(DescribeDomainRequest describeDomainRequest) throws Exception;

    /**
     * @param enableDomainRequest
     * @return
     * @throws Exception
     */
    EnableDomainResponse enableDomain(EnableDomainRequest enableDomainRequest) throws Exception;

    /**
     * @param disableDomainRequest
     * @return
     * @throws Exception
     */
    DisableDomainResponse disableDomain(DisableDomainRequest disableDomainRequest) throws Exception;

    /**
     * @param managerPullPushDomainBindRequest
     * @return
     * @throws Exception
     */
    ManagerPullPushDomainBindResponse managerPullPushDomainBind(ManagerPullPushDomainBindRequest managerPullPushDomainBindRequest) throws Exception;

    /**
     * @param updateAuthKeyRequest
     * @return
     * @throws Exception
     */
    UpdateAuthKeyResponse updateAuthKey(UpdateAuthKeyRequest updateAuthKeyRequest) throws Exception;

    /**
     * @param enableAuthRequest
     * @return
     * @throws Exception
     */
//    EnableAuthResponse enableAuth(EnableAuthRequest enableAuthRequest) throws Exception;

    /**
     * @param disableAuthRequest
     * @return
     * @throws Exception
     */
//    DisableAuthResponse disableAuth(DisableAuthRequest disableAuthRequest) throws Exception;

    /**
     * @param describeAuthRequest
     * @return
     * @throws Exception
     */
    DescribeAuthResponse describeAuth(DescribeAuthRequest describeAuthRequest) throws Exception;

    /**
     * @param forbidStreamRequest
     * @return
     * @throws Exception
     */
    ForbidStreamResponse forbidStream(ForbidStreamRequest forbidStreamRequest) throws Exception;

    /**
     * @param resumeStreamRequest
     * @return
     * @throws Exception
     */
    ResumeStreamResponse resumeStream(ResumeStreamRequest resumeStreamRequest) throws Exception;

    /**
     * @param listCertRequest
     * @return
     * @throws Exception
     */
    ListCertResponse listCert(ListCertRequest listCertRequest) throws Exception;

    /**
     * @param createCertRequest
     * @return
     * @throws Exception
     */
    CreateCertResponse createCert(CreateCertRequest createCertRequest) throws Exception;

    /**
     * @param describeCertDetailSecretRequest
     * @return
     * @throws Exception
     */
//    DescribeCertDetailSecretResponse describeCertDetailSecret(DescribeCertDetailSecretRequest describeCertDetailSecretRequest) throws Exception;

    /**
     * @param updateCertRequest
     * @return
     * @throws Exception
     */
    UpdateCertResponse updateCert(UpdateCertRequest updateCertRequest) throws Exception;

    /**
     * @param bindCertRequest
     * @return
     * @throws Exception
     */
    BindCertResponse bindCert(BindCertRequest bindCertRequest) throws Exception;

    /**
     * @param unbindCertRequest
     * @return
     * @throws Exception
     */
    UnbindCertResponse unbindCert(UnbindCertRequest unbindCertRequest) throws Exception;

    /**
     * @param deleteCertRequest
     * @return
     * @throws Exception
     */
    DeleteCertResponse deleteCert(DeleteCertRequest deleteCertRequest) throws Exception;

    /**
     * @param updateRefererRequest
     * @return
     * @throws Exception
     */
    UpdateRefererResponse updateReferer(UpdateRefererRequest updateRefererRequest) throws Exception;

    /**
     * @param deleteRefererRequest
     * @return
     * @throws Exception
     */
    DeleteRefererResponse deleteReferer(DeleteRefererRequest deleteRefererRequest) throws Exception;

    /**
     * @param describeRefererRequest
     * @return
     * @throws Exception
     */
    DescribeRefererResponse describeReferer(DescribeRefererRequest describeRefererRequest) throws Exception;

    /**
     * @param createRecordPresetRequest
     * @return
     * @throws Exception
     */
    CreateRecordPresetResponse createRecordPreset(CreateRecordPresetRequest createRecordPresetRequest) throws Exception;

    /**
     * @param updateRecordPresetRequest
     * @return
     * @throws Exception
     */
    UpdateRecordPresetResponse updateRecordPreset(UpdateRecordPresetRequest updateRecordPresetRequest) throws Exception;

    /**
     * @param deleteRecordPresetRequest
     * @return
     * @throws Exception
     */
    DeleteRecordPresetResponse deleteRecordPreset(DeleteRecordPresetRequest deleteRecordPresetRequest) throws Exception;

    /**
     * @param listVhostRecordPresetRequest
     * @return
     * @throws Exception
     */
    ListVhostRecordPresetResponse listVhostRecordPreset(ListVhostRecordPresetRequest listVhostRecordPresetRequest) throws Exception;

    /**
     * @param createTranscodePresetRequest
     * @return
     * @throws Exception
     */
    CreateTranscodePresetResponse createTranscodePreset(CreateTranscodePresetRequest createTranscodePresetRequest) throws Exception;

    /**
     * @param updateTranscodePresetRequest
     * @return
     * @throws Exception
     */
    UpdateTranscodePresetResponse updateTranscodePreset(UpdateTranscodePresetRequest updateTranscodePresetRequest) throws Exception;

    /**
     * @param deleteTranscodePresetRequest
     * @return
     * @throws Exception
     */
    DeleteTranscodePresetResponse deleteTranscodePreset(DeleteTranscodePresetRequest deleteTranscodePresetRequest) throws Exception;

    /**
     *
     * @param listVhostTransCodePresetRequest
     * @return
     * @throws Exception
     */
    ListVhostTransCodePresetResponse listVhostTransCodePreset(ListVhostTransCodePresetRequest listVhostTransCodePresetRequest) throws Exception;

    /**
     * @param createSnapshotPresetRequest
     * @return
     * @throws Exception
     */
    CreateSnapshotPresetResponse createSnapshotPreset(CreateSnapshotPresetRequest createSnapshotPresetRequest) throws Exception;

    /**
     * @param updateSnapshotPresetRequest
     * @return
     * @throws Exception
     */
    UpdateSnapshotPresetResponse updateSnapshotPreset(UpdateSnapshotPresetRequest updateSnapshotPresetRequest) throws Exception;

    /**
     * @param deleteSnapshotPresetRequest
     * @return
     * @throws Exception
     */
    DeleteSnapshotPresetResponse deleteSnapshotPreset(DeleteSnapshotPresetRequest deleteSnapshotPresetRequest) throws Exception;

    /**
     * @param listVhostSnapshotPresetRequest
     * @return
     * @throws Exception
     */
    ListVhostSnapshotPresetResponse listVhostSnapshotPreset(ListVhostSnapshotPresetRequest listVhostSnapshotPresetRequest) throws Exception;

    /**
     *
     * @param describeLiveBandwidthDataRequest
     * @return
     * @throws Exception
     */
    DescribeLiveBandwidthDataResponse describeLiveBandwidthData(DescribeLiveBandwidthDataRequest describeLiveBandwidthDataRequest) throws Exception;

    /**
     *
     * @param describeLiveTrafficDataRequest
     * @return
     * @throws Exception
     */
    DescribeLiveTrafficDataResponse describeLiveTrafficData(DescribeLiveTrafficDataRequest describeLiveTrafficDataRequest) throws Exception;

    /**
     *
     * @param describeLiveP95PeakBandwidthDataRequest
     * @return
     * @throws Exception
     */
    DescribeLiveP95PeakBandwidthDataResponse describeLiveP95PeakBandwidthData(DescribeLiveP95PeakBandwidthDataRequest describeLiveP95PeakBandwidthDataRequest) throws Exception;

    /**
     *
     * @param describeTranscodeDataRequest
     * @return
     * @throws Exception
     */
    DescribeTranscodeDataResponse describeTranscodeData(DescribeTranscodeDataRequest describeTranscodeDataRequest) throws Exception;

    /**
     *
     * @param describeSnapshotDataRequest
     * @return
     * @throws Exception
     */
    DescribeSnapshotDataResponse describeSnapshotData(DescribeSnapshotDataRequest describeSnapshotDataRequest) throws Exception;

    /**
     *
     * @param describeRecordDataRequest
     * @return
     * @throws Exception
     */
    DescribeRecordDataResponse describeRecordData(DescribeRecordDataRequest describeRecordDataRequest) throws Exception;

    /**
     *
     * @param describeLiveTimeShiftDataRequest
     * @return
     * @throws Exception
     */
    DescribeLiveTimeShiftDataResponse describeLiveTimeShiftData(DescribeLiveTimeShiftDataRequest describeLiveTimeShiftDataRequest) throws Exception;

    /**
     *
     * @param describePushStreamMetricsRequest
     * @return
     * @throws Exception
     */
    DescribePushStreamMetricsResponse describePushStreamMetrics(DescribePushStreamMetricsRequest describePushStreamMetricsRequest) throws Exception;

    /**
     *
     * @param describeLiveStreamSessionsRequest
     * @return
     * @throws Exception
     */
    DescribeLiveStreamSessionsResponse describeLiveStreamSessions(DescribeLiveStreamSessionsRequest describeLiveStreamSessionsRequest) throws Exception;

    /**
     *
     * @param describePlayResponseStatusStatRequest
     * @return
     * @throws Exception
     */
    DescribePlayResponseStatusStatResponse describePlayResponseStatusStat(DescribePlayResponseStatusStatRequest describePlayResponseStatusStatRequest) throws Exception;

    /**
     *
     * @param describeLiveDomainLogRequest
     * @return
     * @throws Exception
     */
    DescribeLiveDomainLogResponse describeLiveDomainLog(DescribeLiveDomainLogRequest describeLiveDomainLogRequest) throws Exception;

    /**
     *
     * @param describeLiveMetricTrafficDataRequest
     * @return
     * @throws Exception
     */
    DescribeLiveMetricTrafficDataResponse describeLiveMetricTrafficData(DescribeLiveMetricTrafficDataRequest describeLiveMetricTrafficDataRequest) throws Exception;

    /**
     *
     * @param describeLiveMetricBandwidthDataRequest
     * @return
     * @throws Exception
     */
    DescribeLiveMetricBandwidthDataResponse describeLiveMetricBandwidthData(DescribeLiveMetricBandwidthDataRequest describeLiveMetricBandwidthDataRequest) throws Exception;

    /**
     *
     * @param describePlayStreamListRequest
     * @return
     * @throws Exception
     */
    DescribePlayStreamListResponse describePlayStreamList(DescribePlayStreamListRequest describePlayStreamListRequest) throws Exception;

    /**
     *
     * @param describePullToPushBandwidthDataRequest
     * @return
     * @throws Exception
     */
    DescribePullToPushBandwidthDataResponse describePullToPushBandwidthData(DescribePullToPushBandwidthDataRequest describePullToPushBandwidthDataRequest) throws Exception;

    /**
     *
     * @param createSnapshotAuditPresetRequest snapshot audit params
     * @return
     * @throws Exception
     */
    CreateSnapshotAuditPresetResponse createSnapshotAuditPreset(CreateSnapshotAuditPresetRequest createSnapshotAuditPresetRequest) throws Exception;

    /**
     *
     * @param updateSnapshotAuditPresetRequest snapshot audit params
     * @return
     * @throws Exception
     */
    UpdateSnapshotAuditPresetResponse updateSnapshotAuditPreset(UpdateSnapshotAuditPresetRequest updateSnapshotAuditPresetRequest) throws Exception;

    /**
     *
     * @param deleteSnapshotAuditPresetRequest snapshot audit params
     * @return
     * @throws Exception
     */
    DeleteSnapshotAuditPresetResponse deleteSnapshotAuditPreset(DeleteSnapshotAuditPresetRequest deleteSnapshotAuditPresetRequest) throws Exception;

    /**
     *
     * @param listVhostSnapshotAuditPresetRequest snapshot audit params
     * @return
     * @throws Exception
     */
    ListVhostSnapshotAuditPresetResponse listVhostSnapshotAuditPreset(ListVhostSnapshotAuditPresetRequest listVhostSnapshotAuditPresetRequest) throws Exception;
    
    /** 
     *
     * @param describeLiveAuditDataRequest
     * @return
     * @throws Exception
     */
    DescribeLiveAuditDataResponse describeLiveAuditData(DescribeLiveAuditDataRequest describeLiveAuditDataRequest) throws Exception;
}
