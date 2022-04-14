package com.volcengine.service.businessSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.businessSecurity.BusinessSecurityConfig;
import com.volcengine.service.businessSecurity.BusinessSecurityService;

import java.util.ArrayList;

public class BusinessSecurityServiceImpl extends BaseServiceImpl implements BusinessSecurityService {
    private BusinessSecurityServiceImpl() {
        super(BusinessSecurityConfig.serviceInfo, BusinessSecurityConfig.apiInfoList);
    }

    private static final BusinessSecurityServiceImpl businessSecurityInstance = new BusinessSecurityServiceImpl();

    public static BusinessSecurityService getInstance() {
        return businessSecurityInstance;
    }

    @Override
    public RiskDetectionResponse RiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.RiskDetection, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }


        return JSON.parseObject(response.getData(), RiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncRiskDetection(AsyncRiskDetectionRequest asyncRiskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncRiskDetection, new ArrayList<>(), JSON.toJSONString(asyncRiskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public RiskResultResponse RiskResult(RiskResultRequest riskResultRequest) throws Exception {
        RawResponse response = query(Const.RiskResult, Utils.mapToPairList(Utils.paramsToMap(riskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RiskResultResponse.class);
    }

    @Override
    public DataReportResponse DataReport(DataReportRequest dataReportRequest) throws Exception {
        RawResponse response = json(Const.DataReport, new ArrayList<>(), JSON.toJSONString(dataReportRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DataReportResponse.class);
    }

    @Override
    public RiskDetectionResponse AccountRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AccountRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RiskDetectionResponse.class);
    }

    @Override
    public MobileStatusResponse MobileStatus(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.MobileStatus, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), MobileStatusResponse.class);
    }

    @Override
    public MobileStatusResponseV2 MobileStatusV2(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.MobileStatusV2, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), MobileStatusResponseV2.class);
    }

    @Override
    public ElementVerifyResponse ElementVerify(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.ElementVerify, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ElementVerifyResponse.class);
    }

    @Override
    public ElementVerifyResponseV2 ElementVerifyV2(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.ElementVerifyV2, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ElementVerifyResponseV2.class);
    }
}
