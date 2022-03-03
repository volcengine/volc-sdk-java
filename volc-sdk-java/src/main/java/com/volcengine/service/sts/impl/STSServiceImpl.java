package com.volcengine.service.sts.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.AssumeRoleRequest;
import com.volcengine.model.response.AssumeRoleResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.sts.ISTSService;
import com.volcengine.service.sts.STSConfig;


public class STSServiceImpl extends BaseServiceImpl implements ISTSService {

    private STSServiceImpl() {
        super(STSConfig.serviceInfo, STSConfig.apiInfoList);
    }

    public static STSServiceImpl getInstance() {
        return new STSServiceImpl();
    }

    @Override
    public AssumeRoleResponse assumeRole(AssumeRoleRequest assumeRoleRequest) throws Exception {
        RawResponse response = query(Const.AssumeRole, Utils.mapToPairList(Utils.paramsToMap(assumeRoleRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AssumeRoleResponse.class);
    }
}
