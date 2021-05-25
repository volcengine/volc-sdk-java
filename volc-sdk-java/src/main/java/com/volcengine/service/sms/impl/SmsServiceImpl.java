package com.volcengine.service.sms.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.request.SmsBatchSendRequest;
import com.volcengine.model.request.SmsSendRequest;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.response.SmsSendResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.sms.SmsConfig;
import com.volcengine.service.sms.SmsService;

import java.util.ArrayList;

public class SmsServiceImpl extends BaseServiceImpl implements SmsService {

    private SmsServiceImpl() {
        super(SmsConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), SmsConfig.apiInfoList);
    }
    private SmsServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, SmsConfig.apiInfoList);
    }

    public static SmsService getInstance() {
        return new SmsServiceImpl();
    }

    public static SmsService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = SmsConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new SmsServiceImpl(serviceInfo);
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
        if(response.getCode() == SdkError.EHTTP.getNumber()){
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponse(response);
    }

    @Override
    public SmsSendResponse batchSend(SmsBatchSendRequest smsBatchSendRequest) throws Exception {
        RawResponse response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        if(response.getCode() == SdkError.EHTTP.getNumber()){
            response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        }
        return getSmsSendResponse(response);
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
}
