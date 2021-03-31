package com.volcengine.service.livesaas.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.livesaas.request.CommonAPIRequest;
import com.volcengine.model.livesaas.request.CreateActivityAPIRequest;
import com.volcengine.model.livesaas.request.GetAdvertisementDataAPIRequest;
import com.volcengine.model.livesaas.response.*;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.LivesaasConfig;

import java.util.ArrayList;

public class LivesaasServiceImpl extends BaseServiceImpl implements LivesaasService {

    private LivesaasServiceImpl() {
        super(LivesaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LivesaasConfig.apiInfoList);
    }

    private LivesaasServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, LivesaasConfig.apiInfoList);
    }

    public static LivesaasService getInstance() {
        return new LivesaasServiceImpl();
    }

    public static LivesaasService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LivesaasConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Livesaas not support region " + region);
        }
        return new LivesaasServiceImpl(serviceInfo);
    }

    @Override
    public CreateActivityAPIResponse createActivityAPI(CreateActivityAPIRequest createActivityAPIRequest) throws Exception {
        RawResponse response = json(Const.CreateActivityAPI, new ArrayList<>(), JSON.toJSONString(createActivityAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateActivityAPIResponse res = JSON.parseObject(response.getData(), CreateActivityAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityAPIResponse getActivityAPI(CommonAPIRequest getActivityAPIRequest) throws Exception {
        RawResponse response = query(Const.GetActivityAPI, Utils.paramsToPair(getActivityAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityAPIResponse res = JSON.parseObject(response.getData(), GetActivityAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetStreamsAPIResponse getStreamsAPI(CommonAPIRequest getStreamsAPIRequest) throws Exception {
        RawResponse response = query(Const.GetStreamsAPI,  Utils.paramsToPair(getStreamsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetStreamsAPIResponse res = JSON.parseObject(response.getData(), GetStreamsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAdvertisementDataAPIResponse getAdvertisementDataAPI(GetAdvertisementDataAPIRequest getAdvertisementDataAPIRequest) throws Exception {
        RawResponse response = query(Const.GetAdvertisementDataAPI,  Utils.paramsToPair(getAdvertisementDataAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAdvertisementDataAPIResponse res = JSON.parseObject(response.getData(), GetAdvertisementDataAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetRealTimeOnlineNumberAPIResponse getRealTimeOnlineNumberAPI(CommonAPIRequest getRealTimeOnlineNumberAPIRequest) throws Exception {
        RawResponse response = query(Const.GetRealTimeOnlineNumberAPI,  Utils.paramsToPair(getRealTimeOnlineNumberAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetRealTimeOnlineNumberAPIResponse res = JSON.parseObject(response.getData(), GetRealTimeOnlineNumberAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

}
