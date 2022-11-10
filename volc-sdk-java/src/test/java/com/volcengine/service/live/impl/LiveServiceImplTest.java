package com.volcengine.service.live.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.live.CertRSAData;
import com.volcengine.model.live.RecordTob;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.ILiveService;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class LiveServiceImplTest extends TestCase {

    private final String accessKey = "";
    private final String secretKey = "";

    private ILiveService getLiveService() {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey(accessKey);
        liveService.setSecretKey(secretKey);
        return liveService;
    }

    public void testUpdateCallback() {
        ILiveService liveService = getLiveService();
        UpdateCallbackRequest request = new UpdateCallbackRequest();
        request.setMessageType("record");
        request.setDomain("domain");
        request.setVhost("vhost");
        CallbackDetail callbackDetail = new CallbackDetail();
        callbackDetail.setCallbackType("");
        callbackDetail.setURL("");
        request.setCallbackDetailList(new CallbackDetail[]{callbackDetail});
        try {
            UpdateCallbackResponse response = liveService.updateCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeCallback() {
        ILiveService liveService = getLiveService();
        DescribeCallbackRequest request = new DescribeCallbackRequest();
        request.setMessageType("");
        request.setDomain("");
        request.setApp("");
        try {
            DescribeCallbackResponse response = liveService.describeCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteCallback() {
        ILiveService liveService = getLiveService();
        DeleteCallbackRequest request = new DeleteCallbackRequest();
        request.setMessageType("record");
        request.setVhost("vhost");
        try {
            DeleteCallbackRespose response = liveService.deleteCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testCreateDomain() {
        ILiveService liveService = getLiveService();
        CreateDomainRequest request = new CreateDomainRequest();
        String testDomain = "";
//        String testDomain = "";

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
        ILiveService liveService = getLiveService();
        DeleteDomainRequest request = new DeleteDomainRequest();
        String testPushDomain = "";
        String testPullDomain = "";
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
        ILiveService liveService = getLiveService();
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
        ILiveService liveService = getLiveService();
        DescribeDomainRequest request = new DescribeDomainRequest();
        String testDomain = "";
        request.setDomainList(new String[]{""});
        try {
            DescribeDomainResponse response = liveService.describeDomain(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
    public void testDisableDomain() {
        ILiveService liveService = getLiveService();
        DisableDomainRequest request = new DisableDomainRequest();
        String testDomain = "";
        String testPullDomain = "";

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
        ILiveService liveService = getLiveService();
        EnableDomainRequest request = new EnableDomainRequest();
        String testDomain = "";
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
        ILiveService liveService = getLiveService();
        ManagerPullPushDomainBindRequest request = new ManagerPullPushDomainBindRequest();
        String testPushDomain = "";
        String testPullDomain = "";
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
        ILiveService liveService = getLiveService();
        UpdateAuthKeyRequest request = new UpdateAuthKeyRequest();
        String testDomain = "";
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
//    public void testEnableAuth() {
//        ILiveService liveService = getLiveService();
//        EnableAuthRequest request = new EnableAuthRequest();
//        String testDomain = "";
//        request.setDomain(testDomain);
//        request.setSceneType("push");
//        try {
//            EnableAuthResponse response = liveService.enableAuth(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    //done
//    public void testDisableAuth() {
//        ILiveService liveService = getLiveService();
//        DisableAuthRequest request = new DisableAuthRequest();
//        String testDomain = "";
//        request.setDomain(testDomain);
//        request.setSceneType("push");
//        try {
//            DisableAuthResponse response = liveService.disableAuth(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    //done
    public void testDescribeAuth() {
        ILiveService liveService = getLiveService();
        DescribeAuthRequest request = new DescribeAuthRequest();
        String testDomain = "";
        request.setDomain(testDomain);
        try {
            DescribeAuthResponse response = liveService.describeAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testForbidStream() {
        ILiveService liveService = getLiveService();
        ForbidStreamRequest request = new ForbidStreamRequest();
        String testDomain = "";
        request.setDomain(testDomain);
        request.setApp("123");
        request.setStream("123");
        try {
            ForbidStreamResponse response = liveService.forbidStream(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testResumeStream() {
        ILiveService liveService = getLiveService();
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
        ILiveService liveService = getLiveService();
        ListCertRequest request = new ListCertRequest();
        String testDomain = "push-rtmp-testf5java.bytedance.com";
        request.setDomain(testDomain);
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
        ILiveService liveService = getLiveService();
        CreateCertRequest request = new CreateCertRequest();
        request.setCertName("testCert");
        CertRSAData rsa = new CertRSAData();
        rsa.setPubKey("pubKey");
        rsa.setPriKey("priKey");
        request.setRsa(rsa);
        request.setUseWay("sign");
        try {
            CreateCertResponse response = liveService.createCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //done
//    public void testDescribeCertDetailSecret() {
//        ILiveService liveService = getLiveService();
//        DescribeCertDetailSecretRequest request = new DescribeCertDetailSecretRequest();
//        String chainID = "ff5e0a71dd4842ac9d251f4531919f73";
//        request.setChainID(chainID);
//        try {
//            DescribeCertDetailSecretResponse response = liveService.describeCertDetailSecret(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void testUpdateCert() {
        ILiveService liveService = getLiveService();
        UpdateCertRequest request = new UpdateCertRequest();
        CertRSAData rsa = new CertRSAData();
        rsa.setPubKey("pubKey");
        rsa.setPriKey("priKey");
        request.setRsa(rsa);
        request.setCertName("certName");
        request.setChainID("123");
        request.setUseWay("sign");
        System.out.println(JSON.toJSONString(request));
        try {
            UpdateCertResponse response = liveService.updateCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testBindCert() {
        ILiveService liveService = getLiveService();
        BindCertRequest request = new BindCertRequest();
        request.setDomain("domain");
        request.setChainID("chainID");
        request.setCertDomain("");
        try {
            BindCertResponse response = liveService.bindCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUnBindCert() {
        ILiveService liveService = getLiveService();
        UnbindCertRequest request = new UnbindCertRequest();
        request.setDomain("domain");
        try {
            UnbindCertResponse response = liveService.unbindCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteCert() {
        ILiveService liveService = getLiveService();
        DeleteCertRequest request = new DeleteCertRequest();
        request.setChainID("chainID");
        try {
            DeleteCertResponse response = liveService.deleteCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateReferer() {
        ILiveService liveService = getLiveService();
        UpdateRefererRequest request = new UpdateRefererRequest();
        request.setDomain("domain");
        request.setApp("app");
        UpdateRefererRequest.RefererInfo refererInfo1 = new UpdateRefererRequest.RefererInfo();
        refererInfo1.setKey("key1");
        refererInfo1.setType("type1");
        refererInfo1.setValue("value1");
        refererInfo1.setPriority(50L);
        UpdateRefererRequest.RefererInfo refererInfo2 = new UpdateRefererRequest.RefererInfo();
        refererInfo2.setKey("key2");
        refererInfo2.setType("type2");
        refererInfo2.setValue("value2");
        refererInfo2.setPriority(60L);
        request.setRefererInfoList(new UpdateRefererRequest.RefererInfo[]{refererInfo1, refererInfo2});
        try {
            UpdateRefererResponse response = liveService.updateReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteReferer() {
        ILiveService liveService = getLiveService();
        DeleteRefererRequest request = new DeleteRefererRequest();
        request.setVhost("vhost");
        request.setDomain("domain");
        request.setApp("app");
        try {
            DeleteRefererResponse response = liveService.deleteReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeReferer() {
        ILiveService liveService = getLiveService();
        DescribeRefererRequest request = new DescribeRefererRequest();
        request.setVhost("vhost");
        request.setDomain("domain");
        request.setApp("app");
        try {
            DescribeRefererResponse response = liveService.describeReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateRecordPreset() {
        ILiveService liveService = getLiveService();
        CreateRecordPresetRequest request = new CreateRecordPresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setBucket("bb");
        request.setStatus(1L);
        RecordTob recordTob1 = new RecordTob();
        recordTob1.setDuration(100L);
        recordTob1.setFormat("hls");
        recordTob1.setSplice(-1L);
        recordTob1.setRecordObject("/xx/xx");
        request.setRecordTob(new RecordTob[]{recordTob1});
        try {
            CreateRecordPresetResponse response = liveService.createRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateRecordPreset() {
        ILiveService liveService = getLiveService();
        UpdateRecordPresetRequest request = new UpdateRecordPresetRequest();
        request.setPreset("preset1");
        request.setVhost("vhost");
        request.setApp("app");
        request.setStatus(1L);
        request.setBucket("bb");
        RecordTob recordTob1 = new RecordTob();
        recordTob1.setDuration(100L);
        recordTob1.setFormat("hls");
        recordTob1.setSplice(-1L);
        recordTob1.setRecordObject("/xx/xx");
        request.setRecordTob(new RecordTob[]{recordTob1});
        try {
            UpdateRecordPresetResponse response = liveService.updateRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testDeleteRecordPreset() {
        ILiveService liveService = getLiveService();
        DeleteRecordPresetRequest request = new DeleteRecordPresetRequest();
        request.setVhost("vhost");
        request.setPreset("preset");
        request.setApp("app");
        try {
            DeleteRecordPresetResponse response = liveService.deleteRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListVhostRecordPreset() {
        ILiveService liveService = getLiveService();
        ListVhostRecordPresetRequest request = new ListVhostRecordPresetRequest();
        request.setVhost("vhost");
        try {
            ListVhostRecordPresetResponse response = liveService.listVhostRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateTranscodePreset() {
        ILiveService liveService = getLiveService();
        CreateTranscodePresetRequest request = new CreateTranscodePresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setStatus(1L);
        request.setSuffixName("");
        request.setPreset("preset");
        request.setFPS(30L);
        try {
            CreateTranscodePresetResponse response = liveService.createTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateTranscodePreset() {
        ILiveService liveService = getLiveService();
        UpdateTranscodePresetRequest request = new UpdateTranscodePresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setPreset("preset");
        try {
            UpdateTranscodePresetResponse response = liveService.updateTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testDeleteTranscodePreset() {
        ILiveService liveService = getLiveService();
        DeleteTranscodePresetRequest request = new DeleteTranscodePresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setPreset("preset");
        try {
            DeleteTranscodePresetResponse response = liveService.deleteTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListVhostTransCodePreset() {
        ILiveService liveService = getLiveService();
        ListVhostTransCodePresetRequest request = new ListVhostTransCodePresetRequest();
        request.setVhost("vhost");
        try {
            ListVhostTransCodePresetResponse response = liveService.listVhostTransCodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListCommonTransPresetDetail() {
        ILiveService liveService = getLiveService();
        ListCommonTransPresetDetailRequest request = new ListCommonTransPresetDetailRequest();
        request.setPresetList(new String[]{"Preset1", "Preset1"});
        try {
            ListCommonTransPresetDetailResponse response = liveService.listCommonTransPresetDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateSnapshotPreset() {
        ILiveService liveService = getLiveService();
        CreateSnapshotPresetRequest request = new CreateSnapshotPresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setStatus(1L);
        request.setInterval(5L);
        request.setBucket("bb");
        request.setSnapshotFormat("");
        request.setSnapshotObject("");
        request.setStorageDir("/xx");
        try {
            CreateSnapshotPresetResponse response = liveService.createSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateSnapshotPreset() {
        ILiveService liveService = getLiveService();
        UpdateSnapshotPresetRequest request = new UpdateSnapshotPresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setStatus(1L);
        request.setInterval(5L);
        request.setBucket("bb");
        request.setSnapshotFormat("");
        request.setSnapshotObject("");
        request.setStorageDir("/xx");
        try {
            UpdateSnapshotPresetResponse response = liveService.updateSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteSnapshotPreset() {
        ILiveService liveService = getLiveService();
        DeleteSnapshotPresetRequest request = new DeleteSnapshotPresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setPreset("preset");
        try {
            DeleteSnapshotPresetResponse response = liveService.deleteSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListVhostSnapshotPreset() {
        ILiveService liveService = getLiveService();
        ListVhostSnapshotPresetRequest request = new ListVhostSnapshotPresetRequest();
        request.setVhost("vhost");
        try {
            ListVhostSnapshotPresetResponse response = liveService.listVhostSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testDescribeLiveBandwidthData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\": [\"domain\"],\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00Z\",\n" +
                "    \"Aggregation\": 300\n" +
                "}";
        DescribeLiveBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribeLiveBandwidthDataRequest.class);

        try {
            DescribeLiveBandwidthDataResponse response = liveService.describeLiveBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeLiveTrafficData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\": [],\n" +
                "    \"StartTime\": \"2022-04-25T00:00:00Z\",\n" +
                "    \"EndTime\":\"2022-04-25T23:59:00Z\",\n" +
                "    \"Aggregation\":300\n" +
                "}";
        DescribeLiveTrafficDataRequest request = JSON.parseObject(jsonStr, DescribeLiveTrafficDataRequest.class);
        try {
            DescribeLiveTrafficDataResponse response = liveService.describeLiveTrafficData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeLiveP95PeakBandwidthData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00Z\",\n" +
                "    \"Aggregation\": 300\n" +
                "}";
        DescribeLiveP95PeakBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribeLiveP95PeakBandwidthDataRequest.class);
        try {
            DescribeLiveP95PeakBandwidthDataResponse response = liveService.describeLiveP95PeakBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeTranscodeData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\":[\"example.com\",\"example2.com\"],\n" +
                "    \"StartTime\": \"2022-03-07T00:00:00+08:00\",\n" +
                "    \"EndTime\":\"2022-03-08T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 86400\n" +
                "}";
        DescribeTranscodeDataRequest request = JSON.parseObject(jsonStr, DescribeTranscodeDataRequest.class);
        try {
            DescribeTranscodeDataResponse response = liveService.describeTranscodeData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeSnapshotData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\":[\"example.com\",\"example2.com\"],\n" +
                "    \"StartTime\": \"2022-03-07T00:00:00+08:00\",\n" +
                "    \"EndTime\":\"2022-03-08T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 86400\n" +
                "}";
        DescribeSnapshotDataRequest request = JSON.parseObject(jsonStr, DescribeSnapshotDataRequest.class);
        try {
            DescribeSnapshotDataResponse response = liveService.describeSnapshotData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeRecordData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-04-13T00:10:00Z\",\n" +
                "    \"Aggregation\": 300\n" +
                "}";
        DescribeRecordDataRequest request = JSON.parseObject(jsonStr, DescribeRecordDataRequest.class);
        try {
            DescribeRecordDataResponse response = liveService.describeRecordData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeLiveTimeShiftData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Aggregation\": 86400,\n" +
                "    \"EndTime\": \"2022-02-17T23:59:59+08:00\",\n" +
                "    \"StartTime\": \"2022-02-11T00:00:00+08:00\",\n" +
                "    \"Vhosts\": [\"www.example.com\"]\n" +
                "}";
        DescribeLiveTimeShiftDataRequest request = JSON.parseObject(jsonStr, DescribeLiveTimeShiftDataRequest.class);
        try {
            DescribeLiveTimeShiftDataResponse response = liveService.describeLiveTimeShiftData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribePushStreamMetrics() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Domain\": \"example.com\",\n" +
                "    \"App\": \"example_app\",\n" +
                "    \"Stream\": \"example_stream\",\n" +
                "    \"StartTime\": \"2021-08-16T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-08-16T00:01:59Z\",\n" +
                "    \"Aggregation\": 30\n" +
                "}";
        DescribePushStreamMetricsRequest request = JSON.parseObject(jsonStr, DescribePushStreamMetricsRequest.class);
        try {
            DescribePushStreamMetricsResponse response = liveService.describePushStreamMetrics(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeLiveStreamSessions() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\":[\"example.com\",\"example2.com\"],\n" +
                "    \"App\": \"example\",\n" +
                "    \"Stream\": \"example080601\",\n" +
                "    \"ProtocolList\": [\"RTMP\", \"HTTP-FLV\"],\n" +
                "    \"StartTime\": \"2021-08-16T00:00:00Z\",\n" +
                "    \"EndTime\":\"2021-08-16T23:59:59Z\",\n" +
                "    \"Aggregation\":60\n" +
                "}";
        DescribeLiveStreamSessionsRequest request = JSON.parseObject(jsonStr, DescribeLiveStreamSessionsRequest.class);
        try {
            DescribeLiveStreamSessionsResponse response = liveService.describeLiveStreamSessions(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribePlayResponseStatusStat() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\":[\"example.com\",\"example2.com\"],\n" +
                "    \"StartTime\": \"2022-04-19T00:00:00Z\",\n" +
                "    \"EndTime\": \"2022-04-19T00:01:59Z\",\n" +
                "    \"Aggregation\": 60\n" +
                "}";
        DescribePlayResponseStatusStatRequest request = JSON.parseObject(jsonStr, DescribePlayResponseStatusStatRequest.class);
        try {
            DescribePlayResponseStatusStatResponse response = liveService.describePlayResponseStatusStat(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeLiveDomainLog() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Domain\":\"example.com\",\n" +
                "    \"StartTime\": \"2022-04-19T00:00:00Z\",\n" +
                "    \"EndTime\": \"2022-04-19T00:01:59Z\",\n" +
                "}";
        DescribeLiveDomainLogRequest request = JSON.parseObject(jsonStr, DescribeLiveDomainLogRequest.class);
        try {
            DescribeLiveDomainLogResponse response = liveService.describeLiveDomainLog(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeLiveMetricTrafficData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\"],\n" +
                "    \"ProtocolList\": [\"HTTP-FLV\", \"RTMP\"],\n" +
                "    \"ISPList\": [\"telecom\"],\n" +
                "    \"IPList\": [\"123.123.123.000\"],\n" +
                "    \"RegionList\": [\n" +
                "        {\n" +
                "            \"Area\": \"cn\",\n" +
                "            \"Country\": \"cn\",\n" +
                "            \"Province\": \"beijing\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 300,\n" +
                "    \"ShowDetail\": true\n" +
                "}";
        DescribeLiveMetricTrafficDataRequest request = JSON.parseObject(jsonStr, DescribeLiveMetricTrafficDataRequest.class);
        try {
            DescribeLiveMetricTrafficDataResponse response = liveService.describeLiveMetricTrafficData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribeLiveMetricBandwidthData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\"],\n" +
                "    \"ProtocolList\": [\"HTTP-FLV\", \"RTMP\"],\n" +
                "    \"ISPList\": [\"telecom\"],\n" +
                "    \"IPList\": [\"123.123.123.000\"],\n" +
                "    \"RegionList\": [\n" +
                "        {\n" +
                "            \"Area\": \"cn\",\n" +
                "            \"Country\": \"cn\",\n" +
                "            \"Province\": \"beijing\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 300,\n" +
                "    \"ShowDetail\": true\n" +
                "}";
        DescribeLiveMetricBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribeLiveMetricBandwidthDataRequest.class);
        try {
            DescribeLiveMetricBandwidthDataResponse response = liveService.describeLiveMetricBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDescribePlayStreamList() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Domain\":\"example.com\",\n" +
                "    \"StartTime\": \"2022-04-19T00:00:00Z\",\n" +
                "    \"EndTime\": \"2022-04-19T00:01:59Z\",\n" +
                "}";
        DescribePlayStreamListRequest request = JSON.parseObject(jsonStr, DescribePlayStreamListRequest.class);
        try {
            DescribePlayStreamListResponse response = liveService.describePlayStreamList(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testDescribePullToPushBandwidthData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\"],\n" +
                "    \"DstAddrTypeList\": [\"live\",\"Third\"],\n" +
                "    \"StartTime\": \"2022-06-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2022-06-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 300,\n" +
                "    \"ShowDetail\": true\n" +
                "}";
        DescribePullToPushBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribePullToPushBandwidthDataRequest.class);
        try {
            DescribePullToPushBandwidthDataResponse response = liveService.describePullToPushBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreateSnapshotAuditPreset() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Vhost\": \"vhost\",\n" +
                "    \"App\": \"app\",\n" +
                "    \"Interval\": 7.8,\n" +
                "    \"Bucket\": \"bucket\",\n" +
                "    \"StorageStrategy\": 1,\n" +
                "    \"CallbackDetailList\": [{\"URL\": \"http://xx\", \"CallbackType\": \"http\"}],\n" +
                "    \"Label\": [\"301\"]\n" +
                "}";
        CreateSnapshotAuditPresetRequest request = JSON.parseObject(jsonStr, CreateSnapshotAuditPresetRequest.class);
        try {
            CreateSnapshotAuditPresetResponse response = liveService.createSnapshotAuditPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testUpdateSnapshotAuditPreset() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Vhost\": \"vhost\",\n" +
                "    \"App\": \"app\",\n" +
                "    \"Interval\": 8.8,\n" +
                "    \"PresetName\": \"presetName\"\n" +
                "}";
        UpdateSnapshotAuditPresetRequest request = JSON.parseObject(jsonStr, UpdateSnapshotAuditPresetRequest.class);
        try {
            UpdateSnapshotAuditPresetResponse response = liveService.updateSnapshotAuditPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteSnapshotAuditPreset() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Vhost\": \"vhost\",\n" +
                "    \"App\": \"app\",\n" +
                "    \"PresetName\": \"presetName\"\n" +
                "}";
        DeleteSnapshotAuditPresetRequest request = JSON.parseObject(jsonStr, DeleteSnapshotAuditPresetRequest.class);
        try {
            DeleteSnapshotAuditPresetResponse response = liveService.deleteSnapshotAuditPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testListVhostSnapshotAuditPreset() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"Vhost\": \"vhost\"\n" +
                "}";
        ListVhostSnapshotAuditPresetRequest request = JSON.parseObject(jsonStr, ListVhostSnapshotAuditPresetRequest.class);
        try {
            ListVhostSnapshotAuditPresetResponse response = liveService.listVhostSnapshotAuditPreset(request);
             System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    public void testDescribeLiveAuditData() {
        ILiveService liveService = getLiveService();
        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\", \"example2.com\"],\n" +
                "    \"DetailField\": [\"Domain\"],\n" +
                "    \"StartTime\": \"2022-07-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2022-07-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 86400\n" +
                "}";
        DescribeLiveAuditDataRequest request = JSON.parseObject(jsonStr, DescribeLiveAuditDataRequest.class);
        try {
            DescribeLiveAuditDataResponse response = liveService.describeLiveAuditData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
