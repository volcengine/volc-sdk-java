package com.volcengine.service.cloudtrail.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.cloudtrail.*;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.cloudtrail.LookupEventsResponse;

import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.cloudtrail.ICloudTrailService;
import com.volcengine.service.cloudtrail.CloudTrailConfig;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import java.util.*;

public class CloudTrailServiceImpl extends BaseServiceImpl implements ICloudTrailService {

    private CloudTrailServiceImpl() {
        super(CloudTrailConfig.serviceInfo, CloudTrailConfig.apiInfoList);
    }

    public static ICloudTrailService getInstance() {
        return new CloudTrailServiceImpl();
    }

    private RawResponse commonHandlerQuery(String api, List<NameValuePair> params) throws Exception {
        RawResponse response = query(api, params);
        return response;
    }

    private RawResponse commonHandlerJson(String api, List<NameValuePair> params, String reqBody) throws Exception {
        RawResponse response = json(api, params, reqBody);
        return response;
    }

    @Override
    public LookupEventsResponse lookupEvents(LookupEventsRequest lookupEventsRequest) throws Exception {
        List<NameValuePair> query = new ArrayList<>();
        String reqBody = JSON.toJSONString(lookupEventsRequest);

        RawResponse response = commonHandlerJson(Const.LookupEvents, query, reqBody);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), LookupEventsResponse.class);
    }

}