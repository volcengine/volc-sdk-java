package com.volcengine.service.live.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.live.CertRSAData;
import com.volcengine.model.live.RecordTob;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveServiceImplTest extends TestCase {

    private final String accessKey = "";
    private final String secretKey = "";

    private LiveService getLiveService() {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey(accessKey);
        liveService.setSecretKey(secretKey);
        return liveService;
    }

    public void testUpdateCallback() {
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
//        LiveService liveService = getLiveService();
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
//        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
//        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
        LiveService liveService = getLiveService();
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
