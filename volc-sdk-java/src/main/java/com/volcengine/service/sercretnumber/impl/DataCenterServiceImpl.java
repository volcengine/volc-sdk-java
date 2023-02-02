package com.volcengine.service.sercretnumber.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.sercretnumber.DataCenterConfig;
import com.volcengine.service.sercretnumber.IDataCenterService;
import com.volcengine.service.sercretnumber.model.request.QueryAudioRecordFileUrlRequest;
import com.volcengine.service.sercretnumber.model.request.QueryAudioRecordToTextFileRequest;
import com.volcengine.service.sercretnumber.model.request.QueryCallRecordRequest;
import com.volcengine.service.sercretnumber.model.response.QueryAudioRecordFileUrlResponse;
import com.volcengine.service.sercretnumber.model.response.QueryAudioRecordToTextFileResponse;
import com.volcengine.service.sercretnumber.model.response.QueryCallRecordMsgResponse;
import org.apache.http.NameValuePair;

import java.util.Collections;
import java.util.List;

public class DataCenterServiceImpl extends BaseServiceImpl implements IDataCenterService {

    protected DataCenterServiceImpl() {
        super(DataCenterConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), DataCenterConfig.apiInfoList);
    }

    public static DataCenterServiceImpl getInstance() {
        return new DataCenterServiceImpl();
    }

    @Override
    public QueryCallRecordMsgResponse queryCallRecordMsg(QueryCallRecordRequest request) throws Exception {
        RawResponse response = formPost("QueryCallRecordMsg", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QueryCallRecordMsgResponse.class);
    }

    @Override
    public QueryAudioRecordFileUrlResponse queryAudioRecordFileUrl(QueryAudioRecordFileUrlRequest request) throws Exception {
        RawResponse response = formPost("QueryAudioRecordFileUrl", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QueryAudioRecordFileUrlResponse.class);
    }

    @Override
    public QueryAudioRecordToTextFileResponse queryAudioRecordToTextFile(QueryAudioRecordToTextFileRequest request) throws Exception {
        RawResponse response = formPost("QueryAudioRecordToTextFileUrl", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), QueryAudioRecordToTextFileResponse.class);
    }


    private RawResponse formPost(String api, List<NameValuePair> nameValuePairs) {
        return post(api, Collections.emptyList(), nameValuePairs);
    }
}
