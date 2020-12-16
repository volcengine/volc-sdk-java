package com.volcengine.service.iam;

import com.volcengine.model.request.ListUsersRequest;
import com.volcengine.model.response.ListUsersResponse;
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
}
