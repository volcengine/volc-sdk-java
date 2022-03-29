package com.volcengine.service.rtc.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;

import com.volcengine.model.request.ListRoomsRequest;
import com.volcengine.model.response.ListRoomsResponse;

import com.volcengine.model.request.ListIndicatorsRequest;
import com.volcengine.model.response.ListIndicatorsResponse;

import com.volcengine.service.rtc.RtcConfig;
import com.volcengine.service.rtc.RtcService;

public class RtcServiceImpl extends BaseServiceImpl implements RtcService {
    private RtcServiceImpl() { super(RtcConfig.serviceInfo, RtcConfig.apiInfoList); }

    private static final RtcServiceImpl rtcServiceImplInstance = new RtcServiceImpl();

    public static RtcService getInstance() {
        return rtcServiceImplInstance;
    }
    
    
    @Override
    public ListRoomsResponse listRooms(ListRoomsRequest listRoomsRequest) throws Exception {
        RawResponse response = query(Const.ListRooms, Utils.mapToPairList(Utils.paramsToMap(listRoomsRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListRoomsResponse.class);
    }
    
    
    @Override
    public ListIndicatorsResponse listIndicators(ListIndicatorsRequest listIndicatorsRequest) throws Exception {
        RawResponse response =  json(Const.ListIndicators, null, JSON.toJSONString(listIndicatorsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), ListIndicatorsResponse.class);
    }
    
}