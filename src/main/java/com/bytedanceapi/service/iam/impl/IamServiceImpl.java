package com.bytedanceapi.service.iam.impl;

import com.alibaba.fastjson.JSON;
import com.bytedanceapi.error.SdkError;
import com.bytedanceapi.helper.Const;
import com.bytedanceapi.helper.Utils;
import com.bytedanceapi.model.request.ListUsersRequest;
import com.bytedanceapi.model.response.ListUsersResponse;
import com.bytedanceapi.model.response.RawResponse;
import com.bytedanceapi.service.BaseServiceImpl;
import com.bytedanceapi.service.iam.IIamService;
import com.bytedanceapi.service.iam.IamConfig;


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

        ListUsersResponse listUsersResponse = JSON.parseObject(response.getData(), ListUsersResponse.class);
        listUsersResponse.getResponseMetadata().setService("vod");
        return listUsersResponse;
    }
}