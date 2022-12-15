package com.volcengine.service.iam;

import com.volcengine.model.request.iam.*;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.model.response.iam.*;
import com.volcengine.service.IBaseService;

/**
 * The interface Iam service.
 */
public interface IIamService extends IBaseService {
    /**
     * List users.
     *
     * @param listUsersRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    ListUsersResponse listUsers(ListUsersRequest listUsersRequest) throws Exception;

    /**
     * Create user.
     *
     * @param createUserRequest the request.
     * @return the response.
     * @throws Exception the exception.
     */
    CreateUserResponse createUser(CreateUserRequest createUserRequest) throws Exception;

    /**
     * Delete user.
     *
     * @param deleteUserRequest the request.
     * @return the response.
     * @throws Exception the exception.
     */
    DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest) throws Exception;

    /**
     * Get user.
     *
     * @param getUserRequest the request.
     * @return the response.
     * @throws Exception the exception.
     */
    GetUserResponse getUser(GetUserRequest getUserRequest) throws Exception;

    /**
     * Delete user.
     *
     * @param updateUserRequest the request.
     * @return the response.
     * @throws Exception the exception.
     */
     UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) throws Exception;


    CreateLoginProfileResponse createLoginProfile(CreateLoginProfileRequest request) throws  Exception;

    GetLoginProfileResponse getLoginProfile(GetLoginProfileRequest request) throws  Exception;

    UpdateLoginProfileResponse updateLoginProfile(UpdateLoginProfileRequest request) throws  Exception;

    CommonResponse deleteLoginProfile(DeleteLoginProfileRequest request) throws  Exception;

    /**
     * create role.
     *
     * @param roleCreateRequest the list users request
     * @return the create role response
     * @throws Exception the exception
     */
    RoleGetResponse createRole(RoleCreateRequest roleCreateRequest) throws Exception;

    /**
     * get role.
     *
     * @param roleGetRequest the list users request
     * @return the get role response
     * @throws Exception the exception
     */
    RoleGetResponse getRole(RoleGetRequest roleGetRequest) throws Exception;

    /**
     * List roles.
     *
     * @param roleListRequest the list users request
     * @return the list roles response
     * @throws Exception the exception
     */
    RoleListResponse listRoles(RoleListRequest roleListRequest) throws Exception;

    /**
     * Update roles.
     *
     * @param roleUpdateRequest the list users request
     * @return the update role response
     * @throws Exception the exception
     */
    CommonResponse updateRole(RoleUpdateRequest roleUpdateRequest) throws Exception;

    /**
     * Delete roles.
     *
     * @param roleDeleteRequest the list users request
     * @return the delete role response
     * @throws Exception the exception
     */
    CommonResponse deleteRole(RoleDeleteRequest roleDeleteRequest) throws Exception;

    /**
     * CreateServiceLinkedRole
     * @param req roleDeleteRequest
     * @return the response
     * @throws Exception the exception
     */
    CommonResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest req) throws Exception;

    /**
     * Create accessKey.
     *
     * @param createAccessKeyRequest the request.
     * @return the response
     * @throws Exception the exception
     */
    CreateAccessKeyResponse createAccessKey(CreateAccessKeyRequest createAccessKeyRequest) throws  Exception;

    /**
     * Update accessKey.
     *
     * @param updateAccessKeyRequest the request.
     * @return the response
     * @throws Exception the exception
     */
    CommonResponse updateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest) throws  Exception;

    /**
     * Delete accessKey.
     *
     * @param deleteAccessKeyRequest the request.
     * @return the response
     * @throws Exception the exception
     */
    CommonResponse deleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest) throws  Exception;

    /**
     * List AccessKeys.
     *
     * @param listAccessKeysRequest the request.
     * @return the response
     * @throws Exception the exception
     */
    ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest listAccessKeysRequest) throws  Exception;


    CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws  Exception;

    GetPolicyResponse getPolicy(GetPolicyRequest request) throws  Exception;

    ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws  Exception;

    UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws  Exception;

    CommonResponse deletePolicy(DeletePolicyRequest request) throws  Exception;

    CommonResponse attachUserPolicy(AttachUserPolicyRequest request) throws  Exception;

    CommonResponse detachUserPolicy(DetachUserPolicyRequest request) throws  Exception;

    ListAttachedUserPoliciesResponse listAttachedUserPolicies(ListAttachedUserPoliciesRequest request)
            throws  Exception;

    CommonResponse attachRolePolicy(AttachRolePolicyRequest request) throws  Exception;

    CommonResponse detachRolePolicy(DetachRolePolicyRequest request) throws  Exception;

    ListAttachedRolePoliciesResponse listAttachedRolePolicies(ListAttachedRolePoliciesRequest request) throws  Exception;

    ListEntitiesForPolicyResponse listEntitiesForPolicy(ListEntitiesForPolicyRequest request) throws  Exception;

    CreateSAMLProviderResponse createSAMLProvider(CreateSAMLProviderRequest request) throws Exception;

    CommonResponse deleteSAMLProvider(DeleteSAMLProviderRequest request) throws Exception;

    GetSAMLProviderResponse getSAMLProvider(GetSAMLProviderRequest request) throws Exception;

    UpdateSAMLProviderResponse updateSAMLProvider(UpdateSAMLProviderRequest request) throws Exception;

    ListSAMLProvidersResponse listSAMLProviders(ListSAMLProvidersRequest request) throws Exception;
}
