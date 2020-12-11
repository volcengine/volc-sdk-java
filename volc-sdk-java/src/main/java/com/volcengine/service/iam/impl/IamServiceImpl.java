package com.volcengine.service.iam.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.ListUsersRequest;
import com.volcengine.model.response.ListUsersResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.IamConfig;


public class IamServiceImpl extends BaseServiceImpl implements IIamService {

    private IamServiceImpl() {
        super(IamConfig.serviceInfo, IamConfig.apiInfoList);
    }

    public static IIamService getInstance() {
        return new IamServiceImpl();
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest listUsersRequest) throws Exception {
        RawResponse response = query(Const.ListUsers, Utils.mapToPairList(Utils.paramsToMap(listUsersRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListUsersResponse.class);
    }
}