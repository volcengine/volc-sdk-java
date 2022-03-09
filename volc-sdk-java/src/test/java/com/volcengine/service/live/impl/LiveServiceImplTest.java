package com.volcengine.service.live.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

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
        request.setVhost("");
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

    //done
    public void testCreateDomain() {
        LiveService liveService = getLiveService();
        CreateDomainRequest request = new CreateDomainRequest();
        String testDomain = "push-rtmp-testf5java.bytedance.com";
//        String testDomain = "pull-rtmp-testlwhjava.bytedance.com";

        request.setDomain(testDomain);
        request.setType("push");
//        request.setType("pull-flv");
        try {
            CreateDomainResponse response = liveService.createDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testDeleteDomain() {
        LiveService liveService = getLiveService();
        DeleteDomainRequest request = new DeleteDomainRequest();
        String testPushDomain = "push-rtmp-testf5.bytedance.com";
        String testPullDomain = "pull-rtmp-testlwhjava.bytedance.com";
        request.setDomain(testPullDomain);
        try {
            DeleteDomainResponse response = liveService.deleteDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testListDomainDetail() {
        LiveService liveService = getLiveService();
        ListDomainDetailRequest request = new ListDomainDetailRequest();
        request.setPageNum(1);
        request.setPageSize(10);
        try {
            ListDomainDetailResponse response = liveService.listDomainDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testDescribeDomain() {
        LiveService liveService = getLiveService();
        DescribeDomainRequest request = new DescribeDomainRequest();
        String testDomain = "push-rtmp-testf5.bytedance.com";
        request.setDomainList(new String[]{"push-rtmp-testf5go.bytedance.com"});
        try {
            DescribeDomainResponse response = liveService.describeDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testDisableDomain() {
        LiveService liveService = getLiveService();
        DisableDomainRequest request = new DisableDomainRequest();
        String testDomain = "push-rtmp-testf5.bytedance.com";
        String testPullDomain = "pull-rtmp-testlwhjava.bytedance.com";

        request.setDomain(testPullDomain);
        try {
            DisableDomainResponse response = liveService.disableDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testEnableDomain() {
        LiveService liveService = getLiveService();
        EnableDomainRequest request = new EnableDomainRequest();
        String testDomain = "push-rtmp-testf5.bytedance.com";
        request.setDomain(testDomain);
        try {
            EnableDomainResponse response = liveService.enableDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testManagerPullPushDomainBind() {
        LiveService liveService = getLiveService();
        ManagerPullPushDomainBindRequest request = new ManagerPullPushDomainBindRequest();
        String testPushDomain = "push-rtmp-testf5.bytedance.com";
        String testPullDomain = "pull-rtmp-testlwhjava.bytedance.com";
//        request.setPushDomain(testPushDomain);
        request.setPullDomain(testPullDomain);
        try {
            ManagerPullPushDomainBindResponse response = liveService.managerPullPushDomainBind(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testUpdateAuthKey() {
        LiveService liveService = getLiveService();
        UpdateAuthKeyRequest request = new UpdateAuthKeyRequest();
        String testDomain = "push-rtmp-testf5java.bytedance.com";
        request.setDomain(testDomain);
        request.setSceneType("push");
        Map<String, String> items = new HashMap<>();
        items.put("EncryptionAlgorithm", "md5");
        items.put("SecretKey", "yyytt4ju");
        request.setAuthDetailList(new Object[]{items});
        try {
            UpdateAuthKeyResponse response = liveService.updateAuthKey(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testEnableAuth() {
        LiveService liveService = getLiveService();
        EnableAuthRequest request = new EnableAuthRequest();
        String testDomain = "push-rtmp-testf5java.bytedance.com";
        request.setDomain(testDomain);
        request.setSceneType("push");
        try {
            EnableAuthResponse response = liveService.enableAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testDisableAuth() {
        LiveService liveService = getLiveService();
        DisableAuthRequest request = new DisableAuthRequest();
        String testDomain = "push-rtmp-testf5java.bytedance.com";
        request.setDomain(testDomain);
        request.setSceneType("push");
        try {
            DisableAuthResponse response = liveService.disableAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testDescribeAuth() {
        LiveService liveService = getLiveService();
        DescribeAuthRequest request = new DescribeAuthRequest();
        String testDomain = "push-rtmp-testf5java.bytedance.com";
        request.setDomain(testDomain);
        try {
            DescribeAuthResponse response = liveService.describeAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //todo 感觉没问题
    public void testForbidStream() {
        LiveService liveService = getLiveService();
        ForbidStreamRequest request = new ForbidStreamRequest();
        String testDomain = "push-rtmp-testf5java.bytedance.com";
        request.setDomain(testDomain);
        request.setApp("123");
        request.setStream("123");
        request.setEndTime("2021-03-23 14:49:58");
        try {
            ForbidStreamResponse response = liveService.forbidStream(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //todo 感觉没问题
    public void testResumeStream() {
        LiveService liveService = getLiveService();
        ResumeStreamRequest request = new ResumeStreamRequest();
        request.setDomain("domain");
        request.setApp("app");
        request.setStream("stream");
        try {
            ResumeStreamResponse response = liveService.resumeStream(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testListCert() {
        LiveService liveService = getLiveService();
        ListCertRequest request = new ListCertRequest();
//        String testDomain = "push-rtmp-testf5java.bytedance.com";
//        request.setDomain(testDomain);
        request.setAvailable(Boolean.TRUE);
        request.setExpiring(Boolean.FALSE);
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

    //done
    public void testDescribeCertDetailSecret() {
        LiveService liveService = getLiveService();
        DescribeCertDetailSecretRequest request = new DescribeCertDetailSecretRequest();
        String chainID = "ff5e0a71dd4842ac9d251f4531919f73";
        request.setChainID(chainID);
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

    public void testListVhostTransCodePreset() {
        LiveService liveService = getLiveService();
        ListVhostTransCodePresetRequest request = new ListVhostTransCodePresetRequest();
        try {
            ListVhostTransCodePresetResponse response = liveService.listVhostTransCodePreset(request);
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

    public void testListCommonTransPresetDetail() {
        LiveService liveService = getLiveService();
        ListCommonTransPresetDetailRequest request = new ListCommonTransPresetDetailRequest();
        try {
            ListCommonTransPresetDetailResponse response = liveService.listCommonTransPresetDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
