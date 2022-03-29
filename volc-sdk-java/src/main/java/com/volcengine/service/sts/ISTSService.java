package com.volcengine.service.sts;

import com.volcengine.model.request.AssumeRoleRequest;
import com.volcengine.model.response.AssumeRoleResponse;
import com.volcengine.service.IBaseService;

/**
 * The interface STS service.
 */
public interface ISTSService extends IBaseService {
    /**
     * Assume Role.
     *
     * @param assumeRoleRequest the assume role request
     * @return the assume role response
     * @throws Exception the exception
     */
    AssumeRoleResponse assumeRole(AssumeRoleRequest assumeRoleRequest) throws Exception;

}
