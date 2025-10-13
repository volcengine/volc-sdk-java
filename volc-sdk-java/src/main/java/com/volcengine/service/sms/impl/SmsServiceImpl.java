package com.volcengine.service.sms.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.request.*;
import com.volcengine.model.request.sms.*;
import com.volcengine.model.response.*;
import com.volcengine.model.response.sms.*;
import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.sms.SmsConfig;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfo;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.util.ConvertUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class SmsServiceImpl extends BaseServiceImpl implements SmsService {

    //用户多账户时使用
    private static final ConcurrentHashMap<String, SmsService> instanceMap = new ConcurrentHashMap<>();

    public static final String SourceTypeText = "text/string";

    public static final String DefaultErrorCode = "-1";
    public static final String DefaultErrorMsg = "未知错误";

    private final static Log log = LogFactory.getLog(SmsServiceImpl.class);


    private SmsServiceImpl() {
        super(SmsConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), SmsConfig.apiInfoList);
    }

    private SmsServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, SmsConfig.apiInfoList);
    }

    private SmsServiceImpl(HttpHost proxy) {
        super(SmsConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, SmsConfig.apiInfoList);
    }

    private SmsServiceImpl(ServiceInfo serviceInfo, HttpHost proxy) {
        super(serviceInfo, proxy, SmsConfig.apiInfoList);
    }

    /**
     * 此方法不是单例，使用的时候需要注意
     *
     * @return
     */

    @Deprecated
    public static SmsService getInstance() {
        return new SmsServiceImpl();
    }


    public static SmsService getInstance(SmsServiceInfoConfig config) {
        String key = config.getAccessKey();
        if (instanceMap.get(key) == null) {
            ServiceInfo serviceInfo = new SmsServiceInfo(config).GetServiceInfo();
            synchronized (instanceMap) {
                if (instanceMap.get(key) == null) {
                    if (config.getProxy() == null) {
                        SmsService smsService = new SmsServiceImpl(serviceInfo);
                        instanceMap.putIfAbsent(key, smsService);
                    } else {
                        SmsService smsService = new SmsServiceImpl(serviceInfo, config.getProxy());
                        instanceMap.putIfAbsent(key, smsService);
                    }

                }
            }
        }
        return instanceMap.get(key);
    }


    @Deprecated
    public static SmsService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = SmsConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new SmsServiceImpl(serviceInfo);
    }


    @Deprecated
    public static SmsService getInstance(HttpHost proxy) {
        return new SmsServiceImpl(proxy);
    }

    // low-level，需要用户自己定义serviceInfo
    public static SmsService newSmsService(ServiceInfo serviceInfo) throws Exception {
        if (serviceInfo == null) {
            throw new Exception("ServiceInfo is null");
        }
        return new SmsServiceImpl(serviceInfo);
    }

    @Override
    public SmsSendResponse send(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponse(response);
    }

    @Override
    public SmsSendResponse sendV2(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponseV2(response);
    }

    @Override
    public SmsSendResponse sendStandard(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponseStandard(response);
    }


    @Override
    public SmsSendResponse sendVms(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponseV2(response);
    }

    @Override
    public SmsSendResponse batchSend(SmsBatchSendRequest smsBatchSendRequest) throws Exception {
        RawResponse response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        }
        return getSmsSendResponse(response);
    }


    @Override
    public SmsSendResponse batchSendV2(SmsBatchSendRequest smsBatchSendRequest) throws Exception {
        RawResponse response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        }
        return getSmsSendResponseV2(response);
    }

    @Override
    public SmsSendResponse sendVerifyCode(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception {
        RawResponse response =
                json("SendSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsSendVerifyCodeRequest));
        return getSmsSendResponse(response);
    }

    @Override
    public SmsSendResponse sendVerifyCodeV2(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception {
        RawResponse response = json("SendSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsSendVerifyCodeRequest));
        return getSmsSendResponseV2(response);
    }

    @Override
    public SmsCheckVerifyCodeResponse checkVerifyCode(SmsCheckVerifyCodeRequest smsCheckVerifyCodeRequest)
            throws Exception {
        RawResponse response =
                json("CheckSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsCheckVerifyCodeRequest));
        return getSmsCheckResponse(response);
    }

    @Override
    public ConversionResponse conversion(ConversionRequest conversionRequest) throws Exception {
        RawResponse response = json("Conversion", new ArrayList<>(), JSON.toJSONString(conversionRequest));
        return getConversionResponse(response);
    }

    @Override
    public GetSubAccountListResponse getSubAccountList(GetSubAccountListRequest getSubAccountListRequest)
            throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(getSubAccountListRequest);
        RawResponse response = json("GetSubAccountList", urlParams, "");
        return getSubAccountListResponse(response);
    }

    @Override
    public EditMultiReplyConfigResponse editMultiReplyConfig(EditMultiReplyConfigRequest request) throws Exception {
        RawResponse response = json("EditMultiReplyConfig", new ArrayList<>(), JSON.toJSONString(request));
        return editMultiReplyConfigResponse(response);
    }

    @Override
    public GetRelyConfigResponse getRelyConfig(GetRelyConfigRequest request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(request);
        RawResponse response = json("GetRelyConfig", urlParams, "");
        return getRelyConfigResponse(response);
    }

    @Override
    public InsertSubAccountResponse insertSubAccount(InsertSubAccountRequest request) throws Exception {
        RawResponse response = json("InsertSubAccount", new ArrayList<>(), JSON.toJSONString(request));
        return insertSubAccountResponse(response);
    }

    @Override
    public GetSubAccountDetailResponse getSubAccountDetail(SubAccountRequest subAccountRequest) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(subAccountRequest);
        RawResponse response = json("GetSubAccountDetail", urlParams, "");
        return getSubAccountDetailResponse(response);
    }

    @Override
    public GetSmsTemplateAndOrderListResponse getSmsTemplateAndOrderList(
            GetSmsTemplateAndOrderListRequest getSmsTemplateAndOrderListRequest) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(getSmsTemplateAndOrderListRequest);
        RawResponse response = json("GetSmsTemplateAndOrderList", urlParams, "");
        return getSmsTemplateAndOrderListResponse(response);
    }

    @Override
    public ApplySmsTemplateResponse applySmsTemplate(ApplySmsTemplateRequest applySmsTemplateRequest) throws Exception {
        RawResponse response = json("ApplySmsTemplate", new ArrayList<>(), JSON.toJSONString(applySmsTemplateRequest));
        return applySmsTemplateResponse(response);
    }

    @Override
    public ApplyVmsTemplateResponse ApplyVmsTemplate(ApplyVmsTemplateRequest req) throws Exception {
        if (req.getContents() == null || req.getContents().size() == 0) {
            throw new Exception("should contain contents");
        }
        boolean containText = isContainText(req);
        if (!containText) {
            throw new Exception("should contain text in contents");
        }
        if (StringUtils.isBlank(req.getChannelType())) {
            req.setChannelType("CN_VMS");
        }
        RawResponse response = json("ApplyVmsTemplate", new ArrayList<>(), JSON.toJSONString(req));
        return applyVmsTemplateResponse(response);
    }

    private static boolean isContainText(ApplyVmsTemplateRequest req) {
        boolean containText = false;
        for (VmsElement element : req.getContents()) {
            if (element.getSourceType() == SourceTypeText) {
                containText = true;
            }
        }
        return containText;
    }

    @Override
    public GetVmsTemplateResponse GetVmsTemplateStatus(GetVmsTemplateStatusRequest req) throws Exception {
        RawResponse response = json("GetVmsTemplateStatus", new ArrayList<>(), JSON.toJSONString(req));
        return getVmsTemplateResponse(response);
    }


    @Override
    public DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest deleteSmsTemplateRequest)
            throws Exception {
        RawResponse response =
                json("DeleteSmsTemplate", new ArrayList<>(), JSON.toJSONString(deleteSmsTemplateRequest));
        return deleteSmsTemplateResponse(response);
    }

    @Override
    public GetSignatureAndOrderListResponse getSmsSignatureAndOrderList(
            GetSignatureAndOrderListRequest getSignatureAndOrderListRequest) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPairV2(getSignatureAndOrderListRequest);
        RawResponse response = json("GetSignatureAndOrderList", urlParams, "");
        return getSignatureAndOrderListResponse(response);
    }

    @Override
    public ApplySmsSignatureResponse applySmsSignature(ApplySmsSignatureRequest applySmsSignatureRequest)
            throws Exception {
        RawResponse response =
                json("ApplySmsSignature", new ArrayList<>(), JSON.toJSONString(applySmsSignatureRequest));
        return applySmsSignatureResponse(response);
    }

    @Override
    public ApplySmsSignatureResponse applySmsSignatureV2(ApplySmsSignatureV2Request applySmsSignatureV2Request)
            throws Exception {
        RawResponse response =
                json("ApplySmsSignatureV2", new ArrayList<>(), JSON.toJSONString(applySmsSignatureV2Request));
        return applySmsSignatureResponse(response);
    }

    @Override
    public UpdateSmsSignatureResponse updateSmsSignature(UpdateSmsSignatureRequest updateSmsSignatureRequest) throws Exception {
        RawResponse response =
                json("UpdateSmsSignature", new ArrayList<>(), JSON.toJSONString(updateSmsSignatureRequest));
        return updateSmsSignatureResponse(response);
    }

    @Override
    public DeleteSignatureResponse deleteSmsSignature(DeleteSignatureRequest deleteSignatureRequest) throws Exception {
        deleteSignatureRequest.setOrder(true);
        RawResponse response = json("DeleteSignature", new ArrayList<>(), JSON.toJSONString(deleteSignatureRequest));
        return deleteSignatureResponse(response);
    }

    @Deprecated
    @Override
    public GetSendStatResponse getSendStat(GetSendStatRequest getSendStatRequest) throws Exception {
        RawResponse response = json("GetTotalSendCountStatV5", new ArrayList<>(), JSON.toJSONString(getSendStatRequest));
        return getGetSendStatResponse(response);
    }

    @Override
    public GetSmsSendDetailsResponse getSmsSendDetails(GetSmsSendDetailsRequest getSmsSendDetailsRequest) throws Exception {
        RawResponse response = json("GetSmsSendDetails", new ArrayList<>(), JSON.toJSONString(getSmsSendDetailsRequest));
        return getSmsSendDetailsResponse(response);
    }


    private SmsSendResponse getSmsSendResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SmsSendResponse res = JSON.parseObject(response.getData(), SmsSendResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private SmsSendResponse getSmsSendResponseV2(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            if (response.getException() != null) {
                return new SmsSendResponse(String.valueOf(response.getCode()), response.getVerboseExceptionMessage());
            }
            return new SmsSendResponse(String.valueOf(response.getCode()), Arrays.toString(response.getData()));
        }
        SmsSendResponse res = JSON.parseObject(response.getData(), SmsSendResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            return new SmsSendResponse(meta.getError().getCode(), meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSendStatResponse getGetSendStatResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            if (response.getException() != null) {
                return new GetSendStatResponse(DefaultErrorCode, response.getException().getMessage());
            }
            return new GetSendStatResponse(String.valueOf(response.getCode()), Arrays.toString(response.getData()));
        }
        GetSendStatResponse res = JSON.parseObject(response.getData(), GetSendStatResponse.class);
        if (res == null) {
            return new GetSendStatResponse(DefaultErrorCode, DefaultErrorMsg);
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }


    private SmsSendResponse getSmsSendResponseStandard(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            if (response.getException() != null) {
                return new SmsSendResponse(DefaultErrorCode, response.getException().getMessage());
            }
            return new SmsSendResponse(String.valueOf(response.getCode()), Arrays.toString(response.getData()));
        }
        SmsSendResponse res = JSON.parseObject(response.getData(), SmsSendResponse.class);
        if (res == null) {
            return new SmsSendResponse(DefaultErrorCode, DefaultErrorMsg);
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private static ResponseMetadata GetResponseData(String code, String msg) {
        ResponseMetadata resp = new ResponseMetadata();
        ResponseMetadata.Error defaultErr = new ResponseMetadata.Error();
        defaultErr.setMessage(msg);
        defaultErr.setCode(code);
        resp.setError(defaultErr);
        return resp;
    }

    private SmsCheckVerifyCodeResponse getSmsCheckResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SmsCheckVerifyCodeResponse res = JSON.parseObject(response.getData(), SmsCheckVerifyCodeResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ConversionResponse getConversionResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ConversionResponse res = JSON.parseObject(response.getData(), ConversionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSubAccountListResponse getSubAccountListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSubAccountListResponse res = JSON.parseObject(response.getData(), GetSubAccountListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSubAccountDetailResponse getSubAccountDetailResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSubAccountDetailResponse res = JSON.parseObject(response.getData(), GetSubAccountDetailResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSmsTemplateAndOrderListResponse getSmsTemplateAndOrderListResponse(RawResponse response)
            throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSmsTemplateAndOrderListResponse res =
                JSON.parseObject(response.getData(), GetSmsTemplateAndOrderListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ApplySmsTemplateResponse applySmsTemplateResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplySmsTemplateResponse res = JSON.parseObject(response.getData(), ApplySmsTemplateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ApplyVmsTemplateResponse applyVmsTemplateResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplyVmsTemplateResponse res = JSON.parseObject(response.getData(), ApplyVmsTemplateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetVmsTemplateResponse getVmsTemplateResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVmsTemplateResponse res = JSON.parseObject(response.getData(), GetVmsTemplateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private DeleteSmsTemplateResponse deleteSmsTemplateResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteSmsTemplateResponse res = JSON.parseObject(response.getData(), DeleteSmsTemplateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSignatureAndOrderListResponse getSignatureAndOrderListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSignatureAndOrderListResponse res =
                JSON.parseObject(response.getData(), GetSignatureAndOrderListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ApplySmsSignatureResponse applySmsSignatureResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplySmsSignatureResponse res = JSON.parseObject(response.getData(), ApplySmsSignatureResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private UpdateSmsSignatureResponse updateSmsSignatureResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateSmsSignatureResponse res = JSON.parseObject(response.getData(), UpdateSmsSignatureResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private DeleteSignatureResponse deleteSignatureResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteSignatureResponse res = JSON.parseObject(response.getData(), DeleteSignatureResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private EditMultiReplyConfigResponse editMultiReplyConfigResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        EditMultiReplyConfigResponse res = JSON.parseObject(response.getData(), EditMultiReplyConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private InsertSubAccountResponse insertSubAccountResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        InsertSubAccountResponse res = JSON.parseObject(response.getData(), InsertSubAccountResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetRelyConfigResponse getRelyConfigResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetRelyConfigResponse res = JSON.parseObject(response.getData(), GetRelyConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }


    private GetSmsSendDetailsResponse getSmsSendDetailsResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSmsSendDetailsResponse res = JSON.parseObject(response.getData(), GetSmsSendDetailsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }


    @Override
    public ApplySignatureIdentResponse applySignatureIdent(ApplySignatureIdentRequest applySignatureIdentRequest) throws Exception {
        RawResponse response =
                json("ApplySignatureIdent", new ArrayList<>(), JSON.toJSONString(applySignatureIdentRequest));
        return applySignatureIdentResponse(response);
    }

    @Override
    public UpdateSignatureIdentResponse updateSignatureIdent(UpdateSignatureIdentRequest updateSignatureIdentRequest) throws Exception {
        RawResponse response =
                json("UpdateSignatureIdent", new ArrayList<>(), JSON.toJSONString(updateSignatureIdentRequest));
        return updateSignatureIdent(response);
    }

    public UpdateSignatureIdentResponse updateSignatureIdent(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateSignatureIdentResponse res = JSON.parseObject(response.getData(), UpdateSignatureIdentResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    public ApplySignatureIdentResponse applySignatureIdentResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplySignatureIdentResponse res = JSON.parseObject(response.getData(), ApplySignatureIdentResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public GetSignatureIdentListResponse getSignatureIdentList(GetSignatureIdentListRequest getSignatureIdentListRequest) throws Exception {
        RawResponse response =
                json("GetSignatureIdentList", new ArrayList<>(), JSON.toJSONString(getSignatureIdentListRequest));
        return getSignatureIdentListResponse(response);
    }

    public GetSignatureIdentListResponse getSignatureIdentListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSignatureIdentListResponse res = JSON.parseObject(response.getData(), GetSignatureIdentListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public BatchBindSignatureIdentResponse batchBindSignatureIdent(BatchBindSignatureIdentRequest batchBindSignatureIdentRequest) throws Exception {
        RawResponse response =
                json("BatchBindSignatureIdent", new ArrayList<>(), JSON.toJSONString(batchBindSignatureIdentRequest));
        return batchBindSignatureIdentResponse(response);
    }

    public BatchBindSignatureIdentResponse batchBindSignatureIdentResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        BatchBindSignatureIdentResponse res = JSON.parseObject(response.getData(), BatchBindSignatureIdentResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public BulkCreateTobTrafficDrivingLinkResponse bulkCreateTobTrafficDrivingLink(BulkCreateTobTrafficDrivingLinkRequest request) throws Exception {
        RawResponse response = json("BulkCreateTobTrafficDrivingLink", new ArrayList<>(), JSON.toJSONString(request));
        return bulkCreateTobTrafficDrivingLinkResponse(response);
    }

    public BulkCreateTobTrafficDrivingLinkResponse bulkCreateTobTrafficDrivingLinkResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        BulkCreateTobTrafficDrivingLinkResponse res = JSON.parseObject(response.getData(), BulkCreateTobTrafficDrivingLinkResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public BulkCreateTobTrafficDrivingPhoneResponse bulkCreateTobTrafficDrivingPhone(BulkCreateTobTrafficDrivingPhoneRequest request) throws Exception {
        RawResponse response = json("BulkCreateTobTrafficDrivingPhone", new ArrayList<>(), JSON.toJSONString(request));
        return bulkCreateTobTrafficDrivingPhoneResponse(response);
    }

    public BulkCreateTobTrafficDrivingPhoneResponse bulkCreateTobTrafficDrivingPhoneResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        BulkCreateTobTrafficDrivingPhoneResponse res = JSON.parseObject(response.getData(), BulkCreateTobTrafficDrivingPhoneResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public DeleteTobTrafficDrivingLinkResponse deleteTobTrafficDrivingLink(DeleteTobTrafficDrivingLinkRequest request) throws Exception {
        RawResponse response = json("DeleteTobTrafficDrivingLink", new ArrayList<>(), JSON.toJSONString(request));
        return deleteTobTrafficDrivingLinkResponse(response);
    }

    public DeleteTobTrafficDrivingLinkResponse deleteTobTrafficDrivingLinkResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteTobTrafficDrivingLinkResponse res = JSON.parseObject(response.getData(), DeleteTobTrafficDrivingLinkResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public DeleteTobTrafficDrivingPhoneResponse deleteTobTrafficDrivingPhone(DeleteTobTrafficDrivingPhoneRequest request) throws Exception {
        RawResponse response = json("DeleteTobTrafficDrivingPhone", new ArrayList<>(), JSON.toJSONString(request));
        return deleteTobTrafficDrivingPhoneResponse(response);
    }

    public DeleteTobTrafficDrivingPhoneResponse deleteTobTrafficDrivingPhoneResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteTobTrafficDrivingPhoneResponse res = JSON.parseObject(response.getData(), DeleteTobTrafficDrivingPhoneResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public GetRelationTemplateListResponse getRelationTemplateList(GetRelationTemplateListRequest request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPairV2(request);
        RawResponse response = json("ListRelationTemplate", urlParams, "");
        return getRelationTemplateListResponse(response);
    }

    public GetRelationTemplateListResponse getRelationTemplateListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetRelationTemplateListResponse res = JSON.parseObject(response.getData(), GetRelationTemplateListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public GetTobTrafficDrivingLinkListResponse getTobTrafficDrivingLinkList(GetTobTrafficDrivingLinkListRequest request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPairV2(request);
        RawResponse response = json("GetTobTrafficDrivingLinkList", urlParams, "");
        return getTobTrafficDrivingLinkListResponse(response);
    }

    public GetTobTrafficDrivingLinkListResponse getTobTrafficDrivingLinkListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTobTrafficDrivingLinkListResponse res = JSON.parseObject(response.getData(), GetTobTrafficDrivingLinkListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public GetTobTrafficDrivingPhoneListResponse getTobTrafficDrivingPhoneList(GetTobTrafficDrivingPhoneListRequest request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPairV2(request);
        RawResponse response = json("GetTobTrafficDrivingPhoneList", urlParams, "");
        return getTobTrafficDrivingPhoneListResponse(response);
    }

    public GetTobTrafficDrivingPhoneListResponse getTobTrafficDrivingPhoneListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTobTrafficDrivingPhoneListResponse res = JSON.parseObject(response.getData(), GetTobTrafficDrivingPhoneListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public UpdateTobTrafficDrivingPhoneResponse updateTobTrafficDrivingPhone(UpdateTobTrafficDrivingPhoneRequest request) throws Exception {
        RawResponse response = json("UpdateTobTrafficDrivingPhone", new ArrayList<>(), JSON.toJSONString(request));
        return updateTobTrafficDrivingPhoneResponse(response);
    }

    public UpdateTobTrafficDrivingPhoneResponse updateTobTrafficDrivingPhoneResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateTobTrafficDrivingPhoneResponse res = JSON.parseObject(response.getData(), UpdateTobTrafficDrivingPhoneResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public ApplySmsTemplateV2Response applySmsTemplateV2(ApplySmsTemplateV2Request request) throws Exception {
        RawResponse response = json("ApplySmsTemplateV2SDK", new ArrayList<>(), JSON.toJSONString(request));
        return applySmsTemplateV2Response(response);
    }

    public ApplySmsTemplateV2Response applySmsTemplateV2Response(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplySmsTemplateV2Response res = JSON.parseObject(response.getData(), ApplySmsTemplateV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public ListSmsTemplateV2Response listSmsTemplateV2(ListSmsTemplateV2Request request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPairV2(request);
        RawResponse response = json("ListSmsTemplateV2SDK", urlParams, "");
        return listSmsTemplateV2Response(response);
    }

    public ListSmsTemplateV2Response listSmsTemplateV2Response(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListSmsTemplateV2Response res = JSON.parseObject(response.getData(), ListSmsTemplateV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public BindTrafficDrivingParamsResponse bindTrafficDrivingParams(BindTrafficDrivingParamsRequest request) throws Exception {
        RawResponse response = json("BindTrafficDrivingParamsSDK", new ArrayList<>(), JSON.toJSONString(request));
        return bindTrafficDrivingParamsResponse(response);
    }

    public BindTrafficDrivingParamsResponse bindTrafficDrivingParamsResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        BindTrafficDrivingParamsResponse res = JSON.parseObject(response.getData(), BindTrafficDrivingParamsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public BindSignaturesResponse bindSignatures(BindSignaturesRequest request) throws Exception {
        RawResponse response = json("BindSignatures", new ArrayList<>(), JSON.toJSONString(request));
        return bindSignaturesResponse(response);
    }

    public BindSignaturesResponse bindSignaturesResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        BindSignaturesResponse res = JSON.parseObject(response.getData(), BindSignaturesResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public ListSecondTemplateResponse listSecondTemplate(ListSecondTemplateRequest request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPairV2(request);
        RawResponse response = json("ListSecondTemplate", urlParams, "");
        return listSecondTemplateResponse(response);
    }

    public ListSecondTemplateResponse listSecondTemplateResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListSecondTemplateResponse res = JSON.parseObject(response.getData(), ListSecondTemplateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    @Override
    public ListSubContentResponse listSubContent(ListSubContentRequest request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPairV2(request);
        RawResponse response = json("ListSubContent", urlParams, "");
        return listSubContentResponse(response);
    }

    public ListSubContentResponse listSubContentResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListSubContentResponse res = JSON.parseObject(response.getData(), ListSubContentResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }
}


