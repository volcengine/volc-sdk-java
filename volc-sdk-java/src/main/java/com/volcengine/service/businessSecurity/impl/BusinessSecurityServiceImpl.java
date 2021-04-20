package com.volcengine.service.businessSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.AsyncRiskDetectionRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.RiskResultRequest;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.businessSecurity.BusinessSecurityConfig;
import com.volcengine.service.businessSecurity.BusinessSecurityService;

import java.util.ArrayList;

public class BusinessSecurityServiceImpl extends BaseServiceImpl implements BusinessSecurityService {
    private BusinessSecurityServiceImpl() {
        super(BusinessSecurityConfig.serviceInfo, BusinessSecurityConfig.apiInfoList);
    }

    public static BusinessSecurityService getInstance() {
        return new BusinessSecurityServiceImpl();
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
}
