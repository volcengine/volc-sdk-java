package com.volcengine.service.iam.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.iam.*;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.model.response.iam.ListUsersResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.iam.RoleGetResponse;
import com.volcengine.model.response.iam.RoleListResponse;
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

    @Override
    public RoleGetResponse createRole(RoleCreateRequest roleCreateRequest) throws Exception {
        RawResponse response = query(Const.CreateRole, Utils.mapToPairList(Utils.paramsToMap(roleCreateRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RoleGetResponse.class);
    }

    @Override
    public RoleGetResponse getRole(RoleGetRequest roleGetRequest) throws Exception {
        RawResponse response = query(Const.GetRole, Utils.mapToPairList(Utils.paramsToMap(roleGetRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RoleGetResponse.class);
    }

    @Override
    public RoleListResponse listRoles(RoleListRequest roleListRequest) throws Exception {
        RawResponse response = query(Const.ListRoles, Utils.mapToPairList(Utils.paramsToMap(roleListRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), RoleListResponse.class);
    }

    @Override
    public CommonResponse updateRole(RoleUpdateRequest roleUpdateRequest) throws Exception {
        RawResponse response = query(Const.UpdateRole, Utils.mapToPairList(Utils.paramsToMap(roleUpdateRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public CommonResponse deleteRole(RoleDeleteRequest roleDeleteRequest) throws Exception {
        RawResponse response = query(Const.DeleteRole, Utils.mapToPairList(Utils.paramsToMap(roleDeleteRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }
}