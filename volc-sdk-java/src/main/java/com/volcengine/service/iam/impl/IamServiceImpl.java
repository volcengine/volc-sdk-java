package com.volcengine.service.iam.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.iam.*;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.iam.*;
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
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) throws Exception {
        RawResponse response = query(Const.CreateUser, Utils.mapToPairList(Utils.paramsToMap(createUserRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateUserResponse.class);
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest) throws Exception {
        RawResponse response = query(Const.DeleteUser, Utils.mapToPairList(Utils.paramsToMap(deleteUserRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteUserResponse.class);
    }

    @Override
    public GetUserResponse getUser(GetUserRequest getUserRequest) throws Exception {
        RawResponse response = query(Const.GetUser, Utils.mapToPairList(Utils.paramsToMap(getUserRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetUserResponse.class);
    }

    @Override
    public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) throws Exception {
        RawResponse response = query(Const.UpdateUser, Utils.mapToPairList(Utils.paramsToMap(updateUserRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateUserResponse.class);
    }


    @Override
    public CreateLoginProfileResponse createLoginProfile(CreateLoginProfileRequest request) throws  Exception {
        RawResponse response = query(Const.CreateLoginProfile, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateLoginProfileResponse.class);
    }

    @Override
    public GetLoginProfileResponse getLoginProfile(GetLoginProfileRequest request) throws  Exception {
        RawResponse response = query(Const.GetLoginProfile, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetLoginProfileResponse.class);
    }

    @Override
    public UpdateLoginProfileResponse updateLoginProfile(UpdateLoginProfileRequest request) throws  Exception {
        RawResponse response = query(Const.UpdateLoginProfile, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateLoginProfileResponse.class);
    }

    @Override
    public CommonResponse deleteLoginProfile(DeleteLoginProfileRequest request) throws  Exception {
        RawResponse response = query(Const.DeleteLoginProfile, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
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

    @Override
    public CommonResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest req) throws  Exception {
        RawResponse response = query(Const.CreateServiceLinkedRole, Utils.mapToPairList(Utils.paramsToMap(req)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public CreateAccessKeyResponse createAccessKey(CreateAccessKeyRequest createAccessKeyRequest) throws  Exception {
        RawResponse response = query(Const.CreateAccessKey, Utils.mapToPairList(Utils.paramsToMap(createAccessKeyRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateAccessKeyResponse.class);
    }

    @Override
    public CommonResponse updateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest) throws  Exception {
        RawResponse response = query(Const.UpdateAccessKey, Utils.mapToPairList(Utils.paramsToMap(updateAccessKeyRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public CommonResponse deleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest) throws  Exception {
        RawResponse response = query(Const.DeleteAccessKey, Utils.mapToPairList(Utils.paramsToMap(deleteAccessKeyRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }


    @Override
    public ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest listAccessKeysRequest) throws  Exception {
        RawResponse response = query(Const.ListAccessKeys, Utils.mapToPairList(Utils.paramsToMap(listAccessKeysRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListAccessKeysResponse.class);
    }

    @Override
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws  Exception {
        RawResponse response = query(Const.CreatePolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreatePolicyResponse.class);
    }

    @Override
    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws  Exception {
        RawResponse response = query(Const.GetPolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetPolicyResponse.class);
    }

    @Override
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws  Exception {
        RawResponse response = query(Const.ListPolicies, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListPoliciesResponse.class);
    }

    @Override
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws  Exception {
        RawResponse response = query(Const.UpdatePolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdatePolicyResponse.class);
    }

    @Override
    public CommonResponse deletePolicy(DeletePolicyRequest request) throws  Exception {
        RawResponse response = query(Const.DeletePolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public CommonResponse attachUserPolicy(AttachUserPolicyRequest request) throws  Exception {
        RawResponse response = query(Const.AttachUserPolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public CommonResponse detachUserPolicy(DetachUserPolicyRequest request) throws  Exception {
        RawResponse response = query(Const.DetachUserPolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public ListAttachedUserPoliciesResponse listAttachedUserPolicies(ListAttachedUserPoliciesRequest request)
            throws  Exception {
        RawResponse response = query(Const.ListAttachedUserPolicies, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListAttachedUserPoliciesResponse.class);
    }

    @Override
    public CommonResponse attachRolePolicy(AttachRolePolicyRequest request) throws  Exception {
        RawResponse response = query(Const.AttachRolePolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public CommonResponse detachRolePolicy(DetachRolePolicyRequest request) throws  Exception {
        RawResponse response = query(Const.DetachRolePolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public ListAttachedRolePoliciesResponse listAttachedRolePolicies(ListAttachedRolePoliciesRequest request) throws  Exception {
        RawResponse response = query(Const.ListAttachedRolePolicies, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListAttachedRolePoliciesResponse.class);
    }

    @Override
    public ListEntitiesForPolicyResponse listEntitiesForPolicy(ListEntitiesForPolicyRequest request) throws  Exception {
        RawResponse response = query(Const.ListEntitiesForPolicy, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListEntitiesForPolicyResponse.class);
    }


    @Override
    public CreateSAMLProviderResponse createSAMLProvider(CreateSAMLProviderRequest request) throws Exception {
        RawResponse response = post(Const.CreateSAMLProvider,null,Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateSAMLProviderResponse.class);
    }

    @Override
    public CommonResponse deleteSAMLProvider(DeleteSAMLProviderRequest request) throws Exception {
        RawResponse response = query(Const.DeleteSAMLProvider, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CommonResponse.class);
    }

    @Override
    public GetSAMLProviderResponse getSAMLProvider(GetSAMLProviderRequest request) throws Exception {
        RawResponse response = query(Const.GetSAMLProvider, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetSAMLProviderResponse.class);
    }

    @Override
    public UpdateSAMLProviderResponse updateSAMLProvider(UpdateSAMLProviderRequest request) throws Exception {
        RawResponse response = query(Const.UpdateSAMLProvider, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateSAMLProviderResponse.class);
    }

    @Override
    public ListSAMLProvidersResponse listSAMLProviders(ListSAMLProvidersRequest request) throws Exception {
        RawResponse response = query(Const.ListSAMLProviders, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListSAMLProvidersResponse.class);
    }
}