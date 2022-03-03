package com.volcengine.service.live.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import junit.framework.TestCase;

public class LiveServiceImplTest extends TestCase {

    private final String accessKey = "AKLTZDkyYTQyYmE3NzBmNDE4OWJmYTllYzY0ODhmN2MwZTI";
    private final String secretKey = "TkRkak5tUTFOalJpWkRVMU5EWTRZVGd4TmpsaE1tRmhOVEEwTXpKaFlUWQ==";

    private LiveService getLiveService() {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey(accessKey);
        liveService.setSecretKey(secretKey);
        return liveService;
    }

    public void testUpdateCallback() {
        LiveService liveService = getLiveService();
        UpdateCallbackRequest request = new UpdateCallbackRequest();
        try {
            UpdateCallbackResponse response = liveService.updateCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeCallback() {
        LiveService liveService = getLiveService();
        DescribeCallbackRequest request = new DescribeCallbackRequest();
        try {
            DescribeCallbackResponse response = liveService.describeCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteCallback() {
        LiveService liveService = getLiveService();
        DeleteCallbackRequest request = new DeleteCallbackRequest();
        try {
            DeleteCallbackRespose response = liveService.deleteCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateDomain() {
        LiveService liveService = getLiveService();
        CreateDomainRequest request = new CreateDomainRequest();
        try {
            CreateDomainResponse response = liveService.createDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteDomain() {
        LiveService liveService = getLiveService();
        DeleteDomainRequest request = new DeleteDomainRequest();
        try {
            DeleteDomainResponse response = liveService.deleteDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListDomainDetail() {
        LiveService liveService = getLiveService();
        ListDomainDetailRequest request = new ListDomainDetailRequest();
        try {
            ListDomainDetailResponse response = liveService.listDomainDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeDomain() {
        LiveService liveService = getLiveService();
        DescribeDomainRequest request = new DescribeDomainRequest();
        try {
            DescribeDomainResponse response = liveService.describeDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testEnableDomain() {
        LiveService liveService = getLiveService();
        EnableDomainRequest request = new EnableDomainRequest();
        try {
            EnableDomainResponse response = liveService.enableDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDisableDomain() {
        LiveService liveService = getLiveService();
        DisableDomainRequest request = new DisableDomainRequest();
        try {
            DisableDomainResponse response = liveService.disableDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testManagerPullPushDomainBind() {
        LiveService liveService = getLiveService();
        ManagerPullPushDomainBindRequest request = new ManagerPullPushDomainBindRequest();
        try {
            ManagerPullPushDomainBindResponse response = liveService.managerPullPushDomainBind(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateAuthKey() {
        LiveService liveService = getLiveService();
        UpdateAuthKeyRequest request = new UpdateAuthKeyRequest();
        try {
            UpdateAuthKeyResponse response = liveService.updateAuthKey(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testEnableAuth() {
        LiveService liveService = getLiveService();
        EnableAuthRequest request = new EnableAuthRequest();
        try {
            EnableAuthResponse response = liveService.enableAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDisableAuth() {
        LiveService liveService = getLiveService();
        DisableAuthRequest request = new DisableAuthRequest();
        try {
            DisableAuthResponse response = liveService.disableAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeAuth() {
        LiveService liveService = getLiveService();
        DescribeAuthRequest request = new DescribeAuthRequest();
        try {
            DescribeAuthResponse response = liveService.describeAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateAllAuthUnderVhost() {
        LiveService liveService = getLiveService();
        UpdateAllAuthUnderVhostRequest request = new UpdateAllAuthUnderVhostRequest();
        try {
            UpdateAllAuthUnderVhostResponse response = liveService.updateAllAuthUnderVhost(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testForbidStream() {
        LiveService liveService = getLiveService();
        ForbidStreamRequest request = new ForbidStreamRequest();
        try {
            ForbidStreamResponse response = liveService.forbidStream(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testResumeStream() {
        LiveService liveService = getLiveService();
        ResumeStreamRequest request = new ResumeStreamRequest();
        try {
            ResumeStreamResponse response = liveService.resumeStream(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListCert() {
        LiveService liveService = getLiveService();
        ListCertRequest request = new ListCertRequest();
        try {
            ListCertResponse response = liveService.listCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateCert() {
        LiveService liveService = getLiveService();
        CreateCertRequest request = new CreateCertRequest();
        try {
            CreateCertResponse response = liveService.createCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeCertDetailSecret() {
        LiveService liveService = getLiveService();
        DescribeCertDetailSecretRequest request = new DescribeCertDetailSecretRequest();
        try {
            DescribeCertDetailSecretResponse response = liveService.describeCertDetailSecret(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateCert() {
        LiveService liveService = getLiveService();
        UpdateCertRequest request = new UpdateCertRequest();
        try {
            UpdateCertResponse response = liveService.updateCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testBindCert() {
        LiveService liveService = getLiveService();
        BindCertRequest request = new BindCertRequest();
        try {
            BindCertResponse response = liveService.bindCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUnBindCert() {
        LiveService liveService = getLiveService();
        UnbindCertRequest request = new UnbindCertRequest();
        try {
            UnbindCertResponse response = liveService.unbindCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteCert() {
        LiveService liveService = getLiveService();
        DeleteCertRequest request = new DeleteCertRequest();
        try {
            DeleteCertResponse response = liveService.deleteCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateReferer() {
        LiveService liveService = getLiveService();
        UpdateRefererRequest request = new UpdateRefererRequest();
        try {
            UpdateRefererResponse response = liveService.updateReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteReferer() {
        LiveService liveService = getLiveService();
        DeleteRefererRequest request = new DeleteRefererRequest();
        try {
            DeleteRefererResponse response = liveService.deleteReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeReferer() {
        LiveService liveService = getLiveService();
        DescribeRefererRequest request = new DescribeRefererRequest();
        try {
            DescribeRefererResponse response = liveService.describeReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateRecordPreset() {
        LiveService liveService = getLiveService();
        CreateRecordPresetRequest request = new CreateRecordPresetRequest();
        try {
            CreateRecordPresetResponse response = liveService.createRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateRecordPreset() {
        LiveService liveService = getLiveService();
        UpdateRecordPresetRequest request = new UpdateRecordPresetRequest();
        try {
            UpdateRecordPresetResponse response = liveService.updateRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeRecordPreset() {
        LiveService liveService = getLiveService();
        DescribeRecordPresetRequest request = new DescribeRecordPresetRequest();
        try {
            DescribeRecordPresetResponse response = liveService.describeRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeRecordPresetDetail() {
        LiveService liveService = getLiveService();
        DescribeRecordPresetDetailRequest request = new DescribeRecordPresetDetailRequest();
        try {
            DescribeRecordPresetDetailResponse response = liveService.describeRecordPresetDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteRecordPreset() {
        LiveService liveService = getLiveService();
        DeleteRecordPresetRequest request = new DeleteRecordPresetRequest();
        try {
            DeleteRecordPresetResponse response = liveService.deleteRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListVhostRecordPreset() {
        LiveService liveService = getLiveService();
        ListVhostRecordPresetRequest request = new ListVhostRecordPresetRequest();
        try {
            ListVhostRecordPresetResponse response = liveService.listVhostRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateTranscodePreset() {
        LiveService liveService = getLiveService();
        CreateTranscodePresetRequest request = new CreateTranscodePresetRequest();
        try {
            CreateTranscodePresetResponse response = liveService.createTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateTranscodePreset() {
        LiveService liveService = getLiveService();
        UpdateTranscodePresetRequest request = new UpdateTranscodePresetRequest();
        try {
            UpdateTranscodePresetResponse response = liveService.updateTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeTranscodePreset() {
        LiveService liveService = getLiveService();
        DescribeTranscodePresetRequest request = new DescribeTranscodePresetRequest();
        try {
            DescribeTranscodePresetResponse response = liveService.describeTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeTranscodePresetDetail() {
        LiveService liveService = getLiveService();
        DescribeTranscodePresetDetailRequest request = new DescribeTranscodePresetDetailRequest();
        try {
            DescribeTranscodePresetDetailResponse response = liveService.describeTranscodePresetDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteTranscodePreset() {
        LiveService liveService = getLiveService();
        DeleteTranscodePresetRequest request = new DeleteTranscodePresetRequest();
        try {
            DeleteTranscodePresetResponse response = liveService.deleteTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateSnapshotPreset() {
        LiveService liveService = getLiveService();
        CreateSnapshotPresetRequest request = new CreateSnapshotPresetRequest();
        try {
            CreateSnapshotPresetResponse response = liveService.createSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateSnapshotPreset() {
        LiveService liveService = getLiveService();
        UpdateSnapshotPresetRequest request = new UpdateSnapshotPresetRequest();
        try {
            UpdateSnapshotPresetResponse response = liveService.updateSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeSnapshotPreset() {
        LiveService liveService = getLiveService();
        DescribeSnapshotPresetRequest request = new DescribeSnapshotPresetRequest();
        try {
            DescribeSnapshotPresetResponse response = liveService.describeSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeSnapshotPresetDetail() {
        LiveService liveService = getLiveService();
        DescribeSnapshotPresetDetailRequest request = new DescribeSnapshotPresetDetailRequest();
        try {
            DescribeSnapshotPresetDetailResponse response = liveService.describeSnapshotPresetDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteSnapshotPreset() {
        LiveService liveService = getLiveService();
        DeleteSnapshotPresetRequest request = new DeleteSnapshotPresetRequest();
        try {
            DeleteSnapshotPresetResponse response = liveService.deleteSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListVhostSnapshotPreset() {
        LiveService liveService = getLiveService();
        ListVhostSnapshotPresetRequest request = new ListVhostSnapshotPresetRequest();
        try {
            ListVhostSnapshotPresetResponse response = liveService.listVhostSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
