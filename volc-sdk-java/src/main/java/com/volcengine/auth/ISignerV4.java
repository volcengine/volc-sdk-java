package com.volcengine.auth;

import com.volcengine.model.Credentials;
import com.volcengine.model.RequestParam;
import com.volcengine.model.SignRequest;

/**
 * The interface Signer.
 */
public interface ISignerV4 {

    /**
     * Sign by request parameter
     *
     * @param requestParam the request parameter
     * @param credentials  the credentials
     * @return the sign request
     * @throws Exception the exception
     */
    SignRequest getSignRequest(RequestParam requestParam, Credentials credentials) throws Exception;
}
