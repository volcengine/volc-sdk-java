package com.volcengine.service.livesaas.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.livesaas.request.*;
import com.volcengine.model.livesaas.response.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.livesaas.LivesaasConfig;
import com.volcengine.service.livesaas.LivesaasService;

import java.net.Proxy;
import java.util.ArrayList;

public class LivesaasServiceImpl extends BaseServiceImpl implements LivesaasService {

    private LivesaasServiceImpl() {
        super(LivesaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LivesaasConfig.apiInfoList);
    }

    private LivesaasServiceImpl(Proxy proxy) {
        super(LivesaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, LivesaasConfig.apiInfoList);
    }

    private LivesaasServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, LivesaasConfig.apiInfoList);
    }

    public static LivesaasService getInstance() {
        return new LivesaasServiceImpl();
    }

    public static LivesaasService getInstance(Proxy proxy) {
        return new LivesaasServiceImpl(proxy);
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

    @Override
    public DeleteActivityAPIResponse deleteActivityAPI(CommonAPIRequest deleteActivityAPIRequest) throws Exception {
        RawResponse response = json(Const.DeleteActivityAPI, new ArrayList<>(), JSON.toJSONString(deleteActivityAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteActivityAPIResponse res = JSON.parseObject(response.getData(), DeleteActivityAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityBasicConfigAPIResponse getActivityBasicConfigAPI(CommonAPIRequest getActivityBasicConfigAPIRequest) throws Exception {
        RawResponse response = query(Const.GetActivityBasicConfigAPI, Utils.paramsToPair(getActivityBasicConfigAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityBasicConfigAPIResponse res = JSON.parseObject(response.getData(), GetActivityBasicConfigAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityBasicConfigAPIResponse updateActivityBasicConfigAPI(UpdateActivityBasicConfigAPIRequest updateActivityBasicConfigAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityBasicConfigAPI, new ArrayList<>(), JSON.toJSONString(updateActivityBasicConfigAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityBasicConfigAPIResponse res = JSON.parseObject(response.getData(), UpdateActivityBasicConfigAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UploadLibAPIResponse uploadLibAPI(UploadLibAPIRequest uploadLibAPIRequest) throws Exception {
        RawResponse response = json(Const.UploadLibAPI, new ArrayList<>(), JSON.toJSONString(uploadLibAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UploadLibAPIResponse res = JSON.parseObject(response.getData(), UploadLibAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityMenuAPIResponse getActivityMenuAPI(GetActivityMenuAPIRequest getActivityMenuAPIRequest) throws Exception {
        RawResponse response = query(Const.GetActivityMenuAPI, Utils.paramsToPair(getActivityMenuAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityMenuAPIResponse res = JSON.parseObject(response.getData(), GetActivityMenuAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityMenuAPIResponse updateActivityMenuAPI(UpdateActivityMenuAPIRequest updateActivityMenuAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityMenuAPI, new ArrayList<>(), JSON.toJSONString(updateActivityMenuAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityMenuAPIResponse res = JSON.parseObject(response.getData(), UpdateActivityMenuAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityProductAPIResponse getActivityProductAPI(CommonAPIRequest getActivityProductAPIRequest) throws Exception {
        RawResponse response = query(Const.GetActivityProductAPI, Utils.paramsToPair(getActivityProductAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityProductAPIResponse res = JSON.parseObject(response.getData(), GetActivityProductAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityProductAPIResponse updateActivityProductAPI(UpdateActivityProductAPIRequest updateActivityProductAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityProductAPI, new ArrayList<>(), JSON.toJSONString(updateActivityProductAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityProductAPIResponse res = JSON.parseObject(response.getData(), UpdateActivityProductAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListActivityDetailStatusAPIResponse listActivityDetailStatusAPI(ListActivityDetailStatusAPIRequest listActivityDetailStatusAPIRequest) throws Exception {
        RawResponse response = json(Const.ListActivityDetailStatusAPI, new ArrayList<>(), JSON.toJSONString(listActivityDetailStatusAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListActivityDetailStatusAPIResponse res = JSON.parseObject(response.getData(), ListActivityDetailStatusAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

}
