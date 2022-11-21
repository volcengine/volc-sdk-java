package com.volcengine.service.numberpool.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.numberpool.NumberPoolConfig;
import com.volcengine.service.numberpool.NumberPoolService;
import com.volcengine.service.numberpool.request.NumberListRequest;
import com.volcengine.service.numberpool.request.NumberPoolListRequest;
import com.volcengine.service.numberpool.response.NumberListResponse;
import com.volcengine.service.numberpool.response.NumberPoolListResponse;

public class NumberPoolServiceImpl extends BaseServiceImpl implements NumberPoolService {

    protected NumberPoolServiceImpl() {
        super(NumberPoolConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), NumberPoolConfig.apiInfoList);
    }

    public static NumberPoolServiceImpl getInstance() {
        return new NumberPoolServiceImpl();
    }

    @Override
    public NumberPoolListResponse queryNumberPoolList(NumberPoolListRequest request) throws Exception {
        RawResponse response = query("NumberPoolList", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), NumberPoolListResponse.class);
    }

    @Override
    public NumberListResponse queryNumberList(NumberListRequest request) throws Exception {
        RawResponse response = query("NumberList", Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), NumberListResponse.class);
    }
}
