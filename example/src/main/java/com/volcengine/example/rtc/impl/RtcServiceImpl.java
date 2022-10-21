package com.volcengine.example.rtc.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.example.rtc.RtcConfig;
import com.volcengine.example.rtc.RtcService;
import com.volcengine.example.rtc.model.*;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;

public class RtcServiceImpl extends BaseServiceImpl implements RtcService {
    private RtcServiceImpl() { super(RtcConfig.serviceInfo, RtcConfig.apiInfoList); }

    private static final RtcServiceImpl rtcServiceImplInstance = new RtcServiceImpl();

    public static RtcService getInstance() {
        return rtcServiceImplInstance;
    }
    
    
    @Override
    public StartRecordResponse startRecord(StartRecordRequest startRecordRequest) throws Exception {
        RawResponse response = json("StartRecord", null, JSON.toJSONString(startRecordRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), StartRecordResponse.class);
    }

    @Override
    public StopRecordResponse stopRecord(StopRecordRequest stopRecordRequest) throws Exception {
        RawResponse response = json("StopRecord",null, JSON.toJSONString(Utils.paramsToMap(stopRecordRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), StopRecordResponse.class);
    }

    @Override
    public GetRecordTaskResponse getRecordTask(GetRecordTaskRequest getRecordTaskRequest) throws Exception {
        RawResponse response = query("GetRecordTask", Utils.mapToPairList(Utils.paramsToMap(getRecordTaskRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetRecordTaskResponse.class);
    }
}