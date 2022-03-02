package com.volcengine.service.live;

import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;

public interface LiveService {


    /**
     * @param listCommonTransPresetDetailRequest
     * @return
     * @throws Exception
     */
    ListCommonTransPresetDetailResponse listCommonTransPresetDetail(ListCommonTransPresetDetailRequest listCommonTransPresetDetailRequest) throws Exception;

    /**
     * @param updateCallbackRequest
     * @return
     * @throws Exception
     */
    UpdateCallbackResponse updateCallback(UpdateCallbackRequest updateCallbackRequest) throws Exception;

    /**
     * @param describeCallbackRequest
     * @return
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
    EnableAuthResponse enableAuth(EnableAuthRequest enableAuthRequest) throws Exception;

    /**
     * @param disableAuthRequest
     * @return
     * @throws Exception
     */
    DisableAuthResponse disableAuth(DisableAuthRequest disableAuthRequest) throws Exception;

    /**
     * @param describeAuthRequest
     * @return
     * @throws Exception
     */
    DescribeAuthResponse describeAuth(DescribeAuthRequest describeAuthRequest) throws Exception;

    /**
     * @param updateAllAuthUnderVhostRequest
     * @return
     * @throws Exception
     */
    UpdateAllAuthUnderVhostResponse updateAllAuthUnderVhost(UpdateAllAuthUnderVhostRequest updateAllAuthUnderVhostRequest) throws Exception;

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
    DescribeCertDetailSecretResponse describeCertDetailSecret(DescribeCertDetailSecretRequest describeCertDetailSecretRequest) throws Exception;

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
     * @param describeRecordPresetRequest
     * @return
     * @throws Exception
     */
    DescribeRecordPresetResponse describeRecordPreset(DescribeRecordPresetRequest describeRecordPresetRequest) throws Exception;

    /**
     * @param describeRecordPresetDetailRequest
     * @return
     * @throws Exception
     */
    DescribeRecordPresetDetailResponse describeRecordPresetDetail(DescribeRecordPresetDetailRequest describeRecordPresetDetailRequest) throws Exception;

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
     * @param describeTranscodePresetRequest
     * @return
     * @throws Exception
     */
    DescribeTranscodePresetResponse describeTranscodePreset(DescribeTranscodePresetRequest describeTranscodePresetRequest) throws Exception;

    /**
     * @param describeTranscodePresetDetailRequest
     * @return
     * @throws Exception
     */
    DescribeTranscodePresetDetailResponse describeTranscodePresetDetail(DescribeTranscodePresetDetailRequest describeTranscodePresetDetailRequest) throws Exception;

    /**
     * @param deleteTranscodePresetRequest
     * @return
     * @throws Exception
     */
    DeleteTranscodePresetResponse deleteTranscodePreset(DeleteTranscodePresetRequest deleteTranscodePresetRequest) throws Exception;

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
     * @param describeSnapshotPresetRequest
     * @return
     * @throws Exception
     */
    DescribeSnapshotPresetResponse describeSnapshotPreset(DescribeSnapshotPresetRequest describeSnapshotPresetRequest) throws Exception;

    /**
     * @param describeSnapshotPresetDetailRequest
     * @return
     * @throws Exception
     */
    DescribeSnapshotPresetDetailResponse describeSnapshotPresetDetail(DescribeSnapshotPresetDetailRequest describeSnapshotPresetDetailRequest) throws Exception;

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
}
