package com.volcengine.service.contentSecurity;

import com.volcengine.model.request.SecuritySourceRequest;
import com.volcengine.model.response.SecuritySourceResponse;
import com.volcengine.service.IBaseService;

import java.util.stream.Stream;

public interface SecuritySourceService extends IBaseService {


    /**
     * get security source
     * @param securitySourceRequest security source request
     * @return security source response
     * @throws Exception the exception
     */
    SecuritySourceResponse getSecuritySource(SecuritySourceRequest securitySourceRequest) throws Exception;


    /**
     * get security source stream
     * @param securitySourceRequest security source request
     * @return security source response
     * @throws SecuritySourceException the exception
     */
    Stream<SecuritySourceResponse> getSecuritySourceStream(SecuritySourceRequest securitySourceRequest) throws SecuritySourceException;
}
