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
}
