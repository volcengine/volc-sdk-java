package com.volcengine.service.live.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.live.LiveConfig;
import com.volcengine.service.live.LiveService;

import java.net.Proxy;
import java.util.ArrayList;


public class LiveServiceImpl extends BaseServiceImpl implements LiveService {

    private LiveServiceImpl() {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LiveConfig.apiInfoList);
    }

    private LiveServiceImpl(Proxy proxy) {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, LiveConfig.apiInfoList);
    }

    private LiveServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, LiveConfig.apiInfoList);
    }

    public static LiveService getInstance() {
        return new LiveServiceImpl();
    }

    public static LiveService getInstance(Proxy proxy) {
        return new LiveServiceImpl(proxy);
    }

    public static LiveService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LiveConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Live not support region " + region);
        }
        return new LiveServiceImpl(serviceInfo);
    }

    @Override
    public ListCommonTransPresetDetailResponse listCommonTransPresetDetail(ListCommonTransPresetDetailRequest listCommonTransPresetDetailRequest) throws Exception {
        RawResponse response = json(Const.ListCommonTransPresetDetail, new ArrayList<>(), JSON.toJSONString(listCommonTransPresetDetailRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListCommonTransPresetDetailResponse res = JSON.parseObject(response.getData(), ListCommonTransPresetDetailResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UpdateCallbackResponse updateCallback(UpdateCallbackRequest updateCallbackRequest) throws Exception {
        RawResponse response = json(Const.UpdateCallback, new ArrayList<>(), JSON.toJSONString(updateCallbackRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateCallbackResponse res = JSON.parseObject(response.getData(), UpdateCallbackResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeCallbackResponse describeCallback(DescribeCallbackRequest describeCallbackRequest) throws Exception {
        RawResponse response = json(Const.DescribeCallback, new ArrayList<>(), JSON.toJSONString(describeCallbackRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeCallbackResponse res = JSON.parseObject(response.getData(), DescribeCallbackResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DeleteCallbackRespose deleteCallback(DeleteCallbackRequest deleteCallbackRequest) throws Exception {
        RawResponse response = json(Const.DeleteCallback, new ArrayList<>(), JSON.toJSONString(deleteCallbackRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteCallbackRespose res = JSON.parseObject(response.getData(), DeleteCallbackRespose.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public CreateDomainResponse createDomain(CreateDomainRequest createDomainRequest) throws Exception {
        RawResponse response = json(Const.CreateDomain, new ArrayList<>(), JSON.toJSONString(createDomainRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateDomainResponse res = JSON.parseObject(response.getData(), CreateDomainResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest deleteDomainRequest) throws Exception {
        RawResponse response = json(Const.DeleteDomain, new ArrayList<>(), JSON.toJSONString(deleteDomainRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteDomainResponse res = JSON.parseObject(response.getData(), DeleteDomainResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ListDomainDetailResponse listDomainDetail(ListDomainDetailRequest listDomainDetailRequest) throws Exception {
        RawResponse response = json(Const.ListDomainDetail, new ArrayList<>(), JSON.toJSONString(listDomainDetailRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListDomainDetailResponse res = JSON.parseObject(response.getData(), ListDomainDetailResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeDomainResponse describeDomain(DescribeDomainRequest describeDomainRequest) throws Exception {
        RawResponse response = json(Const.DescribeDomain, new ArrayList<>(), JSON.toJSONString(describeDomainRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeDomainResponse res = JSON.parseObject(response.getData(), DescribeDomainResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public EnableDomainResponse enableDomain(EnableDomainRequest enableDomainRequest) throws Exception {
        RawResponse response = json(Const.EnableDomain, new ArrayList<>(), JSON.toJSONString(enableDomainRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        EnableDomainResponse res = JSON.parseObject(response.getData(), EnableDomainResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DisableDomainResponse disableDomain(DisableDomainRequest disableDomainRequest) throws Exception {
        RawResponse response = json(Const.DisableDomain, new ArrayList<>(), JSON.toJSONString(disableDomainRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DisableDomainResponse res = JSON.parseObject(response.getData(), DisableDomainResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ManagerPullPushDomainBindResponse managerPullPushDomainBind(ManagerPullPushDomainBindRequest managerPullPushDomainBindRequest) throws Exception {
        RawResponse response = json(Const.ManagerPullPushDomainBind, new ArrayList<>(), JSON.toJSONString(managerPullPushDomainBindRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ManagerPullPushDomainBindResponse res = JSON.parseObject(response.getData(), ManagerPullPushDomainBindResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UpdateAuthKeyResponse updateAuthKey(UpdateAuthKeyRequest updateAuthKeyRequest) throws Exception {
        RawResponse response = json(Const.UpdateAuthKey, new ArrayList<>(), JSON.toJSONString(updateAuthKeyRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateAuthKeyResponse res = JSON.parseObject(response.getData(), UpdateAuthKeyResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

//    @Override
//    public EnableAuthResponse enableAuth(EnableAuthRequest enableAuthRequest) throws Exception {
//        RawResponse response = json(Const.EnableAuth, new ArrayList<>(), JSON.toJSONString(enableAuthRequest));
//        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
//            throw response.getException();
//        }
//        EnableAuthResponse res = JSON.parseObject(response.getData(), EnableAuthResponse.class);
//        if (res.getResponseMetadata().getError() != null) {
//            ResponseMetadata meta = res.getResponseMetadata();
////            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
//        }
//        res.getResponseMetadata().setService("live");
//        return res;
//    }

//    @Override
//    public DisableAuthResponse disableAuth(DisableAuthRequest disableAuthRequest) throws Exception {
//        RawResponse response = json(Const.DisableAuth, new ArrayList<>(), JSON.toJSONString(disableAuthRequest));
//        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
//            throw response.getException();
//        }
//        DisableAuthResponse res = JSON.parseObject(response.getData(), DisableAuthResponse.class);
//        if (res.getResponseMetadata().getError() != null) {
//            ResponseMetadata meta = res.getResponseMetadata();
////            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
//        }
//        res.getResponseMetadata().setService("live");
//        return res;
//    }

    @Override
    public DescribeAuthResponse describeAuth(DescribeAuthRequest describeAuthRequest) throws Exception {
        RawResponse response = json(Const.DescribeAuth, new ArrayList<>(), JSON.toJSONString(describeAuthRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeAuthResponse res = JSON.parseObject(response.getData(), DescribeAuthResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }


    @Override
    public ForbidStreamResponse forbidStream(ForbidStreamRequest forbidStreamRequest) throws Exception {
        RawResponse response = json(Const.ForbidStream, new ArrayList<>(), JSON.toJSONString(forbidStreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ForbidStreamResponse res = JSON.parseObject(response.getData(), ForbidStreamResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ResumeStreamResponse resumeStream(ResumeStreamRequest resumeStreamRequest) throws Exception {
        RawResponse response = json(Const.ResumeStream, new ArrayList<>(), JSON.toJSONString(resumeStreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ResumeStreamResponse res = JSON.parseObject(response.getData(), ResumeStreamResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ListCertResponse listCert(ListCertRequest listCertRequest) throws Exception {
        RawResponse response = json(Const.ListCert, new ArrayList<>(), JSON.toJSONString(listCertRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListCertResponse res = JSON.parseObject(response.getData(), ListCertResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public CreateCertResponse createCert(CreateCertRequest createCertRequest) throws Exception {
        RawResponse response = json(Const.CreateCert, new ArrayList<>(), JSON.toJSONString(createCertRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateCertResponse res = JSON.parseObject(response.getData(), CreateCertResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

//    @Override
//    public DescribeCertDetailSecretResponse describeCertDetailSecret(DescribeCertDetailSecretRequest describeCertDetailSecretRequest) throws Exception {
//        RawResponse response = json(Const.DescribeCertDetailSecret, new ArrayList<>(), JSON.toJSONString(describeCertDetailSecretRequest));
//        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
//            throw response.getException();
//        }
//        DescribeCertDetailSecretResponse res = JSON.parseObject(response.getData(), DescribeCertDetailSecretResponse.class);
//        if (res.getResponseMetadata().getError() != null) {
//            ResponseMetadata meta = res.getResponseMetadata();
////            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
//        }
//        res.getResponseMetadata().setService("live");
//        return res;
//    }

    @Override
    public UpdateCertResponse updateCert(UpdateCertRequest updateCertRequest) throws Exception {
        RawResponse response = json(Const.UpdateCert, new ArrayList<>(), JSON.toJSONString(updateCertRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateCertResponse res = JSON.parseObject(response.getData(), UpdateCertResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public BindCertResponse bindCert(BindCertRequest bindCertRequest) throws Exception {
        RawResponse response = json(Const.BindCert, new ArrayList<>(), JSON.toJSONString(bindCertRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        BindCertResponse res = JSON.parseObject(response.getData(), BindCertResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UnbindCertResponse unbindCert(UnbindCertRequest unbindCertRequest) throws Exception {
        RawResponse response = json(Const.UnbindCert, new ArrayList<>(), JSON.toJSONString(unbindCertRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UnbindCertResponse res = JSON.parseObject(response.getData(), UnbindCertResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DeleteCertResponse deleteCert(DeleteCertRequest deleteCertRequest) throws Exception {
        RawResponse response = json(Const.DeleteCert, new ArrayList<>(), JSON.toJSONString(deleteCertRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteCertResponse res = JSON.parseObject(response.getData(), DeleteCertResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UpdateRefererResponse updateReferer(UpdateRefererRequest updateRefererRequest) throws Exception {
        RawResponse response = json(Const.UpdateReferer, new ArrayList<>(), JSON.toJSONString(updateRefererRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateRefererResponse res = JSON.parseObject(response.getData(), UpdateRefererResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DeleteRefererResponse deleteReferer(DeleteRefererRequest deleteRefererRequest) throws Exception {
        RawResponse response = json(Const.DeleteReferer, new ArrayList<>(), JSON.toJSONString(deleteRefererRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteRefererResponse res = JSON.parseObject(response.getData(), DeleteRefererResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeRefererResponse describeReferer(DescribeRefererRequest describeRefererRequest) throws Exception {
        RawResponse response = json(Const.DescribeReferer, new ArrayList<>(), JSON.toJSONString(describeRefererRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeRefererResponse res = JSON.parseObject(response.getData(), DescribeRefererResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public CreateRecordPresetResponse createRecordPreset(CreateRecordPresetRequest createRecordPresetRequest) throws Exception {
        RawResponse response = json(Const.CreateRecordPreset, new ArrayList<>(), JSON.toJSONString(createRecordPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateRecordPresetResponse res = JSON.parseObject(response.getData(), CreateRecordPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UpdateRecordPresetResponse updateRecordPreset(UpdateRecordPresetRequest updateRecordPresetRequest) throws Exception {
        RawResponse response = json(Const.UpdateRecordPreset, new ArrayList<>(), JSON.toJSONString(updateRecordPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateRecordPresetResponse res = JSON.parseObject(response.getData(), UpdateRecordPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }


    @Override
    public DeleteRecordPresetResponse deleteRecordPreset(DeleteRecordPresetRequest deleteRecordPresetRequest) throws Exception {
        RawResponse response = json(Const.DeleteRecordPreset, new ArrayList<>(), JSON.toJSONString(deleteRecordPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteRecordPresetResponse res = JSON.parseObject(response.getData(), DeleteRecordPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ListVhostRecordPresetResponse listVhostRecordPreset(ListVhostRecordPresetRequest listVhostRecordPresetRequest) throws Exception {
        RawResponse response = json(Const.ListVhostRecordPreset, new ArrayList<>(), JSON.toJSONString(listVhostRecordPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListVhostRecordPresetResponse res = JSON.parseObject(response.getData(), ListVhostRecordPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public CreateTranscodePresetResponse createTranscodePreset(CreateTranscodePresetRequest createTranscodePresetRequest) throws Exception {
        RawResponse response = json(Const.CreateTranscodePreset, new ArrayList<>(), JSON.toJSONString(createTranscodePresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateTranscodePresetResponse res = JSON.parseObject(response.getData(), CreateTranscodePresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UpdateTranscodePresetResponse updateTranscodePreset(UpdateTranscodePresetRequest updateTranscodePresetRequest) throws Exception {
        RawResponse response = json(Const.UpdateTranscodePreset, new ArrayList<>(), JSON.toJSONString(updateTranscodePresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateTranscodePresetResponse res = JSON.parseObject(response.getData(), UpdateTranscodePresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }


    @Override
    public DeleteTranscodePresetResponse deleteTranscodePreset(DeleteTranscodePresetRequest deleteTranscodePresetRequest) throws Exception {
        RawResponse response = json(Const.DeleteTranscodePreset, new ArrayList<>(), JSON.toJSONString(deleteTranscodePresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteTranscodePresetResponse res = JSON.parseObject(response.getData(), DeleteTranscodePresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ListVhostTransCodePresetResponse listVhostTransCodePreset(ListVhostTransCodePresetRequest listVhostTransCodePresetRequest) throws Exception {
        RawResponse response = json(Const.ListVhostTransCodePreset, new ArrayList<>(), JSON.toJSONString(listVhostTransCodePresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListVhostTransCodePresetResponse res = JSON.parseObject(response.getData(), ListVhostTransCodePresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public CreateSnapshotPresetResponse createSnapshotPreset(CreateSnapshotPresetRequest createSnapshotPresetRequest) throws Exception {
        RawResponse response = json(Const.CreateSnapshotPreset, new ArrayList<>(), JSON.toJSONString(createSnapshotPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateSnapshotPresetResponse res = JSON.parseObject(response.getData(), CreateSnapshotPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UpdateSnapshotPresetResponse updateSnapshotPreset(UpdateSnapshotPresetRequest updateSnapshotPresetRequest) throws Exception {
        RawResponse response = json(Const.UpdateSnapshotPreset, new ArrayList<>(), JSON.toJSONString(updateSnapshotPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateSnapshotPresetResponse res = JSON.parseObject(response.getData(), UpdateSnapshotPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DeleteSnapshotPresetResponse deleteSnapshotPreset(DeleteSnapshotPresetRequest deleteSnapshotPresetRequest) throws Exception {
        RawResponse response = json(Const.DeleteSnapshotPreset, new ArrayList<>(), JSON.toJSONString(deleteSnapshotPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteSnapshotPresetResponse res = JSON.parseObject(response.getData(), DeleteSnapshotPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ListVhostSnapshotPresetResponse listVhostSnapshotPreset(ListVhostSnapshotPresetRequest listVhostSnapshotPresetRequest) throws Exception {
        RawResponse response = json(Const.ListVhostSnapshotPreset, new ArrayList<>(), JSON.toJSONString(listVhostSnapshotPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListVhostSnapshotPresetResponse res = JSON.parseObject(response.getData(), ListVhostSnapshotPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveBandwidthDataResponse describeLiveBandwidthData(DescribeLiveBandwidthDataRequest describeLiveBandwidthDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveBandwidthData, new ArrayList<>(), JSON.toJSONString(describeLiveBandwidthDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveBandwidthDataResponse res = JSON.parseObject(response.getData(), DescribeLiveBandwidthDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveTrafficDataResponse describeLiveTrafficData(DescribeLiveTrafficDataRequest describeLiveTrafficDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveTrafficData, new ArrayList<>(), JSON.toJSONString(describeLiveTrafficDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveTrafficDataResponse res = JSON.parseObject(response.getData(), DescribeLiveTrafficDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveP95PeakBandwidthDataResponse describeLiveP95PeakBandwidthData(DescribeLiveP95PeakBandwidthDataRequest describeLiveP95PeakBandwidthDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveP95PeakBandwidthData, new ArrayList<>(), JSON.toJSONString(describeLiveP95PeakBandwidthDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveP95PeakBandwidthDataResponse res = JSON.parseObject(response.getData(), DescribeLiveP95PeakBandwidthDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeTranscodeDataResponse describeTranscodeData(DescribeTranscodeDataRequest describeTranscodeDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeTranscodeData, new ArrayList<>(), JSON.toJSONString(describeTranscodeDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeTranscodeDataResponse res = JSON.parseObject(response.getData(), DescribeTranscodeDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeSnapshotDataResponse describeSnapshotData(DescribeSnapshotDataRequest describeSnapshotDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeSnapshotData, new ArrayList<>(), JSON.toJSONString(describeSnapshotDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeSnapshotDataResponse res = JSON.parseObject(response.getData(), DescribeSnapshotDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeRecordDataResponse describeRecordData(DescribeRecordDataRequest describeRecordDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeRecordData, new ArrayList<>(), JSON.toJSONString(describeRecordDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeRecordDataResponse res = JSON.parseObject(response.getData(), DescribeRecordDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveTimeShiftDataResponse describeLiveTimeShiftData(DescribeLiveTimeShiftDataRequest describeLiveTimeShiftDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveTimeShiftData, new ArrayList<>(), JSON.toJSONString(describeLiveTimeShiftDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveTimeShiftDataResponse res = JSON.parseObject(response.getData(), DescribeLiveTimeShiftDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribePushStreamMetricsResponse describePushStreamMetrics(DescribePushStreamMetricsRequest describePushStreamMetricsRequest) throws Exception {
        RawResponse response = json(Const.DescribePushStreamMetrics, new ArrayList<>(), JSON.toJSONString(describePushStreamMetricsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribePushStreamMetricsResponse res = JSON.parseObject(response.getData(), DescribePushStreamMetricsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveStreamSessionsResponse describeLiveStreamSessions(DescribeLiveStreamSessionsRequest describeLiveStreamSessionsRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveStreamSessions, new ArrayList<>(), JSON.toJSONString(describeLiveStreamSessionsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveStreamSessionsResponse res = JSON.parseObject(response.getData(), DescribeLiveStreamSessionsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribePlayResponseStatusStatResponse describePlayResponseStatusStat(DescribePlayResponseStatusStatRequest describePlayResponseStatusStatRequest) throws Exception {
        RawResponse response = json(Const.DescribePlayResponseStatusStat, new ArrayList<>(), JSON.toJSONString(describePlayResponseStatusStatRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribePlayResponseStatusStatResponse res = JSON.parseObject(response.getData(), DescribePlayResponseStatusStatResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveDomainLogResponse describeLiveDomainLog(DescribeLiveDomainLogRequest describeLiveDomainLogRequest) throws Exception {
        RawResponse response = query(Const.DescribeLiveDomainLog, Utils.mapToPairList(Utils.paramsToMap(describeLiveDomainLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveDomainLogResponse res = JSON.parseObject(response.getData(), DescribeLiveDomainLogResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveMetricTrafficDataResponse describeLiveMetricTrafficData(DescribeLiveMetricTrafficDataRequest describeLiveMetricTrafficDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveMetricTrafficData, new ArrayList<>(), JSON.toJSONString(describeLiveMetricTrafficDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveMetricTrafficDataResponse res = JSON.parseObject(response.getData(), DescribeLiveMetricTrafficDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribeLiveMetricBandwidthDataResponse describeLiveMetricBandwidthData(DescribeLiveMetricBandwidthDataRequest describeLiveMetricBandwidthDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveMetricBandwidthData, new ArrayList<>(), JSON.toJSONString(describeLiveMetricBandwidthDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveMetricBandwidthDataResponse res = JSON.parseObject(response.getData(), DescribeLiveMetricBandwidthDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribePlayStreamListResponse describePlayStreamList(DescribePlayStreamListRequest describePlayStreamListRequest) throws Exception {
        RawResponse response = query(Const.DescribePlayStreamList, Utils.mapToPairList(Utils.paramsToMap(describePlayStreamListRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribePlayStreamListResponse res = JSON.parseObject(response.getData(), DescribePlayStreamListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DescribePullToPushBandwidthDataResponse describePullToPushBandwidthData(DescribePullToPushBandwidthDataRequest describePullToPushBandwidthDataRequest) throws Exception {
        RawResponse response = json(Const.DescribePullToPushBandwidthData, new ArrayList<>(), JSON.toJSONString(describePullToPushBandwidthDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribePullToPushBandwidthDataResponse res = JSON.parseObject(response.getData(), DescribePullToPushBandwidthDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public CreateSnapshotAuditPresetResponse createSnapshotAuditPreset(CreateSnapshotAuditPresetRequest createSnapshotAuditPresetRequest) throws Exception {
        RawResponse response = json(Const.CreateSnapshotAuditPreset, new ArrayList<>(), JSON.toJSONString(createSnapshotAuditPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateSnapshotAuditPresetResponse res = JSON.parseObject(response.getData(), CreateSnapshotAuditPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    public DescribeLiveAuditDataResponse describeLiveAuditData(DescribeLiveAuditDataRequest describeLiveAuditDataRequest) throws Exception {
        RawResponse response = json(Const.DescribeLiveAuditData, new ArrayList<>(), JSON.toJSONString(describeLiveAuditDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DescribeLiveAuditDataResponse res = JSON.parseObject(response.getData(), DescribeLiveAuditDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public UpdateSnapshotAuditPresetResponse updateSnapshotAuditPreset(UpdateSnapshotAuditPresetRequest updateSnapshotAuditPresetRequest) throws Exception {
        RawResponse response = json(Const.UpdateSnapshotAuditPreset, new ArrayList<>(), JSON.toJSONString(updateSnapshotAuditPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateSnapshotAuditPresetResponse res = JSON.parseObject(response.getData(), UpdateSnapshotAuditPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public DeleteSnapshotAuditPresetResponse deleteSnapshotAuditPreset(DeleteSnapshotAuditPresetRequest deleteSnapshotAuditPresetRequest) throws Exception {
        RawResponse response = json(Const.DeleteSnapshotAuditPreset, new ArrayList<>(), JSON.toJSONString(deleteSnapshotAuditPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteSnapshotAuditPresetResponse res = JSON.parseObject(response.getData(), DeleteSnapshotAuditPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

    @Override
    public ListVhostSnapshotAuditPresetResponse listVhostSnapshotAuditPreset(ListVhostSnapshotAuditPresetRequest listVhostSnapshotAuditPresetRequest) throws Exception {
        RawResponse response = json(Const.ListVhostSnapshotAuditPreset, new ArrayList<>(), JSON.toJSONString(listVhostSnapshotAuditPresetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListVhostSnapshotAuditPresetResponse res = JSON.parseObject(response.getData(), ListVhostSnapshotAuditPresetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
//            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage() + JSON.toJSONString(res));
        }
        res.getResponseMetadata().setService("live");
        return res;
    }

}
