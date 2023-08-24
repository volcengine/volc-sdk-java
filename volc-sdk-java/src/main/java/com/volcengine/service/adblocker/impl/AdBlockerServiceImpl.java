package com.volcengine.service.adblocker.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.request.AdBlockerRequest;
import com.volcengine.model.response.AdBlockerResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.adblocker.AdBlockerConfig;
import com.volcengine.service.adblocker.AdBlockerService;
import com.volcengine.service.businessSecurity.impl.BusinessSecurityServiceImpl;

import java.util.ArrayList;

public class AdBlockerServiceImpl extends BaseServiceImpl implements AdBlockerService {
    private AdBlockerServiceImpl() {
        super(AdBlockerConfig.serviceInfo, AdBlockerConfig.apiInfoList);
    }

    private static final AdBlockerServiceImpl adBlockerInstance = new AdBlockerServiceImpl();

    public static AdBlockerService getInstance() {
        return adBlockerInstance;
    }

    @Override
    public AdBlockerResponse AdBlock(AdBlockerRequest adBlockerRequest) throws Exception {
        RawResponse response = json(Const.AdBlock, new ArrayList<>(), JSON.toJSONString(adBlockerRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }


        return JSON.parseObject(response.getData(), AdBlockerResponse.class);
    }
}
