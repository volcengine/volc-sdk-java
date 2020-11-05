package com.bytedanceapi.service.iam;

import com.bytedanceapi.model.request.ListUsersRequest;
import com.bytedanceapi.model.response.ListUsersResponse;
import com.bytedanceapi.service.IBaseService;

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
